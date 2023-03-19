package operator;

public class Review {
	public static void main(String[] args) {
		//자주 변경될 수 있는 부분을 저장하고 돌려쓰기 위해 변수를 사용
		
		String string = "글자저장";
		int num = 0;
		
		System.out.println(string);
		System.out.println(num);
		
		//+, -, /, *, %
		
		String var1 = "글자" + "붙이기";
		
		System.out.println(3+4);
		System.out.println(3-4);
		System.out.println(3/4);
		System.out.println(3*4);
		System.out.println(3%4);
		
		System.out.println(3<4);
		System.out.println(3>4);
		System.out.println(3<=4);
		System.out.println(3>=4);
		System.out.println(3==4);
		System.out.println(3!=4);
	}
}
