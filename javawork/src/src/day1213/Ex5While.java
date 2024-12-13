package day1213;

public class Ex5While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        //while은 조건이 맞지 않으면 실행하지 않음.
        while(a<10) {
        	System.out.println("while loop");
        }
	    //do~while은 일단 한번 실행 후 조건을 비교하므로 조건이 맞지 않아도 최소한 한번 실행
	    do {
	    	System.out.println("do~while loop");
	    }while(a<10);
	    
	    a=1;
	    while(a<=10) {
	    	System.out.printf("%3d",a++);
	    	if(a>10)
	    		break;
	    }
	    System.out.println();
	    a=0;
	    while(a<10) {
	    	System.out.printf("%3d",++a);
	    }
	    System.out.println();
	    a=0;
	    while(a<10) {
	    	System.out.printf("%3d",++a);
	    }
	    System.out.println();
	    a=1;
	    do {
	    	System.out.printf("%3d", a++);
	    }while(a<=10);
	    
	}

}
