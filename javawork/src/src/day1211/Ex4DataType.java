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
        
        //2024-12-11로 출력되는 형식
        System.out.println(year+"-"+month+"-"+day);
        
        //printf를 이용한 출력 : 정수는 변환기호가 %d
        System.out.printf("%d-%d-%d\n", year,month,day);
        
        //2024-05-03 출력형식
        System.out.println(year2+"-"+month2+"-"+day2);
        System.out.printf("%d-%02d-%02d\n",year2,month2,day2);//%02d : 2자리보다 작을 경우 남는곳은 0으로 표기
        
        int money=2356000;
        System.out.printf("이번달 급여=%9d원\n", money);
        System.out.printf("이번달 급여=%-7d원\n",money); //-는 왼쪽부터 출력(남는공백은 뒤로)
        
	}

}
