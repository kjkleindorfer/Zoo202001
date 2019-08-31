package model;

public class Raven {

	
	private String gender;
	private int age;
	private int intelligenceQuotient;
	
	public Raven() {
		super();
	}

	public Raven(String gender, int age, int iQ) {
		super();
		this.gender = gender;
		this.age = age;
		this.intelligenceQuotient = iQ;
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

	public double getIQ() {
		return intelligenceQuotient;
	}

	public void setIQ(int iQ) {
		this.intelligenceQuotient = iQ;
	}
	
	public String speak() {
		return "Cawww Cawww Cawww";
	}

}
