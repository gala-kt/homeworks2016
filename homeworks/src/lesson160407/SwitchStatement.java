package lesson160407;

public class SwitchStatement {

	public static void main(String[] args) {
		
		if (args == null ) {
			return;
		}
		if (args.length == 0) {
			System.out.println("Usage: <number>");
			System.exit(0);
		}
		
		int num = Integer.parseInt(args[0]);
		
		switch (num) {
		case 0:
			System.out.println("it's null");
			break;
		case 1:
			System.out.println("it's one");
			break;
		case 2:
			System.out.println("it's two");
			break;
		case 3:
			System.out.println("it's three");
			break;
		case 4:
			System.out.println("it's four");
			break;
		case 5:
			System.out.println("it's five");
			break;
		case 6:
			System.out.println("it's six");
			break;
		case 7:
			System.out.println("it's seven");
			break;
		case 8:
			System.out.println("it's eight");
			break;
		case 9:
			System.out.println("it's nine");
			break;
		case 10:
			System.out.println("it's ten");
			break;

		default:
			System.out.println("Enter the number!");
			break;
		}
		
	}
}
