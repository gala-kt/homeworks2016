package lesson160510;

public class D {
	
	public static final int MAX = 20;
	
	static int счетчик; // поле класса

	int count = 0; // поле экземпляра
	
	{
		count++;
		System.out.println("count=" + count);
		счетчик++;
		System.out.println("счетчик=" + счетчик);
	}
	
	final static void method4() {}
	
	
}
