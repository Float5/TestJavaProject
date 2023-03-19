package condition;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		score = sc.nextInt();
		
		if(score >= 90)
		{
			System.out.println("우등생입니다");
		}
	}
}
