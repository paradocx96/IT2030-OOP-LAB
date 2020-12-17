package lab3.Ex5;

public class PartTimeStudent extends Student{
	
	int noOfHours;

	public PartTimeStudent(String name, String address, String sid, int hours) {
		super(name, address, sid);
		noOfHours = hours;		
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("No of Hours : " + noOfHours);
	}

}
