package com.model.person;

import java.util.Scanner;

import com.model.abstracts.Person;

public class Worker extends Person {

	private int id;
	private int cardNumber;
	private int phoneNumber;
	private String position;
	private double salary;
	private int lengthOfService;

	public Worker(String firstName, String lastName, int age, int id, int cardNumber, int phoneNumber, String position,
			double salary, int lengthOfService) {
		super(firstName, lastName, age);
		this.id = id;
		this.cardNumber = cardNumber;
		this.phoneNumber = phoneNumber;
		this.position = position;
		this.salary = salary;
		this.lengthOfService = lengthOfService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getLengthOfService() {
		return lengthOfService;
	}

	public void setLengthOfService(int lengthOfService) {
		this.lengthOfService = lengthOfService;
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
		System.out.print("Card number:");
		cardNumber = sc.nextInt();
		System.out.print("Enter telephon number:");
		phoneNumber = sc.nextInt();
		System.out.print("Position:");
		position = sc.next();
		System.out.print("Selary:");
		salary = sc.nextDouble();
		System.out.print("Enter lenght of service:");
		lengthOfService = sc.nextInt();

	}

	@Override
	public void showPerson() {
		System.out.println("Show person inforamtion:");
		System.out.println("First name:" + getFirstName());
		System.out.println("Last name:" + getLastName());
		System.out.println("Age:" + getAge());
		System.out.println("Card number:" + getCardNumber());
		System.out.println("Phone number:" + getPhoneNumber());
		System.out.println("Position:" + getPosition());
		System.out.println("Selary:" + getSalary());
		System.out.println("Lenght of service:" + getLengthOfService());
	}
}
