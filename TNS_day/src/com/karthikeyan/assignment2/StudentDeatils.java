package com.karthikeyan.assignment2;

import java.util.Scanner;

public class StudentDeatils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Roll Number: ");
		String rollNumber = sc.nextLine();
		
		System.out.println("Enter your Grade: ");
		String grade = sc.nextLine();
		
		System.out.println("Enter your Percentage: ");
		String percentage = sc.nextLine();
		
		System.out.println(name);
		System.out.println(rollNumber);
		System.out.println(grade +" Grade");
		System.out.println(percentage +" %");
		sc.close();
				
	}

}
