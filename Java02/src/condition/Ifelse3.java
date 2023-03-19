package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		int age = 0;
		int score = 0;
		int pw = 12345678;
		int scannedpw = 0;
		int year = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		if(age >= 20)
		{
			System.out.println("성인");
		}else if(age >= 14)
		{
			System.out.println("청소년");
		}else
		{
			System.out.println("어린이");
		}
		
		System.out.println("학점을 입력하세요");
		score = sc.nextInt();
		
		if(score >= 90)
		{
			System.out.println("A");
		}else if(score >= 80)
		{
			System.out.println("B");
		}else if(score >= 70)
		{
			System.out.println("C");
		}else
		{
			System.out.println("F");
		}
		
		System.out.println("비밀번호를 입력하세요");
		scannedpw = sc.nextInt();
		
		if(pw == scannedpw)
		{
			System.out.println("비밀번호가 맞습니다");
		}else
		{
			System.out.println("비밀번호가 다릅니다");
		}
		
		System.out.println("년도를 입력하세요");
		year = sc.nextInt();
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		{
			System.out.println("윤년");
		}
	}
}
