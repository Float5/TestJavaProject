package cls;

public class Class1 {
	public static void main(String[] args) {
		//클래스와 메서드 (코딩 방법론)
		//객체지향(OOP)
		
		//C언어에는 구조체가 있었음
		//구조체는 변수들을 뭉쳐놓은 문법
		//포인터를 가리기 위해서 구초제에 함수를 넣고 이름을 바꾼게 클래스
		
		//클래스 : 변수 + 함수 담아놓는 공간(그냥 스트럭트)
		
		//클래스를 다른 클래스에서 사용하기 위해선 객체화를 해야함
		//객체화
		//클래스명 객체명 = new 클래스명();
		
		MyClass1 Mycls = new MyClass1();
		Mycls.Method1();
		Mycls.Method2();
	}
}

class MyClass1{
	int num;
	String str;
	
	//메서드
	int Method1() {
		System.out.println("메서드_int");
		return 0;
	}
	String Method2() {
		System.out.println("메서드_String");
		return "";
	}
}