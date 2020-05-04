package service;

import java.util.Comparator;

import entities.plant_entities.Plant;

public class PlantsByNameComparator implements Comparator<Plant>{

	@Override
	public int compare(Plant p1, Plant p2) {
		return p1.getName().compareTo(p2.getName());
	}

}
