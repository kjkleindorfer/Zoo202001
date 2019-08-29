package model;

public class Chicken {

	//Ian Tibe
	//properties
	private String color;
	private String breed;
	private float weight;
	
	//constructor
	public Chicken() {
		super();
	}
	
	public Chicken(String color, String breed, float weight) {
		super();
		this.color = color;
		this.breed = breed;
		this.weight = weight;
	}

	//getter and setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	//methods
	public String speak() {
		return "Cluck! Cluck!";
	}
	
}
