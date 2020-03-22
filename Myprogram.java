package com.ct;
import java.util.Scanner;
public class Myprogram {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println(" what is your name?");
		String myName;
		int age;
		myName = scan.nextLine();
		System.out.println(" My name is " +myName);
		System.out.println(" how old are you?");
		age = scan.nextInt();
		
		System.out.println(" i am "  +age+ " years old.");
		System.out.println(" What do you do?");
		String student;
		student = scan.nextLine();
		
		System.out.println("I am a " +student);
		System.out.println(" Where do you live?");
		String city;
		city = scan.nextLine();
		System.out.println(" I live in " +city);
		System.out.println(" Hello "+myName+ " you are " +age );
		System.out.print("years old.");
		
		// if and else clause.
		if (age > 18) {
			System.out.println(" you have right to vote. ");
		}
		else if (age == 18) {
			System.out.println(" You become a new voter.");
			System.out.println(" Can send me your birth certificate");
		}
		else {
			System.out.println(" You are not eligible to vote.");
			System.out.println(" you have to wait until becoming 18 yrs.");
		}
		

	}

}
