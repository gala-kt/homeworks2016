package lesson160405;

import java.util.Arrays;

public class HomeTask {

	public static void main(String[] args) {
				
		/*
		 * две - много 
		 * пять - мало
		 * одна - в самый раз
		 */
		
		if (args.length == 0) {
			System.out.println("Usage: EvenOddExample, <number>.");
			System.exit(0);
		}

		String argslist = Arrays.toString(args);
		System.out.println(argslist);

		int x = Integer.parseInt(args[0]);
	}

}
