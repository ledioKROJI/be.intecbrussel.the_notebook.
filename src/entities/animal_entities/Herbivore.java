package entities.animal_entities;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import entities.plant_entities.Plant;


public class Herbivore extends Animal {
	private Set<Plant> plantDiet;
	
	
	public Herbivore(String name) {
		super(name);
	}
	
	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}
	
	
	public Set<Plant> getPlantDiet() {
		return this.plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	
	public void addPlantToDiet(Plant plant) {
		// The AtomicBoolean is used to modify a local variable within a lambda expression.
		super.NoTwoSamePlantsChecking(plant, this.plantDiet, new AtomicBoolean(false));
	}
	
	public void printDiet() {
		// Trying stream API.
		plantDiet.stream().limit((plantDiet.size() - 1)).forEach(n -> System.out.print(n + ", "));
		plantDiet.stream().skip((plantDiet.size() - 1)).forEach(n -> System.out.print(n));
	}
	
	public String toString() {
		return "name: "	+ super.getName();
		//		+ ", weight: " + super.getWeight()
		//		+ ", height: " + super.getHeight()
		//		+ ", length: " + super.getLength()
		//		+ ", plants of the diet: " + this.plantDiet;
	}
}
