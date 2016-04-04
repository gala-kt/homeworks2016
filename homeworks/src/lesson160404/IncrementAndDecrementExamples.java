package lesson160404;

public class IncrementAndDecrementExamples {
	
	public static void main(String[] args) {
		
		int counter = 0;
		
		System.out.println(counter);  // 0
		System.out.println(++counter); // 1
		System.out.println(counter); // 1
		System.out.println(counter--); // 1
		System.out.println(counter); // 0
		
		int x =3;
		
		int y = ++x * 5 / x-- + --x; 
		System.out.println("x=" + x); 
		System.out.println("y=" + y); // (3+1 = 4) * 5 / (4) | (4 - 1 = 3) + (3 - 1 = 2)
		
		x++; // Отдельный оператор, х + 3 - неверное, выражение должно быть чему-то присвоено.
		
		
		
	}

}
