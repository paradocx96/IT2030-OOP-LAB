package lab3.Ex5;

public class Student extends Person {
	
	String studentid;

	public Student(String name, String address, String sid) {
		super(name, address);
		studentid = sid;
	}

	public void showDetails() {
		super.showDetails();
		System.out.println("My ID : " + studentid);
	}
}
