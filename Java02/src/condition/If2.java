package condition;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		
		num = sc.nextInt();
		
		if(num < 10)
		{
			System.out.println("10보다 작습니다");
		}
		else
		{
			System.out.println("10보다 큽니다");
		}
	}
}
