package review;

public class _06_Class {
	public static void main(String[] args) {
		MyClass6 mc6 = new MyClass6();
		
		mc6.setNum(1234);
		mc6.setStr("12345654321");
		
		System.out.println(mc6.getNum());
		System.out.println(mc6.getStr());
	}
}

class MyClass6{
	private int num;
	private double dnum;
	private String str;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getDnum() {
		return dnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
}