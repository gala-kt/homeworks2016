package lesson160426;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = {10, 20, -2, 3, 0, 100, -500};

//		find 20                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		int[] b = {-500, -2, 0, 3, 10, 20, 100};
//		 Класс Arrays содержит методы сортировки и методы двоичного поиска.
		
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int result = Arrays.binarySearch(a, 150);
		
		System.out.println(result);
//		System.out.println(a[result]);
		
//		 result = -7  Отрицательное число означает отсутствие ключа в массиве.
//		              Семь - позиция числа в массиве (если б нужно было бы его поместить в массив) -7 + 1 = -6 и меняем щзнак на положительный. Либо если поменять знак на противоположный - 7ой элемент массива по счету.
		
	}
	
	int binarySearch(int[] x) {
			//TODO write code for binary search
			
			return -1;
	
	}

}
