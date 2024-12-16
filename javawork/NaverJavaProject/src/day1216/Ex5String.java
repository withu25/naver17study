package day1216;

public class Ex5String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("String 클래스의 맴버 메소드에 대한 공부");
        String str1="Apple";
        String str2="Have a Nice Day!!";
        String str3="Orange";
        String str4=new String("Apple");
        
        System.out.println("str1="+str1);
        System.out.println("str2="+str2);
        System.out.println("str3="+str3);
        
        System.out.println("str2의 길이 : "+str2.length());
        System.out.println("str1의 0번글자 : "+str1.charAt(0));
        System.out.println("str1의 0번글자 : "+str2.charAt(3));
        System.out.println("str1의 0번글자 : "+str3.charAt(1));
        
        System.out.println();
        System.out.println("str1에서 l의 위치는 :"+str1.indexOf('l'));//3
        System.out.println("str2에서 a의 위치는 :"+str2.indexOf('a'));//1 : 첫번째 a의 위치
        System.out.println("str2에서 마지막 a의 위치는 :"+str2.lastIndexOf('a'));//13
        System.out.println("str1에서 x의 위치는 :"+str3.indexOf('x'));//해당 문자가 없을경우는 -1이 발생
        System.out.println();
        
        //객체타입에서는 == 동등연산자가 주소를 비교하는 연산자
        System.out.println(str1==str4);
        System.out.println(str3=="Orange");
        System.out.println(str1=="apple");
        
        //문자열 정확한 비교를 위해선 equals 사용
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals("apple"));//대소문자가 다 맞아야 true
        System.out.println(str1.equalsIgnoreCase("apple"));//대소문자 상관없이 철자만 맞으면 true
        System.out.println(str1.equalsIgnoreCase("apPLE"));//대소문자 상관없이 철자만 맞으면 true
        
        System.out.println("문자열 비교 - compareTo");
        int n=str1.compareTo("Apple");
        System.out.println(n);//0 : 대소문자까지 같을경우
        
        n=str1.compareTo("Banana");
        System.out.println(n);//문자열1이 문자열2보다 작을경우 마이너스값 -1:'A'하고 'B'하고 비교
        
        n=str3.compareTo(str1);//"Orange","Apple"를 비교 'O','A'
        System.out.println(n);//14 : 알파벳 순서가 거꾸로 되어있을경우 양수값 14
        
        System.out.println();
        System.out.println("str2를 모두 대문자로 변환 : "+str2.toUpperCase());
        System.out.println("str2를 모두 대문자로 변환 : "+str2.toLowerCase());
        
        System.out.println();
        System.out.println("str2가 Have로 시작하면 true:"+str2.startsWith("Have"));
        System.out.println("str2가 Have로 시작하면 true:"+str2.startsWith("Happy"));
        
        System.out.println("str2가 Day!!로 끝나면 true:"+str2.endsWith("Day!!"));//true
        System.out.println("str2가 Day!로 끝나면 true:"+str2.endsWith("Day!"));//true
        
        System.out.println("=".repeat(50));
        System.out.println(str2.repeat(3));
        System.out.println("*".repeat(50));
        
        System.out.println(str2.replace("a", "*"));
        System.out.println(str2.replace("Nice","Happy"));
        System.out.println();
        System.out.println(str2.substring(7));//7번 인텍스부터 끝까지 추출
        System.out.println(str2.substring(7, 10));//7~9까지 추출
        
        System.out.println("split 으로 문자열 분리(배열)");
        String str5="red,green,blue,yellow,gray,black";
        System.out.println("str5="+str5);
        String []array=str5.split(",");
        //배열출력
        for(String a:array)
        	System.out.println(a);
        
        String str6="  Hello  ";
        System.out.println("*"+str6+"*");
        System.out.println("*"+str6.trim()+"*");//trim():앞뒤 공백제거 후 반환
        System.out.println();
        System.out.println("String.valueOf : 다양한 타입의 데이터를 String 타입으로 변환");
        String s1=String.valueOf(100);
        String s2=String.valueOf(true);
        String s3=String.valueOf(34.6);
        String s4=String.valueOf('A');
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
	}

}
