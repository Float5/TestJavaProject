package review;
import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		String str = sc.next();
		int n = 0;
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			n++;
			if(n == 3 && i != 0)
			{
				sb.insert(i, ",");
				n = 0;
			}
		}
		
		System.out.println(sb);
		sc.close();
	}
}
