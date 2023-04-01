package cls;

public class Method4 {
	public static void main(String[] args) {
		MyClass7 cl = new MyClass7();
		
		System.out.println(cl.add(4, 6));
		System.out.println(cl.sub(55, 45));
		System.out.println(cl.mul(5, 2));
		System.out.println(cl.div(100, 10));
		System.out.println(cl.div(10, 3));
		System.out.println(cl.div(0, 33));
		System.out.println(cl.div(33, 0));
		System.out.println(cl.나머지(10, 3));
	}
}

class MyClass7{
	int add(int n1, int n2) {
		return n1+n2;
	}
	int sub(int n1, int n2) {
		return n1-n2;
	}
	int mul(int n1, int n2) {
		return n1*n2;
	}
	double div(int n1, int n2) {
		if(n2 == 0) {
			return 0;
		}
		return (double)n1/n2;
	}
	int 나머지(int n1, int n2) {
		while(n1 >= n2) {
			n1 -= n2;
		}
		
		return n1;
	}
	//클래스는 초보자에게 코드르 교육하지 않고 사용하게 하기 위해 만들어짐
}