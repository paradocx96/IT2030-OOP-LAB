package lab3.Ex5;

public class Person {

	String name, address;

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public void showDetails() {
		System.out.println("Name : " + name + "\nAddress : " + address);
	}
}
