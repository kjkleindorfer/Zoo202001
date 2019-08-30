package model;

public class Groundhog {

	private String name;
	private boolean shadow;
	private String birthdate;
	
	
	public Groundhog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isShadow() {
		return shadow;
	}
	public void setShadow(boolean shadow) {
		this.shadow = shadow;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String speak() {
		return "nope";
	}
}
