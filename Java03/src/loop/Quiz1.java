package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		int pw = 51;
		int flag = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag < 5)
		{
			System.out.println("비밀번호를 입력하세요");
			int input = sc.nextInt();
			
			if(pw == input) {
				System.out.println("정답");
				flag = 5;
				}
			else {
				System.out.println("오답");
			}
			
			flag++;
		}
		
		if(flag != 6)
		{
			System.out.println("접속불가");
		}
		
		for(int i = 0; i <= 10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
