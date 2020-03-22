package com.JavaExamples;

public class StringConcanate {

	public static void main(String[] args) {
		double a = 10;
		double b =90;
		double c = 23.33;
		double d = 43.21;
		
		String x = " Hello";
		String y = " World";
		System.out.println(x+ " "+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+ " " +(c+d));
		System.out.println("sum of a and b: " +a+b);
		System.out.println("maximum of the numbers: ");
		if (a>b && a>c && a>d) {
			System.out.println(" A is the maximum number.");
			
		}
		else if ( b>c && b>d ) {
			System.out.println(" B is the largest number.");
			
		}
		else if (c>d) {
			System.out.println(" C is the maximum number ");
			
		}
		else {
			System.out.println(" D is the maximum number.");
		}
		
		int m = 1;
		int n =m++;
		int p = ++m;
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
		
		// dead code
		if (true) {
			System.out.println(" this is pass");
			
		} else {
			System.out.println(" this is fail");

		}
		
		// this is grading system.
		double score;
		

	}

}
