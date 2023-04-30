package review;

public class Review {
	public static void main(String[] args) {
		MyClass2 mc2 = new MyClass2();
		mc2.setNum(123);
		System.out.println(mc2.getNum());
	}
}

class MyClass2 extends MyClass{
	
}

class MyClass{
	private int num;
	private String str;
	private double dnum;
	private int numbers[] = new int[30];
	
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {return this.num;}
}