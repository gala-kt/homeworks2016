package lesson160414;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Hello, World!";
		System.out.println(s.length());
	
		for (int i = 0; i < s.length(); i++) {
			System.out.println(i + " : " + s.charAt(i));
		}
		
		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(s.length())); out of bound
		System.out.println(s.charAt(s.length()-1)); // last char
		
//		В какой позиции стоит символ?
		
		System.out.println(s.indexOf('W'));
		System.out.println(s.indexOf('o'));
		System.out.println(s.lastIndexOf('o'));
		
		String phrase = "If the thatcher of thatchwood went to thatch it a tha";
		System.out.println(phrase.indexOf("went"));
		System.out.println(phrase.indexOf("thatch", 35));
				
		System.out.println(s.substring(7));
		System.out.println(s.substring(7, 12));
		
		String w = s.substring(7, 12);
		
		System.out.println(w);
		System.out.println(s.substring(2, 2));
		System.out.println(s.substring(2, 1));
		System.out.println(s.substring(2, 62));
	}
	
}
