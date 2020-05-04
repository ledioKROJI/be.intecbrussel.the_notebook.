package entities.plant_entities;

public class Weed extends Plant {
	private double area;
	
	public Weed(String name) {
		super(name);
	}
	
	public Weed(String name, double height) {
		super(name, height);
	}
	
	public double getArea() {
		return this.area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public String toString() {
		return "name: " + super.getName();
	//	+ ", height: " + super.getHeight()
	//	+ ", area: " + this.getArea();
	}
}
