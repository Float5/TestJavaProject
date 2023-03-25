package loop;

public class Break1 {
	public static void main(String[] args) {
		//break는 반복문을 강제종료
		
		while(true) {
			System.out.println("시작");
			
			if(true) {
				break; //while끝냄
			}
			System.out.println("DeadCode");
		}
		
		for(int i = 0; i <= 10; i++)
		{
			if(i > 3)
			{
				break;
			}
			
			System.out.println(i);
		}
	}
}
