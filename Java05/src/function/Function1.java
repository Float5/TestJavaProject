package function;

public class Function1 {
	public static void main(String[] args) { //메인 메서드
		//자바에는 막혀있지만 함수라는 개념이 있다
		//자바에서는 함수를 직접적으로 사용하지 않고
		//클래스 안에서 메서드로 사용
		
		//static은 정적으로 고정시켜서 어디서든지 접근할 수 있게 하는것
		//함수() {asdfasfd;}
		//변수 = asdfasdfasdf;
		
		func1(1, 5, 7);
	}
	
	//메인이 static함수여서 static으로 생성
	static void func1(int n1, int n2, int n3) {
		//함수는 사용자가 직접 만드는 연산자
		System.out.println(n1 + n2 + n3);
	}
}

//클래스 밖에선 코딩 불가능
//자바의 목적은 모든 프로그래밍 언어를 통합하기 위해 출시해서
//근데 망함(feat.마소)
