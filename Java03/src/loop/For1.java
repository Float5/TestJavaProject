package loop;

public class For1 {
	public static void main(String[] args) {
		//while의 가독성이 떨어져서 for를 쓴다
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		//while의 단점 : 밖에 플래그를 만들어야함
		//{}안에서 플래그를 증감해야함(빼먹으면 난리남)
		//for문 : 플래그 관련 코드는 ()에 몰아버리기 위해 만들어짐
		//for문의 장점 : while에 비해 가독성이 좋고 개발에 편리
	}
}
