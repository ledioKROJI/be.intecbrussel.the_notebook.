package entities.plant_entities;

public class Bush extends Plant {

	private String fruit;
	private LeafType leafType;
	
	public Bush(String name){
		super(name);
	}
	
	public Bush(String name, double height){
		super(name, height);
		
	}
	
	public String getFruit() {
		return this.fruit;
	}
	
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
	public LeafType getLeafType() {
		return this.leafType;
	}
	
	public void setLeaftType(LeafType leafType) {
		this.leafType = leafType;
	}
	
	public String toString() {
		return "name: " + super.getName();
		//		+ ", height: " + super.getHeight()
		//		+ ", fruit: " + this.getFruit()
		//		+ ", type of the leaf: " + this.getLeafType();
	}
}
