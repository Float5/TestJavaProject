package loop;
import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
		{
			System.out.println("안녕");
		}
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++)
		{
			sum += i;
		}
		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		sum = 0;
		
		for(int i = 1; i <= num; i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}
}
