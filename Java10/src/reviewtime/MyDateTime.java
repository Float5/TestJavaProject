package reviewtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class MyDateTime{
	public static void main(String[] args) {
		MyTime mt = new MyTime();
		
		System.out.println(mt.DateTime());
		System.out.println(mt.DateTime2());
		System.out.println(mt.After30Minutes());
		
		GetInstance ins1 = GetInstance.getInstance("ins1");
		GetInstance ins2 = GetInstance.getInstance("ins2");
		
		ins1.print();
		ins2.print();
	}
}

class MyTime{
	private String str;
	
	public String DateTime() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	
		String str = sdf.format(date);
		return str;
	}
	
	public String DateTime2() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일 HH시:mm분:ss초");
	
		String str = sdf.format(date);
		return str;
	}
	
	public String After30Minutes() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일 HH시:mm분:ss초");
		
		str = sdf.format(date);

		int index = str.indexOf("분");
		int Minute = Integer.parseInt(str.substring(index - 2, index));
		str = str.replace(Integer.toString(Minute), Integer.toString(Minute+30));
		return str;
	}
}