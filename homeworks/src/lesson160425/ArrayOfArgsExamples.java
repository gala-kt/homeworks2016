package lesson160425;

public class ArrayOfArgsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(args.length);
		
		for (String parameter : args) {
			System.out.println(parameter);
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]=" + args[i]);
		}
	}

}
