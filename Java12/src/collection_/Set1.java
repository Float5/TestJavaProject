package collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		//Set : List인데 중복이 불가능
		//Map : 방번호를 직접 정함 {key, value}
		//HashSet(순서, 중복 X) TreeSet(오름차순, 중복X)
		//Iterator : Set전체 사용을 위해 쓰임
		
		HashSet<Integer> hs = new HashSet<>(); //오름차순 해주네
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(4);
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("b");
		ts.add("b");
		ts.add("a");
		ts.add("a");
		ts.add("d");
		ts.add("c");
		
		for(String element : ts) {
			System.out.println(element);
		}
		
		int nums[] = {1,2,3,4,5,6,7,8,9};
		
		for(int a : nums) {
			System.out.print(a + " ");
		}
	}
}
