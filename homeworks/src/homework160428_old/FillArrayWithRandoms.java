package homework160428_old;

import java.util.Arrays;

public class FillArrayWithRandoms {

	public static void main(String[] args) {

		int[] x = randomArray(25, 100);
		System.out.println(Arrays.toString(x));

		Arrays.sort(x);
		System.out.println(Arrays.toString(x));

		System.out.println(Arrays.binarySearch(x, 50));

	}

	static int[] randomArray(int n, int max) {
		int[] result = new int[n];

		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * max);

		}

		return result;
	}
}
