package model;

public class Monkey {
	
	private String partner;
	private boolean everHadAFriendLikeMe;
	private String clothes;
	
	public Monkey() {
		super();
		this.partner = "Aladdin";
		this.everHadAFriendLikeMe = false;
		this.clothes = "Vest and a lil red hat";
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public boolean isEverHadAFriendLikeMe() {
		return everHadAFriendLikeMe;
	}

	public void setEverHadAFriendLikeMe(boolean everHadAFriendLikeMe) {
		this.everHadAFriendLikeMe = everHadAFriendLikeMe;
	}

	public String getClothes() {
		return clothes;
	}

	public void setClothes(String clothes) {
		this.clothes = clothes;
	}
	
	public String speak() {
		return "Aladdin, I'm not sure I want to be complacent in these street crimes any more";
	}
	
	

}
