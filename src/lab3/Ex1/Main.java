package lab3.Ex1;

public class Main {

	public static void main(String[] args) {
		
		// Exercise 1		
		Student s1 = new Student();		
		s1.name = "Navinda";
		s1.ditno = "19180526";
		s1.address = "Gampaha";		
		s1.printDetails();
		System.out.println();
		
		//Exercise 2
		Student s2 = new Student("Lankesh","62508191","Pugoda");			
		s2.printDetails();
		System.out.println();
		
		
		Student s3 = new Student();
		s3.setName("Dilanga");
		s3.setDitno("12345678");
		s3.setAddress("Kirindiwela");
		
		
		System.out.println(s3.getDetails());
		System.out.println();
			
	}

}
