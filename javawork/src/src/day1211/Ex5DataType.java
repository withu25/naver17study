package day1211;

public class Ex5DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //자바에서 char타입은 2byte
		char ch1='A';
        char ch2='가';
        System.out.println("ch1="+ch1);
        System.out.println("ch2="+ch2);
        
        //Printf로 출력시 변환기호 1글자 : %c, 문자열 :%s
        System.out.printf("ch1=%c\tch2=%c\n", ch1,ch2);
        System.out.printf("ch1=%d\tch2=%d\n", (int)ch1,(int)ch2); //ascii code로 변환출력
        
        int a=65;
        System.out.println(a);
        System.out.println(a+32);
        System.out.println((char)a);
        System.out.println((char)(a+32));
        
        System.out.printf("%c,%c,%c,%c\n",a,a+3,a+34,a+50);
        //ascii code를 통한 Hello 출력
        System.out.printf("%c %c %c %c %c\n", 72,101,108,108,111);
	}

}
