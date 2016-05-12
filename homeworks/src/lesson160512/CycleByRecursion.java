package lesson160512;


public class CycleByRecursion {

	public static void main(String[] args) {
		
		print(10);
		
		print2(0, 10);
	}

	private static void print2(int i, int n) {
		 if (i >= n) {
			return;
		}
		System.out.println(i);
		print2(i+1, n); // tail хвост  - вызов самого себя происходит в конце (хвостовая рекурсия). 
		// проверка в теле цикла - переход на следующий виток - метод на самом деле не выполняется

		
	}

	private static void print(int i) {

		if (i > 0) {
			print(i-1);
			System.out.println(i-1);
		}
//		System.out.println(i);

		
	}
}
