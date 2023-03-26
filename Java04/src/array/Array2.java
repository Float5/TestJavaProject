package array;

public class Array2 {
	public static void main(String[] args) {
		String menu1 = "에스프레소";
		String menu2 = "아메리카노";
		String menu3 = "카페라떼";
		//String menu4 = "카페모카";
		String menu5 = "오렌지주스";
		
		//메뉴가 몇개인지 바로 알 수가 없음
		//전체출력 불가능
		
		String menus[] = {"에스프레소", "아메리카노", "카페라떼", "오렌지주스"};
		int len = menus.length;
		
		System.out.println(len);
		
		for(int i = 0; i < len; i++) {
			System.out.println(menus[i]);
		}
	}
}
