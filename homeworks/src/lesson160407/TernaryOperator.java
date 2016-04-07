package lesson160407;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		int y = 10;
		int x;
		
		if (y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		
		
		x = (y > 5) ? (2 * y) : (3 * y);
		// Тернарный оператор
		
//		x = (y > 5) ? (2 * y) : "Hello!"; Ошибка не соответствия типов 
	}

}
