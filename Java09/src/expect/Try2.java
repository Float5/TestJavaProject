package expect;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		String n1 = "";
		String n2 = "";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			n1 = sc.next();
			n2 = sc.next();
			
			try {
				System.out.println(Integer.parseInt(n1)/Integer.parseInt(n2));
			}catch(Exception e3) {
				System.out.println(0);
			}
			
			if(n1.equals("break") || n2.equals("break")) {
				break;
			}
		}
	}
}