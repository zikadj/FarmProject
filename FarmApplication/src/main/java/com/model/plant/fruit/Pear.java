package com.model.plant.fruit;

import java.util.Scanner;

import com.model.abstracts.Plant;

import java.util.Scanner;

public class Pear extends Plant {

	public String typePear;
	public String origin;
	public double amountSugar;

	public Pear(String name, String plantColor, double height, String poisonous, String typePear, String origin,
			double amountSugar) {
		super(name, plantColor, height, poisonous);
		this.typePear = typePear;
		this.origin = origin;
		this.amountSugar = amountSugar;
	}

	public String getTypePear() {
		return typePear;
	}

	public void setTypePear(String typePear) {
		this.typePear = typePear;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
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
		System.out.print("Type plant:");
		typePear = sc.next();
		System.out.print("Origin plant:");
		origin = sc.next();
		System.out.print("Amount sugar");
		amountSugar = sc.nextDouble();
	}

	@Override
	public void showPlants() {
		System.out.println("Show information about plant:");
		System.out.println("Name planet:" + getName());
		System.out.println("Color planet:" + getPlantColor());
		System.out.println("Height planet:" + getHeight());
		System.out.println("Poisonous:" + getPoisonous());
		System.out.println("Type:" + getTypePear());
		System.out.println("Origin:" + getOrigin());
		System.out.println("Amount sugar:" + getAmountSugar());

	}

}
