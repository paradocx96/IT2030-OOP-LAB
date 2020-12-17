package lab3.Ex8;

public class Dog extends Pet {
	
	int noOfMasters;
	
	Dog(String n, String o, int a, int m){
		super(n,o,a);
		this.noOfMasters = m;
	}
	
	Dog(String n, String o){
		super(n,o);
		this.noOfMasters = 1;
	}

	public void showDetails() {
		super.showDetails();
		System.out.println("I'm a Dog. I have "+this.noOfMasters+" masters at home.");
	}
}
