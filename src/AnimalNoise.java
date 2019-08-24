import model.*;

public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		
		Cow bessie = new Cow();
		System.out.println(bessie.speak());
		
		Dog rover = new Dog();
		System.out.println(rover.speak());
		
		Fish nemo = new Fish();
		System.out.println(nemo.speak());
		
		Duck Leo = new Duck();
		System.out.println(Leo.speak());
		
		Goat karl = new Goat();
		System.out.println(karl.speak());

    Tiger tony = new Tiger();
		System.out.println(tony.speak());
		
	}

}
