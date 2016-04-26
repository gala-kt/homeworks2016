package lesson160426;

public class Arrays3 {
	
	public static void main(String[] args) {
		
		String[] bugs = {"Light", "Severe", "Disaster"};
		String[] troubles;
		
		troubles = bugs;
		
		System.out.println(troubles);
		System.out.println(bugs);
		
		System.out.println(troubles == bugs);
	}
/*
 * [Ljava.lang.String;@7852e922 массив ссылок на строки
 */
}
