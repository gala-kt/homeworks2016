package lesson160331;

public class Operators {

	public static void main(String[] args) {
		int y = 4;
		double x = 3 + 2 * y;
		
		System.out.println(x);
		
		int a = 125;
		int b = 315;

		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		double z = 10E2;

		System.out.println(z);
		
		System.out.println(10/3);
		
		double 	d = 10.0 / 3.0;
		System.out.println(d);
		
		float f = 10 / 3f;
		System.out.println(f);
		
		int xx = 1;
		long yy = 33;
		float ff = 1f;
		
    	System.out.println( xx * yy * ff);
    	
//    	int x1 = 100_000;
//    	int x2 = 100_000;
    	long x1 = 100_000;
    	long x2 = 100_000;

//    	int z1 = x1 * x2;
//    	System.out.println(z1);

    	long ll = x1 * x2;
    	System.out.println(ll);
		
	}
	
}

