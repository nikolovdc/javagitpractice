import java.util.Scanner;

public class Demo {

	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		Cat cat = new Cat("Unnamed Cat");
		System.out.println("Here's a cat!");
		cat.makeNoise();
		System.out.println(" ");
		
		Dog dog = new Dog("Unnamed Dog");
		System.out.println("And here's a dog!");	
		dog.makeNoise();
		System.out.println(" ");
		
		// polymorphic variable
		Animal animal;
		System.out.println("Name your new cat: ");
		String c = kb.nextLine();
		
		// cat
		cat = new Cat(c);
		animal = (Animal) cat;
		System.out.println("Your cat " + c + "has been named! Time to eat!");
		animal.eat();

		// dog 
		System.out.println("Time to name your new dog as well!");
		String d =  kb.nextLine();
		animal = new Dog(d);
		System.out.println("Your dog " + d + " has been named! Time to eat!");
		animal.eat();
	
	}

}
