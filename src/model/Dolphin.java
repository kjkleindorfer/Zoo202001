package model;

public class Dolphin {
	private String name;
	private int weight;
	private String breed;

    public Dolphin() {
	    super();
    }
    
    public Dolphin(String name, int weight, String breed) {
    	super();
    	this.name = name;
    	this.weight = weight;
    	this.breed = breed;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
    
    public String speak() {
    	return "Ee eh iyehehe!";
    }
}
