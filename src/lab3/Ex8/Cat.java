package lab3.Ex8;

class Cat extends Pet {

	private int livesLeft;

	public Cat(String n, String o, int a, int l) {
		super(n, o, a);
		this.livesLeft = l;
	}

	public Cat(String n, String o) {
		super(n, o, 0);
		this.livesLeft = 7;
	}

	public void showDetails() {
		super.showDetails();
		System.out.println("I am a cat. " + this.livesLeft + " lives remain for me.");
	}

}// end of the pet class
