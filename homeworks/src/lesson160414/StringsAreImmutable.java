package lesson160414;

public class StringsAreImmutable {

	public static void main(String[] args) {
		
		int i = 0;
		
		String s = "hello";
		String w = "world";
		
		s += w;
		
		// heap  - куча, динамическая память
		
		System.out.println(s);
		
	}
	
}
