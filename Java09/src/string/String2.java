package string;

public class String2 {
	public static void main(String[] args) {
		String order1 = "name=001price=002000type=0";
		String order2 = "name=003price=006000type=1";
		String order3 = "name=004price=006000type=1";
		MyClass9 mc9 = new MyClass9();
		
		System.out.println(mc9.info(order1));
		System.out.println(mc9.info(order2));
		System.out.println(mc9.info(order3));
	}
}


class MyClass9{
	public String info(String str) {
		String offer_codes[] = {"001","002","003","004","005"};
		String offer_names[] = {"에스프레소", "아메리카노", "카페라떼", "딸기라떼", "케모마일차"};
		int price = 0;
		String type_codes[] = {"0", "1"};
		String type_types[] = {"뜨거운", "차가운"};
		
		String offer_code = str.substring(5, 8);
		String offer = "";
		for(int i = 0; i < offer_codes.length; i++) {
			if(offer_codes[i].equals(offer_code)){
				offer = offer_names[i];
				break;
			}
		}
		
		price = Integer.parseInt(str.substring(14, 20));
		
		String type_code = str.substring(str.length() - 1);
		String type = "";
		for(int i = 0; i < type_codes.length; i++) {
			if(type_codes[i].equals(type_code)) {
				type = type_types[i];
				break;
			}
		}
		
		String result = "";
		result = type + " " + offer + " " + price + "원";
		
		return result;
	}
}