package com.model.animal.herbivores;

import java.util.List;
import java.util.Scanner;

import com.constants.Constants;
import com.model.abstracts.Animal;
import com.model.intefaces.CalculateProduct;
import com.model.intefaces.CalculateSpeed;
import com.model.intefaces.HorseService;

public class Horse extends Animal implements CalculateSpeed, CalculateProduct {

	public double endurance;
	public double weight;
	public double height;
	public double time;
	public double speed;

	public Horse(String species, String name, int age, String healthStatus, String breed, double endurance,
			double weight, double height, double time, double speed) {
		super(species, name, age, healthStatus, breed);
		this.endurance = endurance;
		this.weight = weight;
		this.height = height;
		this.time = time;
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getEndurance() {
		return endurance;
	}

	public void setEndurance(double endurance) {
		this.endurance = endurance;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	@Override
	public void enterAnimal() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter information about animal:");
			System.out.print("Enter animal type:");
			species = sc.next();
			System.out.print("Enter animal name:");
			name = sc.next();
			System.out.print("Enter animal age:");
			age = sc.nextInt();
			System.out.print("Health status:");
			healthStatus = sc.next();
			System.out.print("Bread:");
			breed = sc.next();
			System.out.print("Endurence:");
			endurance = sc.nextDouble();
			System.out.print("Weight:");
			weight = sc.nextDouble();
			System.out.print("Height:");
			height = sc.nextDouble();
			System.out.print("Time on 1000m in sec:");
			time = sc.nextDouble();
		} catch (Exception e) {
			System.err.print("Incorrect input, try again");
		}
	}

	@Override
	public void showAnimal() {
		Horse horse = new Horse(species, name, age, healthStatus, breed, endurance, weight, height, time, speed);
		System.out.println("Show information about animal:");
		System.out.println("Animal type:" + getSpecies());
		System.out.println("Animal name:" + getName());
		System.out.println("Animal age:" + getAge());
		System.out.println("Health status:" + getHealthStatus());
		System.out.println("Bread:" + getBreed());
		System.out.println("Endurence:" + getEndurance());
		System.out.println("Weight:" + getWeight());
		System.out.println("Height:" + getHeight());
		System.out.println("Speed is:" + horse.calculateSpeed(speed) + "m/s");
		System.out.println(getName() + " " + "is" + " " + ageAnimal());
		horse.move();
		System.out.println();
		horse.feeding();
		System.out.println();
		horse.watering();
		System.out.println();
		horse.helthCare();
	}

	@Override
	public String ageAnimal() {
		if (age <= 2) {
			return getSpecies() + " (young)";
		} else {
			return getSpecies() + " (old)";
		}

	}

	@Override
	public void move() {
		Horse horse = new Horse(species, name, age, healthStatus, breed, endurance, weight, height, time, speed);

		if (horse.calculateSpeed(speed) <= 1) {
			System.out.print("Horse walking.");
		} else if (horse.calculateSpeed(speed) < 3) {
			System.out.print("Horse gallop.");
		} else {
			System.out.print("Horse running.");
		}
	}

	@Override
	public double calculateSpeed(double speed) {
		return Constants.LENGHT / this.time;
	}

	@Override
	public void feeding() {
		System.out.print(getName() + " " + "is fed.");
		if (age <= 2) {
			System.out.print("Addition of special feed for foals. ");
		} else if (weight < 90) {
			System.out.print("Adding extra food to increase weight. ");
		}
		System.out.print("Giving standard food.");

	}

	@Override
	public void watering() {

		System.out.println(getName() + " " + "horse drinks water.");

		System.out.print("Provision of fresh water.");
	}

	@Override
	public void helthCare() {
		if (endurance < 5) {
			System.out.print(getName() + " " + "Receives health care.");
		} else {
			System.out.print("Regular veterinary examinations.");
		}

	}

	@Override
	public void product() {
	System.out.print("Horse giv foal.");

	}

}


