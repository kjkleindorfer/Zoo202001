package model;

import java.util.Random;

public class Fox {
	private String furColor;
	private String eyeColor;
	private String age;
	private Random rand;
	private final String[] noises = {"Jacha-chacha-chacha-chow!",
	                                 "Fraka-kaka-kaka-kaka-kow!",
	                                 "A-hee-ahee ha-hee!",
	                                 "A-oo-oo-oo-ooo!"};
	
	public Fox() {
		super();
		this.rand = new Random();
	}

	public Fox(String furColor, String eyeColor, String age) {
		super();
		this.furColor = furColor;
		this.eyeColor = eyeColor;
		this.age = age;
		this.rand = new Random();
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String speak() {
		return noises[rand.nextInt(noises.length)];
	}

}
