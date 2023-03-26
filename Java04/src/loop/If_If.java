package loop;

public class If_If {
	public static void main(String[] args) {
		int flag = 1;
		
		if(flag != 0) {
			for(int i = 0; i < 5; i++) {
				System.out.println("조건문 안 반복문" + i);
			}
			flag = 0;
		}
	}
}
