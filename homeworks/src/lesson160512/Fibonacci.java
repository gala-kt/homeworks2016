package lesson160512;

public class Fibonacci {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		fibs = new long[51];
		long f = fib(50);
		long stop = System.currentTimeMillis();
		System.out.println(f);
		System.out.println("elapsed = " + (stop - start));
	}

	static long[] fibs;
	
	private static long fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (fibs[n] == 0) {
			fibs[n] = fib(n-1) + fib(n-2);
	
		}
		return fibs[n];
	}
	
}
