package reviewtime;

public class Singleton {
	private String str;
	private static Singleton ins;
	
	private Singleton(String str) {
		this.str = str;
	}
	
	public static Singleton GetInstance(String str) {
		if(ins == null) {
			ins = new Singleton(str);
		}
		return ins;
	}
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
}
