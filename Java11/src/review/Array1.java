package review;

public class Array1 {
	public static void main(String[] args) {
		Arr1 arr = new Arr1();
		arr.go();
	}
}

class Arr1{
	public void go() {
		System.out.println("객체화");
		
		String menu[] = {"라면", "김밥", "떡볶이", "순대", "", "", ""};
		int price[] = new int[7];
		
		price[0] = 1000;
		price[1] = 2000;
		price[2] = 3000;
		price[3] = 4000;
		price[4] = 5000;
		price[5] = 6000;
		price[6] = 7000;
		
		for(int i = 0; i < menu.length; i++) {
			if(menu[i].equals("") || menu[i] == null) {
				menu[i] = null;
				price[i] = 0;
			}
			
			if(menu[i] != null && !menu[i].equals("")) {
				System.out.println(menu[i] + " : " + price[i]);
			}
		}
	}
}