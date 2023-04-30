package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class Nations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		
		AL4 al = new AL4();
		
		while(flag == 1) {
			System.out.println("=====항목을 선택하세요=====");
			System.out.println("1.추가 2.변경 3.삭제 4.보기 0.끝내기");
			int choice = sc.nextInt();
			
			String name1 = "";
			String name2 = "";
			
			switch(choice) {
			case 0:
				flag = 0;
				break;
			case 1:
				System.out.println("추가할 국가를 입력하세요");
				name1 = sc.next();
				al.addNations(name1);
				break;
			case 2:
				System.out.println("변경할 국가명을 입력하세요");
				name1 = sc.next();
				System.out.println("무엇으로 변경하시겠습니까?");
				name2 = sc.next();
				al.setNations(name1, name2);
				break;
			case 3:
				System.out.println("삭제할 국가를 입력하세요");
				name1 = sc.next();
				al.removeNations(name1);
				break;
			case 4:
				al.printNations();
				break;
			default:
				System.out.println("0~4까지의 수를 입력하세요");
				break;
			}
		}
	}
}

class AL4{
	private ArrayList<String> nations = new ArrayList<>();
	
	public void addNations(String name) {
		nations.add(name);
	}
	
	public void setNations(String before, String after) {
		int index = nations.indexOf(before);
		if(index == -1) {
			System.out.println("해당하는 국가가 없습니다");
			return;
		}
		nations.set(index, after);
		return;
	}
	
	public void removeNations(String name) {
		int index = nations.indexOf(name);
		if(index == -1) {
			System.out.println("해당하는 국가가 없습니다");
			return;
		}
		nations.remove(index);
		return;
	}
	
	public void printNations() {
		for(int i = 0; i < nations.size(); i++) {
			System.out.println(nations.get(i));
		}
	}
}