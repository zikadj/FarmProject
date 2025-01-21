package com.model.shop;

import java.util.ArrayList;
import java.util.HashMap;

public class BuyAnimals {

	private HashMap<String, Integer> animals;
	private ArrayList<String> cart;

	public BuyAnimals() {
		animals = new HashMap<>();
		cart = new ArrayList<>();

		animals.put("Dog", 200);
		animals.put("Rabbit", 120);
		animals.put("Sheep", 400);
		animals.put("Pig", 180);
		animals.put("Duck", 80);
		animals.put("Chichen", 70);
		animals.put("Turkey", 90);
		animals.put("Horse", 400);
		animals.put("Cow", 329);
		animals.put("Cat", 50);

	}

	public void addInCart() {
		System.out.println("Available animals for shopping:");
		for (String animal : animals.keySet()) {
			System.out.print("Animal:" + animal + "~" + animals.get(animal) + "euros");
		}

	}

}
