package lesson160510;

public class B extends Object {
	
	{
		System.out.println("раз");
	}
	
	public B() {
		super();
		
	}

	int x;
	
	{
		System.out.println("два");	
	}
	
	public static void main(String[] args) {
		
		new B();
	}
	
}
