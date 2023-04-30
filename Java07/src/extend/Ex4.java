package extend;

public class Ex4 {
	public static void main(String[] args) {
		StarBux_부평 SB_부평 = new StarBux_부평("부평", 123123);
		StarBux_asdf SB_asdf = new StarBux_asdf("asdf", 123123123);
		StarBux_asdfasdf SB_asdfasdf = new StarBux_asdfasdf("asdfasdf", 123);
		
		SB_부평.printMenu();
		SB_asdf.printMenu();
		SB_asdfasdf.printMenu();
	}
}

class StarBux{
	protected String locate;
	protected String offer[] = new String[3];
	protected int avrProfit;
	
	protected StarBux(String locate, int avrProfit){
		this.locate = locate;
		this.avrProfit = avrProfit;
		setOffer(0, "카푸치노");
		setOffer(1, "카페라떼");
		setOffer(2, "오렌지주스");
	}
	
	protected void setOffer(int index, String offerName) {
		offer[index] = offerName;
	}
	
	protected void printMenu() {
		System.out.println(locate+"지점의 메뉴판");
		for(int i = 0; i < 3; i++) {
			System.out.print(offer[i]+" ");
		}
		System.out.println();
	}
}

class StarBux_부평 extends StarBux{
	StarBux_부평(String locate, int avrProfit){
		super(locate, avrProfit);
	}
}

class StarBux_asdf extends StarBux{
	StarBux_asdf(String locate, int avrProfit){
		super(locate, avrProfit);
	}
}

class StarBux_asdfasdf extends StarBux{
	StarBux_asdfasdf(String locate, int avrProfit){
		super(locate, avrProfit);
	}
}