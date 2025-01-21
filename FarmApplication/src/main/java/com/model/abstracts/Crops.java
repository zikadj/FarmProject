package com.model.abstracts;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Crops {

	protected String type;
	protected LocalDate plantingTime;
	protected LocalDate ripeningTame;
	protected String shape;
	protected double price;

	public Crops(String type, LocalDate plantingTime, LocalDate ripeningTame, String shape, double price) {
		super();
		this.type = type;
		this.plantingTime = plantingTime;
		this.ripeningTame = ripeningTame;
		this.shape = shape;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getPlantingTime() {
		return plantingTime;
	}

	public void setPlantingTime(LocalDate plantingTime) {
		this.plantingTime = plantingTime;
	}

	public LocalDate getRipeningTame() {
		return ripeningTame;
	}

	public void setRipeningTame(LocalDate ripeningTame) {
		this.ripeningTame = ripeningTame;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public double getPrice() {
		return price;
	}

	public void setPrie(double price) {
		this.price = price;
	}

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
		System.out.print("Price:");
		price = sc.nextDouble();

	}

	public void showCrops() {
		System.out.println("Show information about crops:");
		System.out.println("Crops type:" + getType());
		System.out.println("Planting time:" + getPlantingTime());
		System.out.println("Ripening time:" + getRipeningTame());
		System.out.println("Shape:" + getShape());
		System.out.println("Price:" + getPrice());

	}

}