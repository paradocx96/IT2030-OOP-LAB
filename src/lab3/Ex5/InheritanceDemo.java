package lab3.Ex5;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Navinda", "Gampaha");
		p1.showDetails();
		
		System.out.println("\n");
		
		Student std = new Student("Lankesh", "Kirindiwela", "001");
		std.showDetails();

		System.out.println("\n");
		
		PartTimeStudent s = new PartTimeStudent("Dilanga", "Pugoda", "002", 100);
		s.showDetails();
	}

}
