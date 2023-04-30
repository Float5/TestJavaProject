package review;

import java.util.ArrayList;

public class Review {
	public static void main(String[] args) {
		MyReview mr = new MyReview();
		
		mr.go();
	}
}

class MyReview{
	String str1;
	String str2;
	String str3;
	String str4;
	String str[] = new String[3];
	ArrayList<String> list = new ArrayList<>();
	
	public void go(){
		list.add("String1");
		list.add("String2");
		
		list.set(0, "String3");
		
		list.remove(1);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}