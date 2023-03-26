package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
//		int pw = 51;
//		int flag = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(flag < 5)
//		{
//			System.out.println("비밀번호를 입력하세요");
//			int input = sc.nextInt();
//			
//			if(pw == input) {
//				System.out.println("정답");
//				flag = 5;
//				}
//			else {
//				System.out.println("오답");
//			}
//			
//			flag++;
//		}
//		
//		if(flag != 6)
//		{
//			System.out.println("접속불가");
//		}
//		
//		for(int i = 0; i <= 10; i++)
//		{
//			if(i % 2 == 0)
//			{
//				System.out.println(i);
//			}
//		}
		
		int kor = 41;
		int eng = 60;
		int math = 50;
		
		if(kor < 40 || eng < 40 || math < 40) {
			System.out.println("과락");
		}else if(kor + eng + math < 150) {
			System.out.println("총점미달");
		}else {
			System.out.println("합격");
		}
		
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
