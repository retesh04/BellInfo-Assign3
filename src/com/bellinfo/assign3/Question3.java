package com.bellinfo.assign3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int numberofstudent;
		System.out.println("Enter Number of Students");
		numberofstudent = s.nextInt();
		Student[] std = new Student[numberofstudent];

		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.println(std[i].toString());
			
			System.out.println("Enter Student Id " + (i + 1) + " ");
			int a = s.nextInt();
			std[i].setId(a);
			//std[i].id = s.nextInt();

			System.out.println("Enter1 Student Name" + (i + 1) + " ");
std[i].setName(s.next());
			

			System.out.println("Enter Student Fee" + (i + 1) + " ");
			std[i].setFee(s.nextDouble());;

			System.out.println("Enter Student Section" + (i + 1) + " ");
			std[i].setSection(s.next(".").charAt(0));

		}
		

		for (int i = 0; i < std.length; i++) {

			System.out.println(std[i].toString());

		}

	}

}

class Student {
	int id;
	int numberofstudents;
	String name;
	double fee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberofstudents() {
		return numberofstudents;
	}

	public void setNumberofstudents(int numberofstudents) {
		this.numberofstudents = numberofstudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public char getSection() {
		return section;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", numberofstudents=" + numberofstudents + ", name=" + name + ", fee=" + fee
				+ ", section=" + section + "]";
	}

	public Student() {
		super();
		this.id = 1;
		this.numberofstudents = 2;
		this.name = "Retesh";
		this.fee = 10.25;
		this.section = 'A';
	}

	public void setSection(char section) {
		this.section = section;
	}

	char section;

}