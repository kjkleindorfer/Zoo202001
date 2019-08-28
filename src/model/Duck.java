package model;

public class Duck {

	private String predator;
	private String breed;
	private int age;
	
	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Duck(String predator, String breed, int age) {
		super();
		this.predator = predator;
		this.breed = breed;
		this.age = age;
	}
		
	public String getPredator() {
		return predator;
	}
	
	public void setPredator(String predator) {
		this.predator = predator;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String speak() {
		return "Quack";
	}

}
