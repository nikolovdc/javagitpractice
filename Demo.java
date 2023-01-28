public class Demo {

	public static void main (String args[])
	{
		Cat cat = new Cat("Mr Kitty");
		cat.makeNoise();
		cat.eat();

		Dog dog = new Dog("Ms. Puppy");
		dog.makeNoise();
		dog.eat();
		
		// polymorphic variable
		Animal animal;
	
		// cat
		animal = new Cat("Mr Meow Meow");
		animal.eat();

		// dog 
		animal = new Dog("Ms Ruff Ruff");
		animal.eat();		
	}

}
