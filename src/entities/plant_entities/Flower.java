package entities.plant_entities;

public class Flower extends Plant {
	private Scent smell;
	
	public Flower(String name) {
		super(name);
	}
	
	public Flower(String name, double height) {
		super(name, height);
	}
	
	public Scent getSmell() {
		return this.smell;	
	}
	
	public void setSmell(Scent smell) {
		this.smell = smell;
	}
	
	public String toString() {
		return "name: " + super.getName();
	//	+ ", height: " + super.getHeight()
	//	+ ", scent: " + this.getSmell();
	}
	
}
