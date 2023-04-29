package collection_;

import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		ArrayList<Double> arr3 = new ArrayList<>();
		
		arr2.add(1);
		arr2.add(2);
		
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
	}
}
