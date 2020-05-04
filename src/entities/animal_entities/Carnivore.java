package entities.animal_entities;

public class Carnivore extends Animal {
	private double maxFoodSize;
	
	public Carnivore(String name) {
		super(name);
	}
	
	public Carnivore(String name, double weight, double heigth, double length) {
		super(name, weight, heigth, length);
	}

	public double getMaxFoodSize() {
		return this.maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	
	public String toString() {
		return "name: "	+ super.getName();
	//	+ ", weight: " + super.getWeight()
	//	+ ", height: " + super.getHeight()
	//	+ ", length: " + super.getLength()
	//	+ ", food size: " + this.maxFoodSize;
	}
}
