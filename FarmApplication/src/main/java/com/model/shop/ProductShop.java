package com.model.shop;

import java.util.ArrayList;
import java.util.List;

import com.model.abstracts.Product;

public class ProductShop {

	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		products.add(product);
	}

	public void showProducts() {
		for (Product product : products) {
			System.out.println(product.getProductName() + " - " + product.getPrice() + " euro");
		}
	}

	public double calculateTotalPrice() {
		double totalPrice = 0;
		for (Product product : products) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}
}
