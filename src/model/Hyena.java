package model;

public class Hyena {
	
	private String gender;
	private int age;
	private double weight;
	
	public Hyena() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hyena(String gender, int age, double weight) {
		super();
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String speak() {
		return "Hahaha";
	}

}
