package com.model.person;

import java.util.Scanner;

import com.model.abstracts.Person;

public class Veterinarian extends Person {

	public int yearsOfExperience;
	private String specialization;

	public Veterinarian(String firstName, String lastName, int age, int yearsOfExperience, String specialization) {
		super(firstName, lastName, age);
		this.yearsOfExperience = yearsOfExperience;
		this.specialization = specialization;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public void enterVeterinarian() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vererinarien information:");
		System.out.print("Enter first name:");
		firstName = sc.next();
		System.out.print("Enter last name:");
		lastName = sc.next();
		System.out.print("Enter age:");
		age = sc.nextInt();
		System.out.print("Years of experience:");
		yearsOfExperience = sc.nextInt();
		System.out.print("Specialization:");
		specialization = sc.next();
	}

	public void showVeterinarian() {
		System.out.println("Show person inforamtion:");
		System.out.println("First name:" + getFirstName());
		System.out.println("Last name:" + getLastName());
		System.out.println("Age:" + getAge());
		System.out.print("Years of experience:" + getYearsOfExperience());
		System.out.print("Specialization:" + getSpecialization());
	}

}
