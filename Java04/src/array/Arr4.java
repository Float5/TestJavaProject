package array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		String Country[] = {"대한민국", "일본", "중국", "미국", "러시아"};
		String Capital[] = new String[5];
		
		Capital[0] = "서울";
		Capital[1] = "도쿄";
		Capital[2] = "베이징";
		Capital[3] = "워싱턴DC";
		Capital[4] = "모스크바";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국가를 입력하세요");
		
		String str = sc.next();
		int flag = 1;

		for(int i = 0; i < Country.length; i++) {
			if(Country[i].equals(str)) {
				System.out.println(Capital[i]);
				flag = 0;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("찾지 못했습니다");
		}
	}
}
