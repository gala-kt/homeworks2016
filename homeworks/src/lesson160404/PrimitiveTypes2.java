package lesson160404;

public class PrimitiveTypes2 {
	
	public static void main(String[] args) {
		boolean b, b2, isBlack; // Можно перечислить несколько значений в одной переменной	
		
		b = false;
		
		b2 = true;
		
		isBlack = !b;
		
		System.out.println(b);
		System.out.println(isBlack);
		
		boolean isTall = false;
		
		System.out.println(isBlack || isTall); // Или черный, или высокий - True
		System.out.println(isBlack && isTall); // И черный, и высокий - False
		System.out.println(isBlack & isTall); // И черный, и высокий - False
//		System.out.println(isBlack && 0); // Нельзя смешать целые числа с булевскими значениями
		
		
		
	}

}
