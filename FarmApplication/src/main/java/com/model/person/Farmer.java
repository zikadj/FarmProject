package com.model.person;

public class Farmer extends Worker {

	private String animalmMintenance;
	private String cropProduction;

	public Farmer(String firstName, String lastName, int age, int id, int cardNumber, int phoneNumber, String position,
			double salary, int lengthOfService, String animalmMintenance, String cropProduction) {
		super(firstName, lastName, age, id, cardNumber, phoneNumber, position, salary, lengthOfService);
		this.animalmMintenance = animalmMintenance;
		this.cropProduction = cropProduction;
	}

	public String getAnimalmMintenance() {
		return animalmMintenance;
	}

	public void setAnimalmMintenance(String animalmMintenance) {
		this.animalmMintenance = animalmMintenance;
	}

	public String getCropProduction() {
		return cropProduction;
	}

	public void setCropProduction(String cropProduction) {
		this.cropProduction = cropProduction;
	}

}
