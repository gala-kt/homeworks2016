package lesson160412;

public class QuestionsPart2 {

	public static void main(String[] args) {
		
		int c = 7;
		int res = 4;
		res += ++c;
		System.out.println(res);
		
		
		
		int x = 1, y = 15;
//		while x < 10 // условие без скобок - отстой!
		while (x < 10) {
			y--;
		}
		x++;
		System.out.println(x +", "+y);
	
		int t = 1;
		do {
			t = 1;
			System.out.println(t++ +  " ");
		} while (t <= 10); //ошибка компиляции: переменная вне тела цикла - out of scope 
	
	}
	
}
