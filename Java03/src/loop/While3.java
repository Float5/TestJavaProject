package loop;
import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		int flag = 1;
		int num = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		num = sc.nextInt();
		
		while(flag <= num)
		{
			sum += flag;
			flag++;
		}
		
		System.out.println(sum);
	}
}
