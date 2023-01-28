public class Demo {

	public static void main (String args[])
	{
		
		System.out.println("Here's a cat!");
		Cat cat = new Cat("Mr Kitty");
		cat.makeNoise();
		System.out.println(" ");
		
		System.out.println("And here's a dog!");	
		Dog dog = new Dog("Ms. Puppy");
		dog.makeNoise();
		System.out.println(" ");
		
		// polymorphic variable
		Animal animal;
		
		
		// cat
		System.out.println("Time for Mr Kitty to eat!");
		animal = new Cat("Mr Kitty");
		animal.eat();

		// dog 
		System.out.println("Time for Ms Ruff Ruff to eat as well!");
		animal = new Dog("Ms Ruff Ruff");
		animal.eat();		
	}

}
