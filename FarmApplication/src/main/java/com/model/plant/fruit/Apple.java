package com.model.plant.fruit;

import java.util.Scanner;

import com.model.abstracts.Plant;
import com.model.intefaces.Count;

public class Apple extends Plant implements Count {

	private double calories;
	private int numberApple;
	private String taste;

	public Apple(String name, String plantColor, double height, String poisonous, Double calories, String taste,
			int numberApple) {
		super(name, plantColor, height, poisonous);
		this.calories = calories;
		this.taste = taste;
		this.numberApple = numberApple;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public int getNumberApple() {
		return numberApple;
	}

	public void setNumberApple(int numberApple) {
		this.numberApple = numberApple;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public void enterPlant() {
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
		System.out.print("Number apple:");
		calories = sc.nextDouble();
		System.out.print("Taste plant:");
		taste = sc.next();
		sc.close();
	}

	public void showPlant() {
		System.out.println("Show information about plant:");
		System.out.println("Name planet:" + getName());
		System.out.println("Color planet:" + getPlantColor());
		System.out.println("Height planet:" + getHeight());
		System.out.println("Poisonous:" + getPoisonous());
		System.out.println("Calories:" + getCalories());
		System.out.println("Number apple:" + getNumberApple());
		System.out.println("Taste:" + getTaste());
	}

	@Override
	public double countCalories() {
		return numberApple * 3000 / 100;
	}

	@Override
	public void EnterObj() {
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
		System.out.print("Number apple:");
		calories = sc.nextDouble();
		System.out.print("Taste plant:");
		taste = sc.next();
		sc.close();

	}

	@Override
	public void showObj() {
		System.out.println("Show information about plant:");
		System.out.println("Name planet:" + getName());
		System.out.println("Color planet:" + getPlantColor());
		System.out.println("Hight planet:" + getHeight());
		System.out.println("Poisonous:" + getPoisonous());
		System.out.println("Calories:" + getCalories());
		System.out.println("Number apple:" + getNumberApple());
		System.out.println("Taste:" + getTaste());
		System.out.print("Calories for apple:" + countCalories());
	}

}
