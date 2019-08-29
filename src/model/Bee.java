package model;

/**
 * This is a Bee class.  
 * @author Erik E Johnson
 *
 */
public class Bee {
	// instance variables
	private String colonyName;
	private String casteType;
	private int number;
	
	// Constructor
	public Bee(String cn, String ct, int n) {
		this.setColonyName(cn);
		this.setCasteType(ct);
		this.setNumber(n);
	}

	// Getters and Setters
	public String getColonyName() {
		return colonyName;
	}

	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}

	public String getCasteType() {
		return casteType;
	}

	public void setCasteType(String ct) {
		
		if (ct.compareTo("Worker") == 0) {
			this.casteType = "Worker";
		}
		else if (ct.compareTo("Queen") == 0) {
			this.casteType = "Queen";
		}
		else {
			this.casteType = "Drone";
		}
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int n) {
		this.number = n;
	}
	
	// helper methods
	public String speak() {
		return "Bzzzzz!";
	}
}
