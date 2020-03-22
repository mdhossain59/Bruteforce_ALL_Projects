package com.Java;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*System.out.println("Hello, Java. I am learning you");
		System.out.println(" I love programming");
		System.out.println(" I hope, i will be master you very soon.");
		System.out.println(" i live in NYC");
		System.out.println("my favorite color is blue");
		System.out.println(" i am learning java");
		// write a variable in String and Scanner */
		
		Scanner city = new Scanner (System.in);
		System.out.println(" What is your favorite city?");
		
		String myCityName;
		myCityName = city.nextLine();
		
		System.out.println(" I live in " +myCityName);
		System.out.println("I love to stay in " +myCityName);
		System.out.println(myCityName+ " has many beautiful place");
		System.out.println(myCityName+ " is multicultural city");
		System.out.println(" Education of " +myCityName+ " is excellent");
		
		
		
		


	}

}
