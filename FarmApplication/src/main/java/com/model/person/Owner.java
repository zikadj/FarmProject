package com.model.person;

import java.util.Scanner;

import com.model.abstracts.Person;

public class Owner extends Person {

	public int pib;
	public int phoneNumber;
	public double priceFarm;
	public int yearOfEstablishment;
	public Address address;

	public Owner(String firstName, String lastName, int age, int pib, int phoneNumber, double priceFarm,
			int yearOfEstablishment, Address address) {
		super(firstName, lastName, age);
		this.pib = pib;
		this.phoneNumber = phoneNumber;
		this.priceFarm = priceFarm;
		this.yearOfEstablishment = yearOfEstablishment;
		this.address = address;
	}

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getPriceFarm() {
		return priceFarm;
	}

	public void setPriceFarm(double priceFarm) {
		this.priceFarm = priceFarm;
	}

	public int getYearOfEstablishment() {
		return yearOfEstablishment;
	}

	public void setYearOfEstablishment(int yearOfEstablishment) {
		this.yearOfEstablishment = yearOfEstablishment;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public void enterPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person information:");
		System.out.print("Enter first name:");
		firstName = sc.next();
		System.out.print("Enter last name:");
		lastName = sc.next();
		System.out.print("Enter age:");
		age = sc.nextInt();
		System.out.print("Enter pib number:");
		pib = sc.nextInt();
		System.out.print("Enter phone number:");
		phoneNumber = sc.nextInt();
		System.out.print("Enter farm price:");
		priceFarm = sc.nextDouble();
		System.out.print("Enter the year of farms establishment:");
		yearOfEstablishment = sc.nextInt();
		System.out.print("Enter adrress:");
		address.enterAddress();
		sc.close();
	}

	@Override
	public void showPerson() {
		System.out.println("Show person inforamtion:");
		System.out.println("First name:" + getFirstName());
		System.out.println("Last name:" + getLastName());
		System.out.println("Age:" + getAge());
		System.out.println("Pib number:" + getPib());
		System.out.println("Phone number:" + getPhoneNumber());
		System.out.println("Farm prices:" + getPriceFarm());
		System.out.println("Year of farms establishment:" + getYearOfEstablishment());
		address.showAddress();
	}

}
