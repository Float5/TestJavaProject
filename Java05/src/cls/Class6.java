package cls;

public class Class6 {
	public static void main(String[] args) {
		MyClass6 cl = new MyClass6();
		System.out.println(cl.func1());
		System.out.println(cl.func1(123));
	}
}

class MyClass6{
	int num;
	String str;
	
	int func1() {
		return 0;
	}
	int func1(int n) { //오버로딩
		return n;
	}
}
