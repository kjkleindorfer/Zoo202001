package model;

public class Tiger {
	private String name;
	private int age;
	private String habitat;
	
	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tiger(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String speak() {
		return "Grrrr!";
	}

}
