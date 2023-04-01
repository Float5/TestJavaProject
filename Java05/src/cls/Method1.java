package cls;

public class Method1 {
	public static void main(String[] args) {
		MyClass4 cl = new MyClass4();
		
		System.out.println(cl.plus(3, 5));
	}
}

class MyClass4{
	//메서드는 클래스 안에있는 함수이고 this를 가지고 있다
	
	int plus(int n1, int n2) {
		return n1 + n2;
	}
}
