package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		//if(){}
		//소괄호에 조건식, 중괄호에 실행코드
		
		int age = 123;
		int money = 0;
		
		if(age >= 20)
		{
			System.out.println("성인입니다");
			money = 1000;
		}else if(age >= 14)
		{
			System.out.println("청소년입니다");
			money = 650;
		}else 
		{
			System.out.println("어린이입니다");
			money = 400;
		}
		
		System.out.println(money + "원입니다");
		
		int year = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.println("윤년입니다");
		}else {
			System.out.println("윤년이 아닙니다");
		}
		
		sc.close(); //main함수 종료시 자동 해제됨
	}
}
