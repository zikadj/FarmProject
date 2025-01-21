package com.model.animal.herbivores;

import java.util.Scanner;

import com.model.abstracts.Animal;
import com.model.intefaces.CalculateProduct;

public class Cow extends Animal implements CalculateProduct {

	private double dailyMilkYield;
	private String vaccinated;

	public Cow(String species, String name, int age, String healthStatus, String breed, double dailyMilkYield,
			String vaccinated) {
		super(species, name, age, healthStatus, breed);
		this.dailyMilkYield = dailyMilkYield;
		this.vaccinated = vaccinated;

	}

	public double getDailyMilkYield() {
		return dailyMilkYield;
	}

	public void setDailyMilkYield(double dailyMilkYield) {
		this.dailyMilkYield = dailyMilkYield;
	}

	public String getVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(String vaccinated) {
		this.vaccinated = vaccinated;
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
		dailyMilkYield = sc.nextDouble();
		System.out.print("Vaccinated:");
		vaccinated = sc.next();

	}

	@Override
	public void showAnimal() {
		System.out.println("Show information about animal:");
		System.out.println("Animal type:" + getSpecies());
		System.out.println("Animal name:" + getName());
		System.out.println("Animal age:" + getAge());
		System.out.println("Health status:" + getHealthStatus());
		System.out.println("Race:" + getBreed());
		System.out.println("Daily yield milk:" + getDailyMilkYield());
		System.out.println("Vaccinated:" + getVaccinated());

	}

	@Override
	public String ageAnimal() {
		if (age <= 3) {
			return getSpecies() + " is young";
		} else {
			return getSpecies() + " is old";
		}
	}

	@Override
	public void move() {
		System.out.print("Cow is wolking.");

	}

	@Override
	public void product() {
		System.out.print("Cow gives calf and milk.");

	}
	
	
	}


