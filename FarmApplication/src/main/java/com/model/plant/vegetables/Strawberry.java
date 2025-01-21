package com.model.plant.vegetables;

import java.util.Scanner;

import com.model.abstracts.Plant;

public class Strawberry extends Plant {

	public String typeStrawberry;
	public double amountSugar;

	public Strawberry(String name, String plantColor, double height, String poisonous, String typeStrawberry,
			double amountSugar) {
		super(name, plantColor, height, poisonous);
		this.typeStrawberry = typeStrawberry;
		this.amountSugar = amountSugar;
	}

	public String getTypeStrawberry() {
		return typeStrawberry;
	}

	public void setTypeStrawberry(String typeStrawberry) {
		this.typeStrawberry = typeStrawberry;
	}

	public double getAmountSugar() {
		return amountSugar;
	}

	public void setAmountSugar(double amountSugar) {
		this.amountSugar = amountSugar;
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
		System.out.print("Amount sugar");
		amountSugar = sc.nextDouble();
		System.out.print("Type plant:");
		typeStrawberry = sc.next();
	}

	@Override
	public void showPlants() {
		System.out.println("Show information about plant:");
		System.out.println("Name planet:" + getName());
		System.out.println("Color planet:" + getPlantColor());
		System.out.println("Height planet:" + getHeight());
		System.out.println("Poisonous:" + getPoisonous());
		System.out.println("Amount sugar:" + getAmountSugar());
		System.out.println("Type:" + getTypeStrawberry());
	}
}