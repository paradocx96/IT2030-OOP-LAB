package lab3.Ex8;

class Main { 
	public static void main(String[] args){ 
		
		Pet p = new Pet("Lissie","Smith",3); 
		p.showDetails(); 
		
		System.out.println();
		
		Cat c = new Cat("Kyan", "Silva", 4, 4); 
		c.showDetails(); 

		System.out.println();
		
		Dog d = new Dog("Navi","Hasi",6,2);
		d.showDetails();

		System.out.println();
		
		Pet pet = new Pet("Navinda", "Lankesh");
		pet.showDetails();

		System.out.println();
		
		Cat cat = new Cat("Dilanga", "Chandrasiri");
		cat.showDetails();

		System.out.println();
		
		Dog dog = new Dog("Lankesh", "Peshani");
		dog.showDetails();

		System.out.println();
		
		Pet p3 = c;
		p3.showDetails();
	} 
}//end of the demo class
