package lesson160426;

public class Last2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(last2(null));

	}

	static public int last2(String str) {
		  if (str == null || str.length() <= 2) {
			return 0;
		}
		  String sub = str.substring(str.length()-2);
		  
		  int count = 0;
		  for (int i = 0; i < str.length()-2; i++) {
		    if (str.substring(i, i+2).equals(sub)) {
				count++;
			}
		  }
		  return count;
		}

	
}
