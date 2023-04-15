package expect;
import java.util.Scanner;

public class Try1 {
	public static void main(String[] args) {
		//사용자가 정상적인 방법으로 프로그램을 사용하지 않았을 경우에 대한 대비
		//를 예외처리라 한다
		
		Scanner sc = new Scanner(System.in);
		MyClass5 mc5 = new MyClass5();
		
		int n1 = 0;
		int n2 = 0;

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		mc5.divide(n1, n2);
	}
}

class MyClass5{
	public void divide(int n1, int n2) {
		try {
			System.out.println(n1/n2);
		}catch(Exception e) {
			System.out.println(0);
		}
	}
}