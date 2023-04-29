package random;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		MyRandom mr = new MyRandom();
		while(true) {
			mr.go2(10, 15);
		}
	}
}

class MyRandom{
	public void go1() {
		Random random = new Random();
		int result = random.nextInt(6);
		System.out.println(result+100);
	}
	
	public void go2(int min, int max) {
		Random random = new Random();
		if(min > max) {
			int temp = min;
			min = max;
			max = min;
		}
		int range = max - min + 1;
		int result = random.nextInt(range);
		result += min;
		System.out.println(result);
	}
	
	public void go3() {
		int result = (int)(Math.random() * 10) + 1; //1~10
		System.out.println(result);
	}
}