package review;

//자바1
//변수 자료형 연산자 조건문 반복문 클래스 메서드 접근권한제어자 캡슐화 생성자 상속 인터페이스 추상클래스

public class Review1 {
	public static void main(String[] args) {
		MyClass1 mc = new MyClass1();
		
		mc.myMethod();
	}
}

class MyClass1{
	private String str = "Hello";
	private int num = 1234;
	private double dnum = 12.34;
	private boolean bool = true;
	
	public int myMethod() {
		String str = "World";
		this.str += str;
		for(int i = 0; i < 3; i++) {
			if(this.str != null && !this.str.equals("")) {
				System.out.println(this.str);
			}
		}
		
		return num;
	}
}

class MyClass2 extends MyClass1{
	String arr[] = {"1", "2", "3", "4", "5"};
	int[] nums = new int[4];
	
	public int myMethod() {
		return 1;
	}
	
	public MyClass2() {
		
	}
}

class MyClass3 extends Adapter1{

	@Override
	public void must2() {
		System.out.println("Must2");
	}

	@Override
	public void must4() {
		System.out.println("Must4");
	}

	@Override
	public void must3() {
		System.out.println("Must3");
	}
	
}