package operator;

public class Oper5 {
	public static void main(String[] args) {
		int num = 3;
		num = num;
		
		num = 1 + 2;
		num = num + 2;
		num += 2;
		System.out.println(num);
		
		num -= 2;
		num *= 2;
		num /= 2;
		num %= 2;
		System.out.println(num);
		
		num++;
		num--;
		System.out.println(num); 	//1
		System.out.println(++num);	//2
		System.out.println(num++); 	//2
		System.out.println(num);	//3
		
		int i =0;
		System.out.println(i++);
	}
}
