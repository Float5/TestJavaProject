package array;

public class ArrArr {
	public static void main(String[] args) {
		int arr[][] = {{10,20},{100,200}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
	}
}
