package loop;

public class While2 {
	public static void main(String[] args) {
		//반복문 : 유사한 코드를 자동 수행하기 위해 사용한다
		int i = 0;
		int count = 10000;
		
		while(i < count)
		{
			System.out.println("안녕");
			i++;
		}
		
		int flag = 0;
		while(flag < 15)
		{
			System.out.println("반갑습니다");
			flag++;
		}
	}
}
