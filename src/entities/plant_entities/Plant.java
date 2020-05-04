package entities.plant_entities;

public class Plant {
	private String name;
	private double height;
	
	public Plant(String name) {
		this.name = name;
	}
	
	public Plant(String name, double height) {
		this(name);
		this.height = height;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}
