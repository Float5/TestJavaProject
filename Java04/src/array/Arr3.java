package array;

public class Arr3 {
	public static void main(String[] args) {
		//음식점 메뉴
		String names[] = {"라면", "김밥", "순대", "떡볶이", "튀김"};
		int prices[] = new int[5];
		
		prices[0] = 3000;
		prices[1] = 2000;
		prices[2] = 4000;
		prices[3] = 3000;
		prices[4] = 3500;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(names[i] + "은(는) " + prices[i]+"원");
		}
		
	}
}
