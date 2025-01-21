package com.model.abstracts;

import java.util.Scanner;


public abstract class Animal {
	
	public static final double LENGHT = 1000.0;

	protected String species;
	protected String name;
	protected int age;
	protected String healthStatus;
	protected String breed;

	public Animal(String species, String name, int age, String healthStatus, String breed) {
		super();
		this.species = species;
		this.name = name;
		this.age = age;
		this.healthStatus = healthStatus;
		this.breed = breed;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void enterAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter information about animal:");
		System.out.print("Enter animal species:");
		species = sc.next();
		System.out.print("Enter animal name:");
		name = sc.next();
		System.out.print("Enter animal age:");
		age = sc.nextInt();
		System.out.print("Health status:");
		healthStatus = sc.next();
		System.out.print("Race:");
		breed = sc.next();
		sc.close();

	}

	public void showAnimal() {
		System.out.println("Show information about animal:");
		System.out.println("Animal type:" + getSpecies());
		System.out.println("Animal name:" + getName());
		System.out.println("Animal age:" + getAge());
		System.out.println("Health status:" + getHealthStatus());
		System.out.println("Race:" + getBreed());

	}

	public String ageAnimal() {
		if (age <= 5) {
			return getSpecies() + " is young";
		} else {
			return getSpecies() + " is old";
		}

	}

	public abstract void move();
}
