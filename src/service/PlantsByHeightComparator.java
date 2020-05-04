package service;

import java.util.Comparator;

import entities.plant_entities.Plant;

public class PlantsByHeightComparator implements Comparator<Plant>{

	@Override
	public int compare(Plant o1, Plant o2) {
		return (int) (o1.getHeight() - o2.getHeight());
	}

}
