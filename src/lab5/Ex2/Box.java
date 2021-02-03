package lab5.Ex2;

public class Box implements ICompute {

	private int length, width, height, volume;
	
	public Box(int length, int width, int height, int volume) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.volume = volume;
	}

	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getVolume() {
		return volume;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void calculate() {		
		volume = width * height * length;
		System.out.println("Calculated Volume : " + volume);
	}

	@Override
	public void display() {

		System.out.println("Interface so display");
	}

}
