package cls;

public class Cls1 {
	public static void main(String[] args) {
		cal c = new cal(10, 2);
		
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
	}
}

class cal{
	private int num1;
	private int num2;
	
	public cal(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	public int add() {
		return num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
	public int mul() {
		return num1 * num2;
	}
	public int div() {
		if(num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}
}