package day1212;

import java.util.Date;

public class Ex6Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //현재 날짜와 시간을 얻어보자
		//Date 클래스는 jdk1.1이후에 deprecate로 변경 - Calendar를 권장
		Date today=new Date();
	    
		int curYear=today.getYear()+1900;//1900을 뺀값으로 반환함
		int curMonth=today.getMonth()+1;//0~11로 반환해서 +1해야함
		int curDate=today.getDate();
		
		
		System.out.println("현재년도:"+curYear+"년");
		System.out.println("현재월:"+curMonth+"월");
		System.out.println("현재일:"+curDate+"일");
		
		System.out.println(today.getHours()+"시"+today.getMinutes()+"분");
		
		//요일 숫자 구하기(0~6 : 일~토)
		int weekDay=today.getDay();
		System.out.println(weekDay);
		
		//예제 : 오늘은 목요일입니다.
		String week=weekDay==0?"일":weekDay==1?"월":weekDay==2?"화":weekDay==3?"수":weekDay==4?"목":weekDay==5?"금":"토";
				
		
		System.out.println("오늘은 "+week+"요일입니다.");
	}

}
