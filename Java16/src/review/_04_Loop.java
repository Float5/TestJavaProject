package review;

public class _04_Loop {
	//반복문
	//while, for, do-while
	//for(변수선언; 비교; 증감){}
	
	
	
	public static void main(String[] args) {
		int flag = 0;
		
		while(flag < 4) {
			System.out.println(flag);
			flag++;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 4; i++) {
			if(i == 2) {
				continue;
			}
			System.out.println(i);
		}
	}
}
