abstract public class Animal {
	
	public String name;
 	
	public Animal(String name) {
		this.name = name;
		
	}

	public abstract void makeNoise();

	public void eat() {
		System.out.println("Eating... mmm");
	}




}
