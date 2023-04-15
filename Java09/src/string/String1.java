package string;

public class String1 {
	public static void main(String[] args) {
		String str = "Hello World!";
		
		System.out.println(str.equals("Hello World!"));
		System.out.println(str.equals("Hello World"));
		
		if(str.equals("Hello World!")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		if(str.contains("Hell")) {
			System.out.println("포함");
		}
		
		String str2 = str.replace("Hello", "Hi");
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println(str.length());
		
		int index = str.indexOf("World");
		System.out.println(index);
		
		char c = str.charAt(index);
		System.out.println(c);
		c = str.charAt(1);
		System.out.println(c);
		
		String str3 = str.substring(index, index + 5);
		System.out.println(str3);
		
		String src = "홍길동";
		int index2 = src.indexOf("길동");
		String sub = src.substring(index2, index2 + 2);
		System.out.println(sub);
	}
}
