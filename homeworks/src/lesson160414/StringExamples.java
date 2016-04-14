package lesson160414;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a = 'A';
		
		int i = 10;
		
		long l = 100000000000000l;
		
		int octal = 0100;
		
		int binary = 0b1100;
		
		int hexadec = 0xFF; //255 2^8 - 1
		
		String hello = "Hello, world!";
		
// для символов используются одинарные кавычки, для строк - двойные
		
		String hi = new String("Hi!");
		
		String welcome = new String(new char[] {'W', 'e', 'l', 'c', 'o', 'm', 'e'});
		
		System.err.println(hello);	
		System.out.println(hi);
		System.out.println(welcome);
		
		int c = a;
		
		System.out.println(c);
		
		c += 10;
		a = (char)c;
		
		System.out.println(a);
		
		
	}

}
