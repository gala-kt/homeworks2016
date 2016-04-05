package lesson160405;

import java.util.Arrays;

public class EvenOddExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length == 0) {
			System.out.println("Usage: EvenOddExample, <number>.");
			System.exit(0);
		}

		String argslist = Arrays.toString(args);
		System.out.println(argslist);

		int x = Integer.parseInt(args[0]);

		if (x % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
