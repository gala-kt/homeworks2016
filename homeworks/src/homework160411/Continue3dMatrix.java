package homework160411;

import java.util.Arrays;

public class Continue3dMatrix {

	public static void main(String[] args) {

		int[][][] matrix = {
				{
					{1,2,8,3,4},
					{5,6,7,8,9},
					{10,7,11,12}
				},
				{
					{13,14,15,16},
					{17,18,19,0},
					{20,21,22,23}
				},
				{
					{21,25,26,27},
					{0,28,0,29},
					{30,31,0,32}
				}
		};
		
		OUTER: for (int matrixIn = 0; matrixIn < matrix.length; matrixIn++) {
			for (int row = 0; row < matrix[matrixIn].length; row++) {
//				System.out.println(Arrays.toString(matrix[matrixIn][row]));
				for (int column = 0; column < matrix[matrixIn][row].length;column++) {
//					System.out.print(matrix[matrixIn][row][column] + " ");
					if (matrix[matrixIn][row][column] == 0) {
						System.out.println("matrix: " + matrixIn + ", row: " + row + ", column: " + column);
//						break;
						continue OUTER;
				
					}
					
				}
//				System.out.println();
				
			}
//			System.out.println();
		}
		
		
	}

}
