package day1213;

public class Ex11For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 반복해서 출력하기");
		for(int i=65;i<=90;i++)
			System.out.print((char)i);
		System.out.println();
		for(char ch='A';ch<='Z';ch++)
			System.out.print(ch);
		System.out.println();
		//Z부터A까지 거꾸로 출력해보세요
		for(int i=90;i>=65;i--)
			System.out.print((char)i);
		System.out.println();
	}

}
