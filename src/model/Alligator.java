package model;

public class Alligator {

	private int length; // length of the alligator in feet
	private int age;  // age of the alligator in years
	private String name;  // name of the alligator (because every alligator has a name!?)
	
	
	public Alligator(int length, int age, String name) {
		this.length = length;
		this.age = age;
		this.name = name;
		
	}
	
	public String speak() {
		return "Grrrr";
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
