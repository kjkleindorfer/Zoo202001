package model;

public class Mouse {
	private String name;
	private String color;
	private String talks;

	public Mouse() {
		// TODO Auto-generated constructor stub
	}

	public Mouse(String name, String color, String talks) {
		this.name = name;
		this.color = color;
		this.talks = talks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalks() {
		return talks;
	}

	public void setTalks(String talks) {
		this.talks = talks;
	}

	public String speak() {
		return "Hot Diggity Dog!";
	}

}
