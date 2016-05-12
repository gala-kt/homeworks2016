package lesson160512;

public class Recursion {

	public static void main(String[] args) {
		
		Object o = new Object();
		o.toString();
		
		a();
		
		d(0);
		}

	private static void d(int depth) {
		// TODO Auto-generated method stub
		System.out.println("depth = " + depth++);
		d(depth);
	}

	private static void a() {
		// TODO Auto-generated method stub
		System.out.println("a");
		b();
	}

	private static void b() {
		System.out.println("b");
		c();
		
		// TODO Auto-generated method stub
		
	}

	private static void c() {
		System.out.println("c");
		new Exception().printStackTrace();
		
	}
	
}
