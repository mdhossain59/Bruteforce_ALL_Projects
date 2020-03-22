package com.variables;
import java.util.Scanner;

public class Varable_Exercises {

	public static void main(String[] args) {
		// this is exercise # 1
		System.out.println(" I am a BruteForce Student.");
		/*
		 * this is exercise # 2 which will display two integers, one float 
		 * variables.
		 */
		int num1 = 10;
		int num2 = 13;
		float num3 = (float) 12.8;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		/*
		 * This is exercise # 3. This program will ask input from user
		 * and display the result if certain condition meet.
		 */
		Scanner scan = new Scanner (System.in);
		String name;
		int age; 
		System.out.println(" What is your name?");
		name = scan.nextLine();
		System.out.println(" Please enter your age?");
		System.out.println(" I can tell you about your eliglibe to vote or not.");
		age = scan.nextInt();
		if ( age <18 ) {
			System.out.println(" Sorry " +name+ "!! You are not eligibile to vote.");
			
		}
		else if ( age ==18) {
			System.out.println(" Congragratulation " +name+ "!! You can vote now.");
		}
		else {
			System.out.println("Hello Mr/Mrs " +name+ ". You eligible to vote.");
		}
		
	}

}
