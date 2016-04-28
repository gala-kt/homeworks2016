package lesson160428;

import java.util.Arrays;

public class BinarySearchContinue {




		public static void main(String[] args) {

			int[] a = {10, 20, -2, 3, 0, 100, -500};

			
			Arrays.sort(a);
			
			System.out.println(Arrays.toString(a));
			
			int result = binarySearch(a, 0);
			
			System.out.println(result);
			System.out.println(a[result]);
			
		}
		
		static int binarySearch(int[] x, int key) {
				//TODO write code for binary search
				
			    int left = 0;
				int right = x.length - 1;
				
				while (left <= right) {
					int mid = left + (right - right) / 2;
					if (x[mid] == key) {
						return mid;
					}
					
					if (x[mid] > key) { 
						right = mid - 1;
					} else {
						left = mid + 1;
					}
					
				}
				
				return -1;
		
		}

	}
