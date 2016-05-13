package homework160428;

import java.util.Arrays;

public class BinarySearchContinue {

	public static void main(String[] args) {

		int[] a = { 10, 20, -2, 3, 0, 100, -500 };

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		int result = binarySearch(a, 150);

		System.out.println(result);
		// System.out.println(a[result]);
	}

	static int binarySearch(int[] x, int key) {
		// TODO write code for binary search

		int left = 0;
		int right = x.length - 1;
		// неверное решение с переменной
		// int position = 0;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (x[mid] == key) {
				return mid;
			}

			if (x[mid] > key) {
				right = mid - 1;
				// position = right;
			} else {
				left = mid + 1;
				// position = left;
			}

		}

		return (left + 1) * -1;

	}

}
