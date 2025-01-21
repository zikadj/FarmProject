package com.model.plant.vegetables;

import java.util.Scanner;

import com.model.abstracts.Plant;

public class Potateous extends Plant {

	private double calories;
	private String typePotateous;

	public Potateous(String name, String plantColor, double height, String poisonous, double calories,
			String typePotateous) {
		super(name, plantColor, height, poisonous);
		this.calories = calories;
		this.typePotateous = typePotateous;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public String getTypePotateous() {
		return typePotateous;
	}

	public void setTypePotateous(String typePotateous) {
		this.typePotateous = typePotateous;
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
		System.out.print("Calories plant:");
		calories = sc.nextDouble();
		System.out.print("Type:");
		typePotateous = sc.next();
	}

	@Override
	public void showPlants() {
		System.out.println("Show information about plant:");
		System.out.println("Name planet:" + getName());
		System.out.println("Color planet:" + getPlantColor());
		System.out.println("Height planet:" + getHeight());
		System.out.println("Poisonous:" + getPoisonous());
		System.out.println("Calories:" + getCalories());
		System.out.println("Type:" + getTypePotateous());
	}

}