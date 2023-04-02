package cls;

public class KrController {
	public static void main(String[] args) {
		KrModel km1 = new KrModel();
		KrModel km2 = new KrModel();
		
		KrView kv = new KrView();
		
		km1.setNum(123);
		km1.setStr("Hello World");
		
		km2.setNum(456);
		km2.setStr("Hello Java");
		
		kv.PrintNum(km1);
		kv.PrintStr(km1);
		kv.PrintNum(km2);
		kv.PrintStr(km2);
		
		KrService ks = new KrService();
		
		ks.decoEqual(km1);
		kv.PrintStr(km1);

		ks.decoPlus(km1);
		kv.PrintStr(km1);
		
		ks.decoCustom(km2, "*");
		kv.PrintStr(km2);
	}
}

class KrModel{
	int num;
	String str;
	
	void setNum(int n){
		num = n;
	}
	int getNum() {return num;}
	
	void setStr(String Str){
		str = Str;
	}
	String getStr() {return str;}
}

class KrView{
	void PrintNum(KrModel km) {
		System.out.println(km.getNum());
	}
	
	void PrintStr(KrModel km) {
		System.out.println(km.getStr());
	}
}

class KrService{
	void decoEqual(KrModel km) {
		km.setStr("=" + km.getStr() + "=");
	}
	
	void decoPlus(KrModel km) {
		km.setStr("+" + km.getStr() + "+");
	}
	
	void decoCustom(KrModel km, String s) {
		km.setStr(s + km.getStr() + s);
	}
}