package day1216;

public class Ex4ForLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Loop:
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=4;j++)
				{
//					if(i==2)
//						continue Loop;//i++로 이동, i가 2인경우는 출력안함
//					if(j==3)
//						continue Loop;//i++로 이동, j가 1,2만 출력
					if(j==3)
						break;//위와 같음
					if(j==3)
						break Loop;//j가 3이 되면 바깥쪽 for문으로 빠져나가므로 종료됨!
					
					System.out.println("i="+i+",j="+j);
				}
			}
	}

}
