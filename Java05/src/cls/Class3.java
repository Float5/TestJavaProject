package cls;

public class Class3 {
	public static void main(String[] args) {
		Car dad = new Car("아빠", "차종류1", "흰색");
		Car mom = new Car("엄마", "차종류2", "검은색");
		Car me = new Car("나", "차종류3", "흰색");
		
		dad.carInfo();
		mom.carInfo();
		me.carInfo();
		
		System.out.println(dad.getOwnerName());
		System.out.println(mom.getCarName());
		System.out.println(me.getCarColor());
	}
}

class Car{
	String ownerName;
	String carName;
	String carColor;
	
	Car(String s1, String s2, String s3){
		ownerName = s1;
		carName = s2;
		carColor = s3;
	}
	
	void carInfo() {
		System.out.println("차 주인 : " + ownerName);
		System.out.println("차 종류 : " + carName);
		System.out.println("차 색상 : " + carColor);
		System.out.println();
	}
	
	String getOwnerName() {return ownerName;}
	String getCarName() {return carName;}
	String getCarColor() {return carColor;}
}
