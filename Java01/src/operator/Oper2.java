package operator;

public class Oper2 {
	public static int sum(int[] arr)
	{
		int result = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			result += arr[i];
		}
		
		return result;
	}
	
	public static double avr(int[] arr)
	{
		int result = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			result += arr[i];
		}
		result /= arr.length;
		
		return result;
	}
	
	public static void main(String[] args) {
		int kor = 50;
		int eng = 40;
		int math = 60;
		
		int[] scores = {kor, eng, math};
		
		System.out.println(sum(scores));
		System.out.println(avr(scores));
	}
}
