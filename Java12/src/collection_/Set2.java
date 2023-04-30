package collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		NationSet ns = new NationSet();
		
		while(flag == 1) {
			System.out.println("====국가 이름 저장 프로그램====");
			System.out.println("1.추가 2.조회 3.변경 4.삭제 0.끝내기");

			int choice = sc.nextInt();
			
			String name1 = "";
			String name2 = "";
			
			switch(choice) {
			case 0:
				flag = 0;
				break;
			case 1:
				System.out.println("추가할 국가 이름을 입력하세요");
				name1 = sc.next();
				ns.add(name1);
				break;
			case 2:
				ns.print();
				break;
			case 3:
				System.out.println("변경할 국가 이름을 입력하세요");
				name1 = sc.next();
				System.out.println("어떤 국가 이름으로 변경하시겠습니까?");
				name2 = sc.next();
				ns.set(name1, name2);
				break;
			case 4:
				System.out.println("삭제할 국가 이름을 입력하세요");
				name1 = sc.next();
				ns.remove(name1);
				break;
			}
		}
	}
}

class NationSet{
	private HashSet<String> nations = new HashSet<>();
	
	public void add(String name) {
		nations.add(name);
	}
	
	public void set(String before, String after) {
		this.remove(before);
		nations.add(after);
	}
	
	public void remove(String name) {
		nations.remove(name);
	}
	
	public void print() {
		for(String e : nations) {
			System.out.println(e);
		}
	}
}
