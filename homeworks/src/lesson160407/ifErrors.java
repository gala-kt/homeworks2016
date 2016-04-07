package lesson160407;

public class ifErrors {
	
	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("No args!");
			System.exit(1); //Без фигурных скобок строка воспринимается НЕ в блоке условий
		}
			
		System.out.println("args[0]=" + args[0]);
		
		
		int x = 1;
		
//		if (x) { Нужно ставить условия обязательно!!
//		// to do smth
		
		
//		if (2 = x) {ERROR!
//			
//		}
		if (2 == x) { 
			//..
		}

	
	
	}

}
