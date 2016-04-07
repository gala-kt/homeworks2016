package lesson160407;

public class IfTypicalUseCasses {
	
	public static void main(String[] args) {
		
		int x = 20;
		
		boolean isEven = isEven(x);
		
		
		
	}

	private static boolean isEven(int x) {
		// TODO Auto-generated method stub
//		if (x % 2 == 0) {
//			return true;
//		} else {
//			return false;
//			
//		}
		return x % 2 == 0; // Не надо лишних действий!
		
	}

}
