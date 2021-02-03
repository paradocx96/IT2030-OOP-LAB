package lab5.Ex2;

public class Person implements ICompute {
	
	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;

	public Person(String name, double basicSal, double otRate, double otHrs, double netSal) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
		this.netSal = netSal;
	}

	public String getName() {
		return name;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public double getOtRate() {
		return otRate;
	}

	public double getOtHrs() {
		return otHrs;
	}

	public double getNetSal() {
		return netSal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public void setOtRate(double otRate) {
		this.otRate = otRate;
	}

	public void setOtHrs(double otHrs) {
		this.otHrs = otHrs;
	}

	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}

	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
