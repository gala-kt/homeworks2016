package lesson160426;

import java.util.Arrays;

public class ArraysOperations {

	public static void main(String[] args) {
		
//		1. Create
		
		int[] a = {1, 2, 3};
		a = new int[] {4, 5, 6, 7, 8, 9};
		
		a = new int[100];
		
//		2. Fill
		
		for (int i = 0; i < a.length; i++) {
			a[i] = 10;
		}
		
		Arrays.fill(a, 20);
		
//		3. Compare
		
		a = new int[] {1, 2, 3};
		int[] b = {1, 2, 3};
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		
		System.out.println(equal(a, b));
		
		boolean same = Arrays.equals(a, b);
		System.out.println(same);
	}
	
	static boolean equal(int[] x, int[] y) {
		if (x == y) {
			return false;
		}
		
		if (x == null || y == null) {
			return false;
		}
		
		if (x.length != y.length) {
			return false;
		}
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] != y[i]) {
				return false;
			}
		}
		return true;
	}
	
}
