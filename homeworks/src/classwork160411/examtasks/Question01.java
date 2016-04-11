package classwork160411.examtasks;

public class Question01 {

	/*
	 * Какая из этих переменных может использоваться с boolean переменной?
	 * 
	 * A. ==
	 * B. +
	 * C. --
	 * D. |
	 * E. %
	 * F. <=
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean x = true;
		
		boolean y = (x == false);
		
//		y = x + 0;
		
//		x--; 
		
		y = x | true;
		
//		y = x % 0; 
		
//		y = x <= 0
		
	}
}
