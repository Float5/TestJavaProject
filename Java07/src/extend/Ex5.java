package extend;

public class Ex5 {

}

class MyStr{
	protected String str;

	public MyStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void printStr() {
		System.out.println(this.str);
	}
}

class MyDeco extends MyStr{
	MyDeco(String str){
		super(str);
	}
	
	public void Deco(String d) {
		str = d + str + d;
	}
}