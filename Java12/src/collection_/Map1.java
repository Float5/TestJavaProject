package collection_;

import java.util.HashMap;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(2, "b");
		hm.put(1, "a");
		hm.put(2, "asdf"); //덮어쓰기
		hm.put(3, "c");
		hm.put(4, "d");
		hm.put(4, "e");
		
		Set<Integer> set = hm.keySet();
		for(int e : set) {
			System.out.println(e);
			System.out.println(hm.get(e));
		}
	}
}
