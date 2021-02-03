package lab4.Ex1;

public class Student {

	
	private int studentID; 
	private  String name, degree, mobile;
	
	private static int max = 100;

	public Student(String name, String degree, String mobile) {
		super();
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public String getDegree() {
		return degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	public void print() {
		System.out.println("Student ID : " + getNextStudentID());
		System.out.println("Student Name : " + getName());
		System.out.println("Student Degee : " + getDegree());
		System.out.println("Student Mobile : " + getMobile() + "\n");
	}
	
	static int getNextStudentID() {		
		return max++;
	}
}
