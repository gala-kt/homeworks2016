package lesson160505;

public class Host {
	
	public static void main(String[] args) {
		
		Animal kittie = new Animal("Кот", "Барсик"); // create 
//		kittie.name = "Барсик";  //  set state
//		kittie.kind = "Кот";  // set state 
		kittie.feed("сосиска");  // send message
		kittie.feed("сосиска");  // send message
		kittie.feed("сосиска");  // send message
		kittie.play();
		kittie.play();
//		kittie.isHungry = false;
		kittie.play();
	}

}
