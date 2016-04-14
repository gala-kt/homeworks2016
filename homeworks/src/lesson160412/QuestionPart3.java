package lesson160412;

public class QuestionPart3 {

	public static void main(String[] args) {
		
		boolean keepgoing = true;
		int res = 15, i = 10;
		do {
			i--;
			if (i == 8) {
				keepgoing = false;
			}
			res -=2;
		} while (keepgoing);
		System.out.println(res);
		
		int count = 0;
		ROW_LOOP: for(int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 2; col++) {
				if (row * col % 2 == 0) {
					continue ROW_LOOP;
				}
				count++;
			}
		}
		System.out.println(count);
		
	}
	
}
