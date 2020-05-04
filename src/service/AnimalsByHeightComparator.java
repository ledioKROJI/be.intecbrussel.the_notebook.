package service;

import java.util.Comparator;

import entities.animal_entities.Animal;

public class AnimalsByHeightComparator implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		return (int) (o1.getHeight() - o2.getHeight());
	}

}
