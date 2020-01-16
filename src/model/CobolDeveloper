package model;

import java.util.Random;

public class CobolDeveloper {
	
	private Random randy;
	private int age;
	private String predator;
	private String prey;
	private String quotes[] = {
		"Back in my day...",
		"I don't care if it is right or not, I just want it to go away.",
		"Why do we have to do so much training?!?!",
		"When people say 'OK Boomer', is that meant as an insult?",
		"<Insert 2 hour conversation about retirement>",
		"Do I look like a web developer? I'm 6 legs short of being one.",
		"Are you online okay?"
	};
	
	public CobolDeveloper() {
		this.randy = new Random();
		setAge(randy.nextInt(20) + 65);
		setPredator("Death");
		setPrey("Unsuspecting front-end developers");
	}
	
	public CobolDeveloper(int age) {
		this.randy = new Random();
		setAge(age);
		setPredator("Death");
		setPrey("Unsuspecting front-end developers");
	}
	
	public void setAge(int age) {
		this.age = Math.max(60, age);
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setPredator(String predator) {
		this.predator = predator;
	}
	
	public String getPredator() {
		return this.predator;
	}
	
	public void setPrey(String prey) {
		this.prey = prey;
	}
	
	public String getPrey() {
		return this.prey;
	}
	
	public String speak() {
		return quotes[randy.nextInt(quotes.length-1)];
	}

}
