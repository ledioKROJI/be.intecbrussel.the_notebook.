package service;

import entities.animal_entities.*;
import entities.plant_entities.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ForestNotebook {
	private List<Carnivore> carnivores;
	private List<Omnivore> omnivores;	
	private List<Herbivore> herbivores;	
	private int plantCount;	
	private int animalCount;
	// Can't be created from the app.
	private List<Animal> animals = new ArrayList<Animal>();	
	private List<Plant> plants = new ArrayList<Plant>();
	
	
	public ForestNotebook() {
		
	}
	
	// Added only to see the sorting effect
	public List<Plant> getPlants() {
		return this.plants;
	}
	
	//Added only to see the sorting effect
	public List<Animal> getAnimals(){
		return this.animals;
	}

	public List<Carnivore> getCarnivores() {
		return this.carnivores;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
		this.animals.addAll(carnivores);
	}

	public List<Omnivore> getOmnivores() {
		return this.omnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
		this.animals.addAll(omnivores);
	}

	public List<Herbivore> getHerbivores() {
		return this.herbivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
		this.animals.addAll(herbivores);
	}

	public int getPlantCount() {
		this.plantCount = this.plants.size();
		return this.plantCount;
	}

	public int getAnimalCount() {
		this.animalCount = this.animals.size();
		return this.animalCount;
	}
	
	public void addAnimal(Animal newAnimal) {
		if(this.animals.contains(newAnimal)) {
			System.out.println(newAnimal.getName() + " already there");
		} else {
			this.animals.add(newAnimal);
			this.addAnimalToSublists(newAnimal);
		}
	}
	
	public void addPlant(Plant newPlant) {
		if(this.plants.contains(newPlant)) {
			System.out.println(newPlant.getName() + " already there");
		} else {
			this.plants.add(newPlant);
		}
	}
	
	public void printNotebook() {
		System.out.println("These are the carinovres in the notebook: "
							+ this.getCarnivores());
		System.out.println("These are the herbivores in the notebook: "
							+ this.getHerbivores());
		System.out.println("These are the onmivores in the notebook: "
							+ this.getOmnivores());
		System.out.println("These are the plants in the notebook: "
							+ this.plants);
		System.out.println("This is a list of all animals: " 
							+ this.animals);
	}
	
	public void sortAnimalsByName() {
		Collections.sort(this.animals, new AnimalsByNameComparator());
	}
	
	public void sortPlantsByName() {
		Collections.sort(this.plants, new PlantsByNameComparator());
	}
	
	public void sortAnimalByHeight() {
		Collections.sort(this.animals, new AnimalsByHeightComparator());
	}
	
	public void sortPlantByHeight() {
		Collections.sort(this.plants, new PlantsByHeightComparator());
	}
	
	// Add a given animal to the corresponding list.
	private void addAnimalToSublists(Animal newAnimal) {
		if(newAnimal instanceof Carnivore) {
			this.carnivores.add((Carnivore) newAnimal);
		} else if(newAnimal instanceof Herbivore) {
			this.herbivores.add((Herbivore) newAnimal);
		} else if(newAnimal instanceof Omnivore) {
			this.omnivores.add((Omnivore) newAnimal);
		}
	}

}
