package review;

public class _07_Extends {
	public static void main(String[] args) {
		MyClass7 mc7 = new MyClass7("MyClass7");
		MyClass8 mc8 = new MyClass8("MyClass8");
		
		System.out.println(mc7.getStr());
		System.out.println(mc8.getStr());
		mc8.addStr(" test");
		System.out.println(mc8.getStr());
	}
}

class MyClass7{
	private String str;

	public MyClass7(String str){
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}

class MyClass8 extends MyClass7{
	public MyClass8(String str) {
		super(str);
	}
	
	public void addStr(String str) {
		setStr(getStr()+str);
	}
}