package loop;

public class Continue1 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10)
		{
			if(i % 2 == 1)
			{
				i++;
				continue;
			}
			System.out.println("while : " + i);
			i++;
		}
		
		for(int j = 0; j < 10; j++)
		{
			if(j % 2 == 0)
			{
				continue;
			}
			System.out.println("for : " + j);
		}
	}
}
