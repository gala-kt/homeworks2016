package lesson160412;

public class Question06 {

	public static void main(String[] args) {
		 
		int x = 5;
		System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
//		System.out.println(x > 2 ? (x < 4 ? 10 : 8) : 7);
		
		String s = null;
		System.out.println(s);
		
//		for (int i = 0; i < 10;) {
//			i = i++;
//			/*
//			 * int t = i // 0
//			 * i = i + 1 // 1
//			 * i = t // 0 
//			 */
//			System.out.println("hello, world!");
//		}
		
		byte a = 40, b = 50;
//		byte sum  = a + b;
		byte sum  = (byte) (a + b);
		System.out.println(sum);
		
		int y = 5 % 4 * 3;
		System.out.println(y);
		
		int z = 5 + 6 >> 1;
		System.out.println(z);
		
		int x1 = 50, x2 = 75;
		boolean boo = x1 >= x2;
		if (boo = true) {  // Присваивание, а не равно!!!
			System.out.println("succes");
		} else {
			System.out.println("failure");
		}
		
		int x3 = 10;
//		if (x = 12)   ERROR! Type mismatch
	}
	
}
