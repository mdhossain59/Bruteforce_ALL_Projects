package com.JavaExamples;
/**
 * 
 * @author mdhossain
 *
 */

public class ArrayConcept {

	public static void main(String[] args) {
		//integer array.
		int[]num = new int [6];
		
		num [0] = 10;
		num [1] = 20;
		num [2] = 30;
		num [3] = 40;
		num [4] = 50;
		num [5] = 60;
		System.out.println("size of the array " +num.length);
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.println(num[j]+""+num[j]);	
				System.out.println("    ");
			}
			System.out.println(num[i]+""+num[i]);
			System.out.println("    ");
			
		}
		
		// # 2object array.
		
		Object obj[] = new Object[6];
		obj[0]= "Virat Kohli";
		obj[1]= "32";
		obj[2]= "India";
		obj[3]= "04-30-1987";
		obj[4]= "Male";
		obj[5]= "93.21";
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
			
		}
		System.out.println("-----------------------------");
		
		Object obj2[] = new Object[6];
		obj2[0]= "Rohit Sharma";
		obj2[1]= "30";
		obj2[2]= "India";
		obj2[3]= "09-05-1988";
		obj2[4]= "Male";
		obj2[5]= "48.52";
		for (int j = 0; j < obj2.length; j++) {
			System.out.println(obj2[j]);
			
		}
		System.out.println("--------------------------------");
		
		Object obj3[] = new Object[6];
		obj3[0]= "Steve Smith";
		obj3[1]= "30";
		obj3[2]= "Austrilia";
		obj3[3]= "06-02-1989";
		obj3[4]= "Male";
		obj3[5]= "86.3";
		for (int k = 0; k < obj3.length; k++) {
			System.out.println(obj3[k]);
		}
		
		
		
		
		

	}

}
