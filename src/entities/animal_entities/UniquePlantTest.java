package entities.animal_entities;

import java.util.HashSet;
import java.util.Set;

import entities.plant_entities.*;

public class UniquePlantTest {

	public static void main(String[] args) {
		Set<Plant> setOfPlants = new HashSet<Plant>();
		Herbivore myHerbivore = new Herbivore("My herbivore");


		Bush myBush = new Bush("Bush50", 50);
		myBush.setFruit("Strawberry");
		myBush.setLeaftType(LeafType.NEEDLE);
		
		Flower myFlower = new Flower("Flower30", 30);
		myFlower.setSmell(Scent.ORANGE);
		
		Weed myWeed = new Weed("Weed20", 20);
		myWeed.setArea(100);
		
		Tree myTree = new Tree("Tree70", 70);
		myTree.setLeafType(LeafType.ROUND);
		
		Tree newTree = new Tree("NewTree", 170);
		myTree.setLeafType(LeafType.ROUND);
				
		setOfPlants.add(myTree);
		setOfPlants.add(myWeed);
		setOfPlants.add(myFlower);
		setOfPlants.add(myBush);
		
		myHerbivore.setPlantDiet(setOfPlants);
		
		myHerbivore.addPlantToDiet(myWeed);
		myHerbivore.addPlantToDiet(newTree);
		
		System.out.println(myHerbivore.getPlantDiet());
	}

}
