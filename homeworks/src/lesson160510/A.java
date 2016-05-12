package lesson160510;

public class A {
	
	String state = ""; // 1 инициализации полей
	
	{
		System.out.println(state);
		state = "начало"; // 2 блок инициалиизации
		System.out.println(state);
	}
	
	public A() {
		System.out.println(state);
		state = "конструктор"; // 3 конструктор
		System.out.println(state);
	}

	public A(String x) {
		this();
		state = x;  // 4 вторичный конструктор
		System.out.println(x);
	}
	
	public A(int n) {
		System.out.println("n=" + n); // 3' отдельный конструктор
	}
	
	public static void main(String[] args) {
		A a = new A(0);
	}


}
