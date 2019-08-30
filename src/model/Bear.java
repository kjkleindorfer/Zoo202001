package model;

public class Bear {

	private String name;
	private String type;
	private double weight;
	
	
	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bear(String name, String type, double weight) {
		super();
		this.name = name;
		this.type = type;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String speak() {
		return "Growl";
	}
}
