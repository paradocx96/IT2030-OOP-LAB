package lab5;

abstract class Animal {
	private String name;

	public Animal() {
		System.out.println("Default Constructor Animal");
	}
	
	public Animal(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("My name is " + this.name + ". " + this.speak() + ".");
	}
	
	abstract public String speak();
}

class Dog extends Animal {
	
	public Dog() {
		System.out.println("Default Constructor Dog");
	}
	
	public Dog(String name) {
		super(name);
	}

	public String speak() {
		return "Bow Wow";
	}
}

class Cat extends Animal {
	
	public Cat() {
		System.out.println("Default Constructor Cat");
	}
	
	public Cat(String name) {
		super(name);
	}

	public String speak() {
		return "Meow Meow";
	}
}

class ToyCat extends Cat {
	String manufacturer;
	
	public ToyCat() {
		System.out.println("Default Constructor ToyCat");
	}

	public ToyCat(String name, String manufacturer) {
		super(name);
		this.manufacturer = manufacturer;
	}

	public void display() {
		super.display();
		System.out.println("I am from " + manufacturer + ".");
	}
}

class Main {
	public static void main(String[] args) {
		Animal animal1 = new Dog("test");
		animal1.display();

		Cat mycat = new Cat("Micky");
		mycat.display();
		
		Dog mydog = new Dog("Rover");
		mydog.display();
		
		ToyCat mytoy = new ToyCat("kittie", "Toysrus");
		mytoy.display();
		
		ToyCat TC = new ToyCat();
		Dog D = new Dog();
	}
}
