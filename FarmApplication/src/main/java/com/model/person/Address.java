package com.model.person;

import java.util.Scanner;

public class Address {

	public String district;
	public String city;
	public String street;
	public int houseNumber;

	public Address(String district, String city, String street, int houseNumber) {
		super();
		this.district = district;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void enterAddress() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter owner address:");
		System.out.print("Enter district:");
		district = sc.next();
		System.out.print("Enter city:");
		city = sc.next();
		System.out.print("Enter street:");
		street = sc.next();
		System.out.print("Enter house number:");
		houseNumber = sc.nextInt();
		sc.close();
	}

	public void showAddress() {
		System.out.println("Show owner address");
		System.out.print("District:" + getDistrict());
		System.out.print("City:" + getCity());
		System.out.print("Street:" + getStreet());
		System.out.print("House number:" + getHouseNumber());

	}

}