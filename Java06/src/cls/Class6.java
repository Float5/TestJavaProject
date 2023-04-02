package cls;

public class Class6 {
	public static void main(String[] args) {
		
	}
}

class Car{
	String Name;
	String Color;
	String Number;
	
	Car(String name, String color, String number){
		Name = name;
		Color = color;
		Number = number;
	}
	
	void setName(String s) {
		Name = s;
	}
	void setColor(String s) {
		Color = s;
	}
	void setNumber(String s) {
		Number = s;
	}
	
	String getName() {return Name;}
	String getColor() {return Color;}
	String getNumber() {return Number;}
}