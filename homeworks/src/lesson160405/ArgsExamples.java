package lesson160405;

import java.util.Arrays;

public class ArgsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args == null) {
			System.out.println("Panic! No args at all!!");
			System.exit(1);
//			return;
		}
		
		if (args.length == 0) {
			System.out.println("Usage: ArgsExample <number>");
			System.exit(0);
		}
		
		String argslist = Arrays.toString(args);
		
		System.out.println(argslist);
		
		String number = args[0];
		
		System.out.println(number);
		
		number = number + 1;
		
		System.out.println(number);
		
		int x = Integer.parseInt(number);
		
		System.out.println(x);
		System.out.println(x + 1);
		
//		int x = Integer.parseInt(args[0]);

	}

}
