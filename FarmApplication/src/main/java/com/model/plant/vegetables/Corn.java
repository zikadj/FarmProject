package com.model.plant.vegetables;

import java.time.LocalDate;
import java.util.Scanner;

import com.model.abstracts.Crops;

public class Corn extends Crops {

	public int weight;
	public int resistance;

	public Corn(String type, LocalDate plantingTime, LocalDate ripeningTame, String shape, double price, int weight,
			int resistance) {
		super(type, plantingTime, ripeningTame, shape, price);
		this.weight = weight;
		this.resistance = resistance;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getResistance() {
		return resistance;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
	}

	@Override
	public void enterCrops() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter information about crops:");
		System.out.print("Enter crop type:");
		type = sc.next();
		System.out.print("Enter crop planting time:");
		String plantingTime = sc.next();
		System.out.print("Enter ripening time:");
		String ripeningTame = sc.next();
		System.out.print("Shape:");
		shape = sc.next();
		System.out.print("Weight:");
		weight = sc.nextInt();
		System.out.print("Resistence:");
		resistance = sc.nextInt();
		sc.close();
	}

	@Override
	public void showCrops() {
		System.out.println("Show information about crops:");
		System.out.println("Crops type:" + getType());
		System.out.println("Planting time:" + getPlantingTime());
		System.out.println("Ripening time:" + getRipeningTame());
		System.out.println("Shape:" + getShape());
		System.out.println("Price:" + getPrice());
		System.out.println("Weight:" + getWeight());
		System.out.println("Resistence:" + getResistance());
	}
}