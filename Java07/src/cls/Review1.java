package cls;

public class Review1 {
	public static void main(String[] args) {
		Re r = new Re();
		
		r.setStr("str");
		System.out.println(r.getStr());
	}
}

class Re{
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public Re() {
		System.out.println("객체화");
	}
}