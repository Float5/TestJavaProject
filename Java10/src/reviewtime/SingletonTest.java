package reviewtime;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton single1 = Singleton.GetInstance("sing1");
		Singleton single2 = Singleton.GetInstance("sing2");
		Singleton single3 = Singleton.GetInstance("sing3");
		
		System.out.println(single1.getStr());
		System.out.println(single2.getStr());
		System.out.println(single3.getStr());
		
		single1.setStr("1");
		single1.setStr("2");
		single1.setStr("3");
		
		System.out.println(single1.getStr());
		System.out.println(single2.getStr());
		System.out.println(single3.getStr());
	}
}
