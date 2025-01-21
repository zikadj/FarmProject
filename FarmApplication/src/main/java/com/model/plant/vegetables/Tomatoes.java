package com.model.plant.vegetables;

import java.util.Scanner;

import com.model.abstracts.Plant;

public class Tomatoes extends Plant {

	public String typeTomatoes;
	public String origin;
	public String growthType;

	public Tomatoes(String name, String plantColor, double hight, String poisonous, String typeTomatoes, String origin,
			String growthType) {
		super(name, plantColor, hight, poisonous);
		this.typeTomatoes = typeTomatoes;
		this.origin = origin;
		this.growthType = growthType;
	}

	public String getTypeTomatoes() {
		return typeTomatoes;
	}

	public void setTypeTomatoes(String typeTomatoes) {
		this.typeTomatoes = typeTomatoes;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getGrowthType() {
		return growthType;
	}

	public void setGrowthType(String growthType) {
		this.growthType = growthType;
	}

	@Override
	public void enterPlants() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter information about plant:");
		System.out.print("Enter plant name:");
		name = sc.next();
		System.out.print("Enter color plant:");
		plantColor = sc.next();
		System.out.print("Enter height plant:");
		height = sc.nextDouble();
		System.out.print("Poisonous plant:");
		poisonous = sc.next();
		System.out.print("Type plant:");
		typeTomatoes = sc.next();
		System.out.print("Origin plant:");
		origin = sc.next();
		System.out.print("Grow type plant:");
		origin = sc.next();
	}

	@Override
	public void showPlants() {
		System.out.println("Show information about plant:");
		System.out.println("Name planet:" + getName());
		System.out.println("Color planet:" + getPlantColor());
		System.out.println("Height planet:" + getHeight());
		System.out.println("Poisonous:" + getPoisonous());
		System.out.println("Type:" + getTypeTomatoes());
		System.out.println("Origin:" + getOrigin());
		System.out.println("Growth type:" + getGrowthType());
	}
}
