package lab4.Ex1;

public class StudentApp {

	public static void main(String[] args) {

		Student std [] = new Student [5];		
		std[0] = new Student("Amal", "IT", "0773973335");
		std[1] = new Student("Kamal", "SE", "0771234567");
		std[2] = new Student("Namal", "ISE", "0781234567");
		std[3] = new Student("Sumal", "CSNE", "0751234567");
		std[4] = new Student("Nimal", "CS", "0711234567");
		
		
		for (int i = 0; i < std.length; i++) {
			std[i].print();
		}
	}

}
