package service;

import java.util.Comparator;
import entities.animal_entities.Animal;

public class AnimalsByNameComparator implements Comparator<Animal>{

	@Override
	public int compare(Animal a1, Animal a2) {
		return a1.getName().compareTo(a2.getName());
	}

}
