package review;
import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		//if가 기본 조건문
		//switch는 특정 값이 같은 경우만 비교
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("안녕하세요");
			break;
		case 2:
			System.out.println("반가워요");
			break;
		case 3:
			System.out.println("잘있어요");
			break;
		case 4:
			System.out.println("다시만나요");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}
		
	}
}
