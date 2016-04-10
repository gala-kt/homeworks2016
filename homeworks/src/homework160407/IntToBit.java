package homework160407;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class IntToBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length == 0) {
			System.out.println("Usage: <number>");
			System.exit(0);
		}
	
		int numint = Integer.parseInt(args[0]);
		System.out.println("Your integer number is: " + numint);
		System.out.println("Your number in bits is: ");
		
		while (numint > 0) {
			switch (numint % 2) {
			case 0:
				System.out.println(0);
				break;
			
			case 1:
				System.out.println(1);
				break;
			}
			numint >>= 1;
			
		}
		
	
	}

}
