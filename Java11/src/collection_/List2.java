package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
	public static void main(String[] args) {
		int flag = 1;
		
		ArrayList2 al = new ArrayList2();
		
		while(flag == 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("====항목 선택====");
			System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.나가기");
			
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
				al.addMenu(name, price);
				break;
			case 2:
				System.out.println("변경할 메뉴를 입력하세요");
				name = sc.next();
				System.out.println("변경할 메뉴의 가격을 입력하세요");
				price = sc.nextInt();
				al.setMenu(name, price);
				break;
			case 3:
				System.out.println("삭제할 메뉴를 입력하세요");
				name = sc.next();
				al.removeMenu(name);
				break;
			case 4:
				al.printMenu();
				break;
			default:
				System.out.println("0~4사이의 수를 입력하세요");
				break;
			}
		}
	}
}

class ArrayList2{
	ArrayList<String> menu = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	
	public ArrayList2() {
		menu.add("라면");
		menu.add("김밥");
		menu.add("떡볶이");
		menu.add("순대");
		price.add(1000);
		price.add(2000);
		price.add(3000);
		price.add(4000);
	}
	
	public void addMenu(String menu, int price) {
		this.menu.add(menu);
		this.price.add(price);
	}
	
	public void setMenu(String menu, int price) {
		for(int i = 0; i < this.menu.size(); i++) {
			if(this.menu.get(i).equals(menu)) {
				this.price.set(i, price);
				return;
			}
		}
		System.out.println("해당하는 메뉴 없음");
		return;
	}
	
	public void removeMenu(String menu) {
		for(int i = 0; i < this.menu.size(); i++) {
			if(this.menu.get(i).equals(menu)) {
				this.menu.remove(i);
				return;
			}
		}
		System.out.println("해당하는 메뉴 없음");
		return;
	}
	
	public void printMenu() {
		for(int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i) + " : " + price.get(i));
		}
	}
}