package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		FoodList fl = new FoodList();
		int flag = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag == 1) {
			System.out.println("=====항목=====");
			System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.종료");
			int choice = sc.nextInt();
			
			String name = "";
			int price = 0;
			
			switch(choice) {
			case 0:
				flag = 0;
				break;
			case 1:
				System.out.println("추가할 메뉴를 입력하세요");
				name = sc.next();
				System.out.println("추가할 메뉴의 가격을 입력하세요");
				price = sc.nextInt();
				fl.addFood(name, price);
				break;
			case 2:
				System.out.println("수정할 메뉴를 입력하세요");
				name = sc.next();
				System.out.println("수정할 메뉴의 가격을 입력하세요");
				price = sc.nextInt();
				fl.setFood(name, price);
				break;
			case 3:
				System.out.println("삭제할 메뉴를 입력하세요");
				name = sc.next();
				fl.removeFood(name);
				break;
			case 4:
				fl.printFood();
				break;
			default:
				System.out.println("0~4까지의 수를 입력하세요");
				break;
			}
		}
	}
}

class FoodList{
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	
	public FoodList() {
		name.add("김밥");
		name.add("떡볶이");
		name.add("순대");
		price.add(1000);
		price.add(2000);
		price.add(3000);
	}
	
	public void addFood(String name, int price) {
		this.name.add(name);
		this.price.add(price);
	}
	
	public void setFood(String name, int price) {
		int index = this.name.indexOf(name);
		if(index == -1) {
			System.out.println("해당하는 항목이 없습니다");
			return;
		}
		this.price.set(index, price);
		return;
	}
	
	public void removeFood(String name) {
		int index = this.name.indexOf(name);
		if(index == -1) {
			System.out.println("해당하는 항목이 없습니다");
			return;
		}
		this.name.remove(index);
		this.price.remove(index);
		return;
	}
	
	public void printFood() {
		for(int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i) + " : " + price.get(i));
		}
	}
}