package cls;

public class Class2 {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.talk("Hello World");
	}
}

class Person{
	String name = "asdf";
	int age;
	double height;
	
	void talk(String msg) {
		System.out.println(name + " : " + msg);
	}
	
	void walk() {
		int dis = 3;
		System.out.println(name + "이 " + dis + "Km만큼 걸었습니다");
	}
}