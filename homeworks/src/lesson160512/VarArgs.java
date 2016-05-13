package lesson160512;

public class VarArgs {

	public static void main(String... args) {
		if (args.length == 0){
			System.out.println("Usage...");
			System.exit(0);
		}
		
		for (String argument : args) {
			System.out.println(argument);
		}
		// call static helper method 
	
		helper(1,2,3);
		helper(1,2,3,4);
		helper(1);
		helper();
	}
	
	//method overload
	
	private static void helper(int... a) {
		System.out.println("----");
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	
		static void helper(int i, float f, double d) {
			System.out.println("helper:");
		}
		
	
}
