package com.bellinfo.assign3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 
		int numberofstudent;
		System.out.println("Enter Number of Students");
		numberofstudent = s.nextInt();
		int id[] = new int[numberofstudent];
		String name[] = new String[numberofstudent];
		double fee[] = new double[numberofstudent];
		char section[] = new char[numberofstudent];
		char section1[] = new char[numberofstudent];

		
		
		for (int i = 0; i < name.length; i++) {

			System.out.println("Enter Student Id " + (i + 1) + " ");
			id[i] = s.nextInt();

			System.out.println("Enter Student Name" + (i + 1) + " ");
			name[i] = s.next();

			System.out.println("Enter Student Fee" + (i + 1) + " ");
			fee[i] = s.nextDouble();

			System.out.println("Enter Student Section" + (i + 1) + " ");
			section[i] = s.next(".").charAt(0);

		}
		System.out.println("Final OutPut");
		System.out.println("Enter the section to be displayed");
		section1[0] = s.next(".").charAt(0);
		for (int i = 0; i < name.length; i++) {
			
			if (section1[0] == section[i]) {
				
				System.out.println(id[i] + " " + name[i] + " " + fee[i] + " " + section[i]);

			} 
			

		}
		

	}
}
