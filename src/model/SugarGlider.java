package model;


public class SugarGlider {
	private String name;
	private int maxGlide;
	private int age;

	public SugarGlider() {
		super();
	}

	public SugarGlider(String name, int maxGlide, int age) {
		super();
		this.name = name;
		this.maxGlide = maxGlide;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxGlide() {
		return maxGlide;
	}

	public void setMaxGlide(int maxGlide) {
		this.maxGlide = maxGlide;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String speak() {
		return "Squeak!";
	}

}