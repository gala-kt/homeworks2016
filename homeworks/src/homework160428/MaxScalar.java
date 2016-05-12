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
		
		int[] p = maxScalar(a);
		System.out.println(Arrays.toString(p));
		
	}
	
	
	static int[] maxScalar(int[][] a) {
		int[] max = new int[a.length];
		
		for (int i =0; i < a.length; i++) {
			int fill = 0;
			for (int j = 0; j < a[0].length; j++) {
				fill = a[i][0];
				if (a[i][j] > fill) fill = a[i][j];
			}
			for (int k = 0; k < max.length; k++) {
				max[k] = fill;
			}
				
		}
		
		return max;
	}

}
