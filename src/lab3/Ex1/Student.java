package lab3.Ex1;

public class Student {

	String name;
	String ditno;
	String address;
		
	public Student() {
		super();
	}

	public Student(String name, String ditno, String address) {
		super();
		this.name = name;
		this.ditno = ditno;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public String getDitno() {
		return ditno;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDitno(String ditno) {
		this.ditno = ditno;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void printDetails() {
		System.out.println("Name : " + name + "\nDIT_NO : " + ditno + "\nAddress : " + address);
	}
	
	public String getDetails() {
		String details = "I am a Student.\nMy name is " + getName() + 
				"\nI am from " + 	getAddress() + 
				"\nMy dit no is " + getDitno();
		
		return details;		
	}
}
