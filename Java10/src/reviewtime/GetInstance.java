package reviewtime;

public class GetInstance {
	private String str;
	
	private GetInstance(String str) {
		this.str = str;
	} //생성자를 private 선언하여 접근을 불가능하게 함
	
	private static GetInstance instance; //클래스에 저장할 개체
	
	public static GetInstance getInstance(String str) {
		if(instance == null) { //개체가 없으면 생성
			instance = new GetInstance(str);
		}
		return instance; //리턴
	}
	
	public void print() {
		System.out.println(str);
	}
}
