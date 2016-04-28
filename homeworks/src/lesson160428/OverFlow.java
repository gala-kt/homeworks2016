package lesson160428;

public class OverFlow {

	public static void main(String[] args) {
		
		int left = 2_000_000_000;
		int right = 2_000_000_000;
		
		int mid = (left + right) / 2; // выходит за допустимые размеры максимального значения целого числа
		
		System.out.println(mid);
		
		mid = left + (right - left) / 2;
		
		System.out.println(mid);
	}
	
}
