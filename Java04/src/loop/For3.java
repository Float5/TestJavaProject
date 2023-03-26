package loop;

public class For3 {
	public static void main(String[] args) {
		for(int i = 0; i < 20; i+=2) { //1씩 증감하지 않아도 for문 사용가능
			System.out.println(i);
		}
		
		int j = 0;
		for(j = 1; j <= 10; j++) { //for문 밖에서 변수를 선언했기 때문에 for문이 끝나도 j는 유지됨
			System.out.println(j);
		}
	}
}
