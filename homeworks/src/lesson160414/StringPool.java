package lesson160414;

public class StringPool {
	
	public static void main(String[] args) {
		
		String name = "Mike";
		
		String name2 = "Mike";
		
		String name3 = new String("Mike");
		
		System.out.println(name == name2);
		System.out.println(name == name3);
		
		System.out.println(name.equals(name3));
		
	}

}
