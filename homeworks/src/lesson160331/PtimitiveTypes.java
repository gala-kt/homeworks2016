package lesson160331;

public class PtimitiveTypes {

	public static void main(String[] args) {
		byte b = 1; // 8 bits == 1 byte
		b = Byte.MAX_VALUE;
		b = Byte.MIN_VALUE;
		
		short s = 34; //16 bits == 2 bytes
		s = Short.MAX_VALUE;
		s = Short.MIN_VALUE;

		int i = 10; //32 bits == 4 bytes
		i = Integer.MAX_VALUE;
		i = Integer.MIN_VALUE;
	
		long l = 154L; // 64 bits == 8 bytes
		l = Long.MAX_VALUE;
		l = Long.MIN_VALUE;
		
		char c = 10; // 16 bits == 2 bytes  
		c = 'A';
		c = 65; c++;
		System.out.println(c);
		
//		c = -1; ERROR!
		
		c = '\002'; // сппециальный знак с кодом 002
		c = Character.MAX_VALUE;
		c = Character.MIN_VALUE;
		

		float f = 10.2f; // 32 bits == 4 bytes
		f = 10E2f;
		System.out.println(f);
		f = Float.MAX_VALUE;
		f = Float.MIN_VALUE; 

		double d = 10.3; // 64 bits == 4 bytes  Вещественное число двойной точности
		d = Double.MAX_VALUE;
		d = Double.MIN_VALUE; 
		
		
	}
	
}
