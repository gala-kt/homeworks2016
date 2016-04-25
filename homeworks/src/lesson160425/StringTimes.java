package lesson160425;

public class StringTimes {
	
	public static void main(String[] args) {
	
		  System.out.println(stringTimes(0, 3));
		
	}
	
//	static public String stringTimes(String str, int n) {
    static public String stringTimes(int x, int n) {
		  String res = "";
		  for (int i = 0; i < n; i++) {
//		    res += str;
		    res += x;
		  }
		  return res; 		
//		  System.out.println(res);
		}
	


}
