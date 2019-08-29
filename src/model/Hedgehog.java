package model;

public class Hedgehog {
	private String furColor;
	private String shoeColor;
	private String numberOfGames;
	
	public Hedgehog() {
	
	}
	
	public Hedgehog(String furColor, String shoeColor, String numberOfGames) {
		this.furColor = furColor;
		this.shoeColor = shoeColor;
		this.numberOfGames = numberOfGames;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public String getShoeColor() {
		return shoeColor;
	}

	public void setShoeColor(String shoeColor) {
		this.shoeColor = shoeColor;
	}

	public String getNumberOfGames() {
		return numberOfGames;
	}

	public void setNumberOfGames(String numberOfGames) {
		this.numberOfGames = numberOfGames;
	}

	public String speak() {
		return "Gotta go fast!";
	}

}
