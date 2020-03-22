package com.JAVA;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		String myName;
		int cu_Time;
		Scanner scan = new Scanner (System.in);
		System.out.println(" Hi, What is your name?");
		myName = scan.nextLine();
		System.out.println(" Hello, you are " +myName);
		System.out.println(" What is the current time?");
		cu_Time = scan.nextInt();
		System.out.println(" Time is now " +cu_Time);
		// if and else condition.
		if (cu_Time <= 9) {
			System.out.println(" Hello, " +myName+ "Good Moring");
			
		}
		else if (cu_Time <= 12) {
			System.out.println(" Hi, " +myName+ " Good noon." );
		}
		else if (cu_Time <= 16) {
			System.out.println(" Good afternoon");
		}
		else if (cu_Time <= 19) {
			System.out.println(" Good evening");
		}
		else if ( cu_Time <= 24) {
			System.out.println("Good night.");
		}
		else {
			System.out.println(" I don't know how can i greet you.");
		}
		

	}

}
