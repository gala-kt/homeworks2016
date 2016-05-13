package lesson160512;

public class VarArgs3 {

	void method(int[] nums) {}
	
//	void method(int... nums) {} считается одиним и тем же методом
	
	void method(int x) {}
	
	public void moreA(int... nums) {}
	
	static boolean[] x = {true};
	
	static public int howMany(boolean b, boolean... b2) {
		return b2.length;
	}
	
	public static void main(String[] args) {
		howMany(true, new boolean[2]);
	}
}
