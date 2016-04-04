package lesson160404;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		// int x = 1.3; ERROR!
		
		double d = 1; // implicit type cast - неявное преобразование типов
		
		int y =  (int)1.3; // explicit type cast
		int x =  (int) (10.0f / 3.0f);
		
		short s = (short)19212222;
		
		System.out.println(Integer.toBinaryString(19212222));
		System.out.println(Integer.toBinaryString(s));
		
		short x1 = 10;
		
		short y1 = 3;
		
		short z = (short)(x1 * y1); //  компилятор пытается предотвратить возможную ошибку (16ричное на 16ричное м.б. больше допустимого числа, сразу преобразует в целое. Если уверен в результате, стоит использовать явное приведение типов)
		
	}

}


