package collection_;

import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class Map2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary dic = new Dictionary();
		
		int flag = 1;
		while(flag == 1) {
			System.out.println("=====사전=====");
			System.out.println("1.추가 2.변경 3.삭제 4.출력 0.종료");
			int choice = sc.nextInt();
			
			String key = "";
			String value = "";
			
			switch(choice) {
			case 0:
				flag = choice;
				break;
			case 1:
				System.out.println("추가할 영단어를 입력하세요");
				key = sc.next();
				System.out.println("추가할 뜻을 입력하세요");
				value = sc.next();
				dic.add(key, value);
				break;
			case 2:
				System.out.println("뜻을 변경할 영단어를 입력하세요");
				key = sc.next();
				System.out.println("변경할 뜻을 입력하세요");
				value = sc.next();
				dic.set(key, value);
				break;
			case 3:
				System.out.println("삭제할 영단어를 입력하세요");
				key = sc.next();
				dic.remove(key);
				break;
			case 4:
				dic.print();
				break;
			}
		}
	}
}

class Dictionary{
	private HashMap<String, String> word = new HashMap<>();
	
	public Dictionary() {
		word.put("flower", "꽃");
		word.put("sea", "바다");
		word.put("new", "새로운");
	}
	
	public void add(String key, String value) {
		word.put(key, value);
	}
	
	public void set(String key, String value) {
		this.remove(key);
		this.add(key, value);
	}
	
	public void remove(String key) {
		word.remove(key);
	}
	
	public void print() {
		Set<String> set = word.keySet();
		for(String k : set) {
			System.out.println(k + " : " + word.get(k));
		}
	}
}