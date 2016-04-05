package lesson160405;

import java.util.Arrays;

public class RangeDetectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length == 0) {
			System.out.println("Usage: EvenOddExample, <number>.");
			System.exit(0);
		}

		String argslist = Arrays.toString(args);
		System.out.println(argslist);

		int x = Integer.parseInt(args[0]);

//		if (x >= 10) {
//			if (x <= 20) {
//				System.out.println("ПОПАЛ!");
//			} else {
//				System.out.println("МИМО!");
//			}
//		} else {
//			System.out.println("МИМО!");
//		}
		
		if (x >= 10 && x <= 20) {
			System.out.println("ПОПАЛ!");
			
		} else {
			System.out.println("МИМО!");
		}

	}

}
