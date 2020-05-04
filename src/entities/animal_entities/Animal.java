package entities.animal_entities;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import entities.plant_entities.Plant;

public class Animal {
	private String name;
	private double weight;
	private double height;
	private double length;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, double weight, double height, double length) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.length = length;
	}
	
	public String getName() {
		return this.name;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	// Check if there are two same Plant objects
	//	in the diet of plants for a omnivore and a herbivore
	//	using a lambda expression.
	void NoTwoSamePlantsChecking(Plant newPlant, Set<Plant> plantSet, AtomicBoolean flag) {
		plantSet.forEach((plant) -> CheckIfUniquePlant(newPlant, plant, flag));
		addUniquePlant(newPlant, plantSet, flag);
	}
	
	// This is the methods that is used inside the lambda expression
	//	it check for all the plants in a set if the new plant name is this set.
	private void CheckIfUniquePlant(Plant newPlant, Plant currentPlant, AtomicBoolean flag) {
		if(newPlant.getName().equals(currentPlant.getName())) {
			// The plant is in the set.
			flag.set(true);
		}
	}
	
	// This prevent from the ConcurrentModificationException because there are two threads
	//	that use the plantSet set at the same time.
	private void addUniquePlant(Plant newPlant, Set<Plant> plantSet, AtomicBoolean flag) {
		if(flag.get()) {
			// If true, the plant is in the set.
			System.out.println(newPlant.getName() + " is already added!");
		} else {
			plantSet.add(newPlant);
		}
	}
}
