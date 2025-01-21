package com.model.animal.herbivores;

import java.util.Scanner;

import com.model.abstracts.Animal;
import com.model.intefaces.CalculateProduct;

public class Goat extends Animal implements CalculateProduct {

	private double dailiYieldMilk;
	private double weight;

	public Goat(String species, String name, int age, String healthStatus, String breed, double dailiYieldMilk,
			double weight) {
		super(species, name, age, healthStatus, breed);
		this.dailiYieldMilk = dailiYieldMilk;
		this.weight = weight;
	}

	public double getDailiYieldMilk() {
		return dailiYieldMilk;
	}

	public void setDailiYieldMilk(double dailiYieldMilk) {
		this.dailiYieldMilk = dailiYieldMilk;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void enterAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter information about animal:");
		System.out.print("Enter animal type:");
		species = sc.next();
		System.out.print("Enter animal name:");
		name = sc.next();
		System.out.print("Enter animal age:");
		age = sc.nextInt();
		System.out.print("Health status:");
		healthStatus = sc.next();
		System.out.print("Race:");
		breed = sc.next();
		System.out.print("Daily yield milk:");
		dailiYieldMilk = sc.nextDouble();
		System.out.print("Weight:");
		weight = sc.nextDouble();

	}

	@Override
	public void showAnimal() {
		System.out.println("Show information about animal:");
		System.out.println("Animal type:" + getSpecies());
		System.out.println("Animal name:" + getName());
		System.out.println("Animal age:" + getAge());
		System.out.println("Health status:" + getHealthStatus());
		System.out.println("Race:" + getBreed());
		System.out.println("Daily yield milk:" + getDailiYieldMilk());
		System.out.println("Weight:" + getWeight());
	}

	@Override
	public String ageAnimal() {
		if (age <= 2) {
			return getSpecies() + " is young";
		} else {
			return getSpecies() + " is old";
		}
	}

	@Override
	public void move() {
		System.out.print("Goat jumps.");

	}

	@Override
	public void product() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Goat gives chesse and goat kid.");
	
		
	}

}
