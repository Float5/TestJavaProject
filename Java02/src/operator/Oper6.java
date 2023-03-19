package operator;

public class Oper6 {
	public static void main(String[] args) {
		//관계연산자 && || !
		//true또는 false
		
		//&& and //둘다 true -> true
		//|| or //둘중 하나라도 true -> true
		//! not //true -> false, false -> true (반전)
		
		int height = 120;
		int age = 14;
		
		boolean b = height >= 130 && age >= 13;
		System.out.println(b);
		b = height >= 130 || age >= 13;
		System.out.println(b);
		System.out.println(!b);
	}
}
