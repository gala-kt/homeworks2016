package homework160428;

import java.util.Arrays;

public class MaxScalar {
	
	public static void main(String[] args) {
		
		int[][] a = {
				{1,2,3,4},
				{5,6,7,8,},
				{9,10,11,12},
				{13,14,15,16},
				{17,18,19,20}
		};
		
		
		System.out.println("---Using static matrix---");
		int[] newScalar = maxScalar(a);
		System.out.println(Arrays.toString(newScalar));
		
		System.out.println();
		System.out.println("---New random matrix---");
		int[][] unknownMatrix = randomMatrix(4, 5, 1000);
		for (int i = 0; i < unknownMatrix.length; i++) {
			System.out.println(Arrays.toString(unknownMatrix[i]));
		}
		
		
		System.out.println();
		System.out.println("---Scalar from random matrix---");		
		newScalar = maxScalar(unknownMatrix);
		System.out.println(Arrays.toString(newScalar));

		
	}
	
	
	static int[] maxScalar(int[][] a) {
		int[] max = new int[a.length];
		
		for (int i =0; i < a.length; i++) {
			Arrays.sort(a[i]);
//			System.out.println(Arrays.toString(a[i])); проверка сортировки каждой строки матрицы
			
			int fill = 0;
			for (int j = 0; j < a[0].length; j++) {
				fill = a[i][0];
				if (a[i][j] > fill) {
					fill = a[i][j];
				}
				
			}
			
//     В чем ошибка??
			
//			for (int k = 0; k < max.length; k++) {
//			max[k] = fill;
//		}
			max[i] = fill;
				
		}
		
		return max;
	}
	
	
	static int[][] randomMatrix(int row, int column, int max) {
		int[][] p = new int[row][column];
		
		for (int i = 0; i < p.length; i++) {
			p[i] = FillArrayWithRandoms.randomArray(column, max);
			
		}
		
		return p;
	}

}
