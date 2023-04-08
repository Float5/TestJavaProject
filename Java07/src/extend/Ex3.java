package extend;

public class Ex3 {
	public static void main(String[] args) {
		MyStringEx ms = new MyStringEx("Hello", "World");
		System.out.println(ms.getStr1());
		System.out.println(ms.getStr2());
		System.out.println(ms.getAppendedStr());
	}
}

class MyString{
	protected String str1;
	protected String str2;
	
	MyString(String str1, String str2){
		this.str1 = str1;
		this.str2 = str2;
	}
	
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	
}

class MyStringEx extends MyString{
	MyStringEx(String str1, String str2){
		super(str1, str2);
	}
	
	public String getAppendedStr() {
		return super.str1 + super.str2;
	}
}