package model;

 public class Sheep {
	private String age;
	private String cottoncolor;
	private String breeds;

 	public Sheep() {
		super();

 	}

 	public Sheep(String age, String cottoncolor, String breeds) {
		super();
		this.age = age;
		this.cottoncolor = cottoncolor;
		this.breeds = breeds;
	}

 	public String getage() {
		return age;
	}

 	public void setage(String age) {
		this.age = age;
	}

 	public String getcottoncolor() {
		return cottoncolor;
	}

 	public void setcottoncolor(String cottoncolor) {
		this.cottoncolor = cottoncolor;
	}

 	public String getbreeds() {
		return breeds;
	}

 	public void setbreeds(String breeds) {
		this.breeds = breeds;
	}

 	public String speak() {
		return "Baaaaah";
	}

 }