package day1212;

public class Ex20perator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //산술 연산자 +,-,*,/,%
		
		int su1=10;
		int su2=4;
		
		System.out.println(su1+su2);
		System.out.println(su1-su2);
		System.out.println(su1*su2);
		System.out.println(su1/su2);//몫->묵시적 형변환에 의해 결과가 int타입 -> 정확한 계산을 위해선 double사용하기
		System.out.println(su1%su2);//나머지
		System.out.println((double)su1/su2);//정확한 계산용
		System.out.println(su1/(double)su2);//정확한 계산용
		System.out.println("---------------------");
		int money=3456789;
		System.out.println("금액 : "+money+"원");
		System.out.println("만원 : "+money/10000+"장");
		System.out.println("천원 : "+money%10000/1000+"장");
		System.out.println("백원 : "+money%1000/100+"개");
		System.out.println("십원 : "+money%100/10+"개");
	}

}
