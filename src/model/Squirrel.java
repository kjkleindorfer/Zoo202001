// Tori Kelly
package model;

public class Squirrel {

	private String name;
	private String color;
	private int acquiredNuts;
	
	public Squirrel() {
		super();
	}
	
	public Squirrel(String name, String color, int age) {
		super();
		this.name= name;
		this.color = color;
		this.acquiredNuts = acquiredNuts;
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

	public int getAcquiredNuts() {
		return acquiredNuts;
	}

	public void setAcquiredNuts(int acquiredNuts) {
		this.acquiredNuts = acquiredNuts;
	}

	public String speak() {
		return "Che che chit chitchit!";
	}
}
