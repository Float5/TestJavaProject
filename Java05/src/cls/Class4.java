package cls;

public class Class4 {
	public static void main(String[] args) {
		MyClass8 string = new MyClass8();
		
		string.set("hello");
		System.out.println(string.get());
	}
}

class MyClass8{
	String str;
	
	String get() {
		return str;
	}
	void set(String s) {
		str = s;
	}
}