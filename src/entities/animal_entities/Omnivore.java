package entities.animal_entities;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import entities.plant_entities.Plant;

public class Omnivore extends Animal{
	private Set<Plant> plantDiet;
	private double maxFoodSize;
	
	public Omnivore(String name) {
		super(name);
	}
	
	public Omnivore(String name, double weidth, double height, double length) {
		super(name, weidth, height, length);
	}

	public Set<Plant> getPlantDiet() {
		return this.plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public double getMaxFoodSize() {
		return this.maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	
	public void addPlantToDiet(Plant plant) {
		// The AtomicBoolean is used to modify a local variable with a lambda expression.
		super.NoTwoSamePlantsChecking(plant, this.plantDiet, new AtomicBoolean(false));
	}
	
	public String toString() {
		return "name: "	+ super.getName();
	//	+ ", weight: " + super.getWeight()
	//	+ ", height: " + super.getHeight()
	//	+ ", length: " + super.getLength()
	//	+ ", plants of the diet: " + this.plantDiet
	//	+ ", max prey size: " + this.maxFoodSize;
	}
}
