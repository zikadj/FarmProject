package com.model.animal.omnivore;

import com.model.abstracts.Animal;

public class Pig extends Animal {

	private int id;
	private double weight;
	private double amountBakon;
	private double domountCrackers;

	public Pig(String species, String name, int age, String healthStatus, String breed, int id, double weight,
			double amountBakon, double domountCrackers) {
		super(species, name, age, healthStatus, breed);
		this.id = id;
		this.weight = weight;
		this.amountBakon = amountBakon;
		this.domountCrackers = domountCrackers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getAmountBakon() {
		return amountBakon;
	}

	public void setAmountBakon(double amountBakon) {
		this.amountBakon = amountBakon;
	}

	public double getDomountCrackers() {
		return domountCrackers;
	}

	public void setDomountCrackers(double domountCrackers) {
		this.domountCrackers = domountCrackers;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}
