package day1211;

public class Ex4DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2024;
		int month=12;
		int day=11;
		
		int year2=2024;
		int month2=5;
		int day2=3;
		
		//2024-12-11 이런형식으로 출력해보자
		System.out.println(year+"-"+month+"-"+day);
		
		//printf 를 이용해서 위와같이 출력해보자 : 정수는 변환기호가 %d
		System.out.printf("%d-%d-%d\n",year,month,day);		
		
		System.out.println(year2+"-"+month2+"-"+day2);//2024-5-3
		//2024-05-03 이렇게 나오게 출력해보자
		System.out.printf("%d-%02d-%02d\n",year2,month2,day2);//%02d : 2자리보다 작을경우 남는곳은 0으로 표기
		
		int money=2356000;
		System.out.printf("이번달 급여=%10d원\n",money);
		System.out.printf("이번달 급여=%-10d원\n",money);//-는 왼쪽부터 출력(남는공백은 뒤로감)

	}

}











