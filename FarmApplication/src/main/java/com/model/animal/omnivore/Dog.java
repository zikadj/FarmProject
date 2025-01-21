package com.model.animal.omnivore;

import java.util.Scanner;

import com.constants.Constants;
import com.model.abstracts.Animal;
import com.model.animal.herbivores.Horse;
import com.model.intefaces.CalculateSpeed;

public class Dog extends Animal implements CalculateSpeed {

	private double time;
	private int endurance;
	private double speed;

	public Dog(String species, String name, int age, String healthStatus, String breed, double time, int endurance,
			double speed) {
		super(species, name, age, healthStatus, breed);
		this.time = time;
		this.endurance = endurance;
		this.speed = speed;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurence(int endurance) {
		this.endurance = endurance;
	}

	public double getSpped() {
		return speed;
	}

	public void setSpped(double speed) {
		this.speed = speed;
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
			endurance = sc.nextInt();
			System.out.print("Time on 1000m in sec:");
			time = sc.nextDouble();
		} catch (Exception e) {
			System.err.print("Incorrect input, try again");
		}
	}

	@Override
	public void showAnimal() {
		Dog dog = new Dog(species, name, endurance, healthStatus, breed, time, endurance, speed);

		System.out.println("Show information about animal:");
		System.out.println("Animal type:" + getSpecies());
		System.out.println("Animal name:" + getName());
		System.out.println("Animal age:" + getAge());
		System.out.println("Health status:" + getHealthStatus());
		System.out.println("Bread:" + getBreed());
		System.out.println("Endurence:" + getEndurance());
		System.out.println("Speed is:" + dog.calculateSpeed(speed) + "m/s");
		System.out.println(getName() + " " + "is" + " " + ageAnimal());
		dog.move();
		System.out.println();
		dog.feeding();
		System.out.println();
		dog.watering();
		System.out.println();
		dog.helthCare();
	}

	@Override
	public double calculateSpeed(double speed) {

		return Constants.LENGHT / this.time;
	}

	@Override
	public void feeding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watering() {
		// TODO Auto-generated method stub

	}

	@Override
	public void helthCare() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		Dog dog = new Dog(species, name, endurance, healthStatus, breed, time, endurance, speed);

		if (dog.calculateSpeed(speed) <= 1) {
			System.out.print("Dog walking.");
		} else {
			System.out.print("Dog running.");
		}
	}

}