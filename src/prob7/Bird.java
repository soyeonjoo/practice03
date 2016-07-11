package prob7;

public abstract class Bird {

	private String name;
	private int legs;
	private int length;
	

	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Bird [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
	public abstract void fly();
	public abstract void sing();
		
	
}
