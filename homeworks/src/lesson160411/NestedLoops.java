package lesson160411;

public class NestedLoops {

	public static void main(String[] args) {
		
		int [][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}, // три вектора по 4 элемента
		};
		
		for (int r = 0; r < matrix.length; r++){
			for (int c = 0; c < matrix[r].length; c++) {
				System.out.print(matrix[r][c] + " ");
			}
			System.out.println('\n'); // две строки: ln + \n
		}
		
		matrix = new int[][] {
			{0},
			{1,2},
			{3,4,5},
		};
		
		
		for (int [] vector : matrix) {
			for (int x : vector) {
//				System.out.println(x);
				System.out.print(x + " ");
			}
			System.out.println(); // переносит на другую строчку
		}

//		сумма элементов матрицы
		int sum = 0;
		for (int [] vector : matrix) {
			for (int x : vector) {
//				System.out.println(x);
				sum += x;
			}
		}
		System.out.println(); 
		System.out.println("sum of the elements the of matrix is " + sum); 
	}
}
