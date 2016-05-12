package lesson160510;

public class Жывотное {
	
	// class members
	
	private String name;  // поле, field
	private String kind;
	private boolean isHungry = true;
	
	{ // блок инициализации
		System.out.println("Создано очередное животное");
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	}
	
	public Жывотное(boolean h, String n, String k) {
		kind = k;
		name = n;
		isHungry = h;
	}

	public Жывотное(String kind) {
		this.kind = kind;
		name = "";
		isHungry = false;
	}
	
	public Жывотное(String kind, String name) {
		this(true, name, kind);
	}
	
	public Жывотное () {
//		this(true, "", "микроб");
		this("микроб", "");
	}
	
	
	
	public void feed(String food) {  // метод экземпляра  instance method
		if (isHungry) {
			System.out.println(kind + " '" + name + "' ест " + food );
			isHungry = false;
		} else {
			System.out.println(kind + " '" + name + "' играет с " + food );
		}
	}
	
	public void play() { // no static ==>  instance method
		if (isHungry) {
			System.out.println(kind + " '" + name + "' обиделся и залез в коробку ");
		} else {
			System.out.println(kind + " '" + name + "' играет, пока не проголодается ");
			isHungry = true;
		}
	}
	
}
