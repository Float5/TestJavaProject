package cls;

public class Class7 {
	public static void main(String[] args) {
		Human human = new Human("James", "Male", 34);
		HumanView hv = new HumanView();
		
		hv.printInfo(human);
	}
}

class Human{
	String name;
	String gender;
	int age;
	
	Human(String Name, String Gender, int Age){
		name = Name;
		gender = Gender;
		age = Age;
	}
	
	void setName(String Name) {name = Name;}
	void setGender(String Gender) {gender = Gender;}
	void setAge(int Age) {age = Age;}
	
	String getName() {return name;}
	String getGender() {return gender;}
	int getAge() {return age;}
}

class HumanView{
	public void printInfo(Human human) {
		System.out.println("이름 : " + human.getName());
		System.out.println("성별 : " + human.getGender());
		System.out.println("나이 : " + human.getAge());
		System.out.println();
	}
}