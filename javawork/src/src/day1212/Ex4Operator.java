package day1212;

public class Ex4Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 관계연산자(>,<,>=,<=,==,!=), 논리 연산자(&&,||,!) => 결과값은 무조건 boolean(true,false)
		int kor=89, eng=100, mat=89;
		boolean f=false;
	
	    System.out.println(kor>eng);
	    System.out.println(kor<eng);
	    System.out.println(kor==eng);
	    System.out.println(kor!=eng);
	    System.out.println(kor>eng && ++eng>mat);// false && true : 1번째 조건이 false일 경우 두번쨰 조건은 비교하지 않는다.
	    System.out.println(eng);
	    System.out.println(kor>eng || ++eng>mat);//false || true : 1번째 조건이 true일 경우 두번째 조건은 비교하지 않는다.
	    System.out.println(eng);//1증가되어있음..
	    System.out.println(!(kor>eng));
	    System.out.println(!f);
	    
	}

}
