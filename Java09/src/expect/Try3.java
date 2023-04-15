package expect;

import java.util.Scanner;

public class Try3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		try {
			a = Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			a = 0;
		}
	}
}