package lesson160428;

import java.util.Arrays;

public class MatrixProduct {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
	
		
		int[][] b = {
				{1,1},
				{1,1},
				{1,1},
				{1,1},
		};
				
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		
			System.out.println();
		}
		
		int[][] r = product(a, b);
		for (int[] row : r) {
			System.out.println(Arrays.toString(row));
		}
		
		
		
	}

	static int[][] product(int[][] a, int[][] b) {
		if (a[0].length != b.length) {      // проверяем, что количествол колонок матрицы a равно количеству строк матрицы b
			return null;
		}
		
		int[][] p = new int[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				int[] v1 = a[i];
//				int[] v2 = b[i][0], b[i][1], b[i][2]...b[i][n];
				int[] v2 = new int[b.length];				
				for (int k = 0; k < v2.length; k++) {
					v2[k] = b[k][j];
				}
				int scalar = ScalarProduct.scalar(v1, v2);
				p[i][j] = scalar;
			}

			
		}
			
		
		return p;
	}
	
	
}
