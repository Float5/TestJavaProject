package review;

public abstract class Adapter1 implements Inter1{
	@Override
	public void must1(){
		System.out.println("어댑터에서 구현");
	}
	
	public abstract void must3();
	
	public String have() {
		return "Hello";
	}
}
