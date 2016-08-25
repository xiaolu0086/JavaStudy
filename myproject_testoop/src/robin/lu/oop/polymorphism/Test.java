package robin.lu.oop.polymorphism;

public class Test {

	/*
	 * public static void testAnimalVoice(Cat c) { c.voice(); }
	 * 
	 * public static void testAnimalVoice(Dog c) { c.voice(); }
	 * 
	 * public static void testAnimalVoice(Pig c) { c.voice(); }
	 */

	public static void testAnimalVoice(Animal animal) {
		animal.voice();
		
		if(animal instanceof Cat){
			((Cat)animal).catchMouse();
		}
	}

	public static void main(String[] args) {
		Animal animal = new Cat();
		testAnimalVoice(animal);

		Cat c = (Cat) animal;
		c.catchMouse();
	}
}
