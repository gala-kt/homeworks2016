package homework160405;

import java.util.Arrays;

public class OneTwoFive {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: OneTwoFive <Enter number of bottles: 1, 2 or 5");
			System.exit(1);
		}

		String argslist = Arrays.toString(args);
		System.out.println(argslist);

		int bottle = Integer.parseInt(args[0]);

		if (bottle == 1) {
			System.out.println("JUST RIGHT!");
			System.exit(0);	
		}
		
		if (bottle == 2) {
			System.out.println("IT'S NOT ENOUGH!");
			System.exit(0);	
		}
		
		if (bottle == 5) {
			System.out.println("IT'S TOO MUCH!");
			System.exit(0);
		} 
		
		System.out.println("INVALID NUMBER OF BOTTLES!");
//		else {
//			System.out.println("INVALID NUMBER OF BOTTLES!");
//			System.exit(0);
//		}
//		
		
	}

}
