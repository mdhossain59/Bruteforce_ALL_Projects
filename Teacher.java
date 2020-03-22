package com.oops_class;

public class Teacher {
String name;
String gender;
String district;
String department;
String position;
int age, phoneNum, joinYear, salary;
// This is called default constructor.
Teacher (){
	System.out.println(" I like to many different teacher.");
	System.out.println(" Some professors are really nice person");
}
Teacher (String n, String g, String ds, String dpt, String p,  int ag, int ph, int jy, int sa) {
	name = n;
	gender = g;
	district = ds;
	department = dpt;
	position = p;
	age = ag; phoneNum = ph; joinYear = jy; salary = sa;
	
	
			
}

void displayInfo() {
	System.out.println(" Neme: "+name);
	System.out.println(" Gender "+gender);
	System.out.println(" District: "+district);
	System.out.println(" Department: "+department);
	System.out.println(" Rank of Department: "+position);
	System.out.println(" Age:  "+age);
	System.out.println(" Phone Number: "+phoneNum);
	System.out.println(" join Year: " +joinYear);
	System.out.println(" Salary : $"+salary);
	System.out.println("\n\n");
	
	
}
}
