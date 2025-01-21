package com.model.abstracts;

public abstract class Plant {

	public String name;
	public String plantColor;
	public double height;
	public String poisonous;

	public Plant(String name, String plantColor, double height, String poisonous) {
		super();
		this.name = name;
		this.plantColor = plantColor;
		this.height = height;
		this.poisonous = poisonous;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlantColor() {
		return plantColor;
	}

	public void setPlantColor(String plantColor) {
		this.plantColor = plantColor;
	}

	public double getHeight() {
		return height;
	}

	public void setHight(double height) {
		this.height = height;
	}

	public String getPoisonous() {
		return poisonous;
	}

	public void setPoisonous(String poisonous) {
		this.poisonous = poisonous;
	}

	public void enterPlants() {

	}

	public void showPlants() {

	}

}
