package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.*;

import service.ForestNotebook;

public class NatureApp {

	public static void main(String[] args) {
		ForestNotebook records = new ForestNotebook();
		Set<Plant> commonDiet = new HashSet<Plant>();
		
		// Plants.
		Bush myBush = new Bush("Bush50", 50);
		myBush.setFruit("Strawberry");
		myBush.setLeaftType(LeafType.NEEDLE);
		
		Flower myFlower = new Flower("Flower30", 30);
		myFlower.setSmell(Scent.ORANGE);
		
		Weed myWeed = new Weed("Weed20", 20);
		myWeed.setArea(100);
		
		Tree myTree = new Tree("Tree70", 70);
		myTree.setLeafType(LeafType.ROUND);
		
		Tree newTree = new Tree("newTree", 170);
		myTree.setLeafType(LeafType.ROUND);
		
		// Creating a diet for herbivores and omnivores.
		commonDiet.add(myBush);
		commonDiet.add(myFlower);
		commonDiet.add(myWeed);
		commonDiet.add(myTree);
		
		// Adding plant in the notebook.
		records.addPlant(myTree);
		records.addPlant(myWeed);
		records.addPlant(myFlower);
		records.addPlant(myBush);
		
		// Two same object checking.
		System.out.print("Trying to add the same object: ");
		records.addPlant(myBush);
		
		System.out.println(records.getPlants());
		System.out.println();
		
		// Sorting Plants.
		records.sortPlantByHeight();
		System.out.println("Sorting plants by heights");
		System.out.println(records.getPlants());

		
		records.sortPlantsByName();
		System.out.println("Sorting plants by names");
		System.out.println(records.getPlants());
		System.out.println();
		
		// Animals.
		// Herbivores.
		Herbivore myFirstHerbivore = new Herbivore("aHerbivore40", 60, 40, 50);
		myFirstHerbivore.setPlantDiet(commonDiet);
		
		Herbivore mySecondHerbivore = new Herbivore("bHerbivore5", 10, 5, 5);
		mySecondHerbivore.setPlantDiet(commonDiet);
		
		Herbivore myThirdHerbivore = new Herbivore("cHerbivore110", 90, 110, 70);
		myThirdHerbivore.setPlantDiet(commonDiet);
		
		List<Herbivore> myHerbivoreList = new ArrayList<Herbivore>();
		myHerbivoreList.add(myFirstHerbivore);
		myHerbivoreList.add(mySecondHerbivore);
		
		// Omnivores.
		Omnivore myFirstOmnivore = new Omnivore("aOmnivore40", 80, 40, 50);
		myFirstOmnivore.setPlantDiet(commonDiet);
		myFirstOmnivore.setMaxFoodSize(50);
		
		Omnivore mySecondOmnivore = new Omnivore("bOmnivore90", 90, 90, 46);
		mySecondOmnivore.setPlantDiet(commonDiet);
		mySecondOmnivore.setMaxFoodSize(90);
		
		Omnivore myThirdOmnivore = new Omnivore("cOmnivore150", 150, 150, 200);
		myThirdOmnivore.setPlantDiet(commonDiet);
		myThirdOmnivore.setMaxFoodSize(150);
		
		List<Omnivore> myOmnivoreList = new ArrayList<Omnivore>();
		myOmnivoreList.add(myFirstOmnivore);
		myOmnivoreList.add(mySecondOmnivore);
		
		// Carnivores.
		Carnivore myFirstCarnivore = new Carnivore("aCarnivore45", 45, 45, 30);
		myFirstCarnivore.setMaxFoodSize(50);
		
		Carnivore mySecondCarnivore = new Carnivore("bCarnivore600", 600, 600, 400);
		mySecondCarnivore.setMaxFoodSize(90);
		
		Carnivore myThirdCarnivore = new Carnivore("cCarnivore77", 77, 77, 99);
		myThirdCarnivore.setMaxFoodSize(700);
		
		List<Carnivore> myCarnivoreList = new ArrayList<Carnivore>();
		myCarnivoreList.add(myFirstCarnivore);
		myCarnivoreList.add(mySecondCarnivore);
		
		// Adding a plant to a herbivore, omnivore diet.
		System.out.println();
		System.out.println("Adding plant to a diet: ");
		// This a new plant.
		myFirstOmnivore.addPlantToDiet(newTree);
		System.out.println(myFirstOmnivore.getPlantDiet());
		// This is a used plant.
		myFirstOmnivore.addPlantToDiet(myWeed);
		System.out.println(myFirstOmnivore.getPlantDiet());
		
		// Adding animals by sets.
		records.setHerbivores(myHerbivoreList);
		records.setOmnivores(myOmnivoreList);
		records.setCarnivores(myCarnivoreList);
		
		System.out.println();
		System.out.println("Sets of animals :");
		System.out.println(records.getHerbivores());
		System.out.println(records.getOmnivores());
		System.out.println(records.getCarnivores());

		// Adding animals with the addAnimal method.
		System.out.println();
		System.out.println("Adding animals one by one");
		records.addAnimal(myThirdCarnivore);
		records.addAnimal(myThirdOmnivore);
		records.addAnimal(myThirdHerbivore);
		System.out.println(records.getAnimals());

		// Sorting animals.
		System.out.println();
		System.out.println("Sorting animals by heights: ");
		records.sortAnimalByHeight();
		System.out.println(records.getAnimals());
		
		System.out.println();
		System.out.println("Sorting animals by names: ");
		records.sortAnimalsByName();
		System.out.println(records.getAnimals());
		
		// Final print.
		System.out.println();
		System.out.println("Final list of animals and plants");
		records.printNotebook();
		
		// Count of entities.
		System.out.println();
		System.out.println("Animal count : " + records.getAnimalCount());
		System.out.println("Plant count : " + records.getPlantCount());
			
	}

}
