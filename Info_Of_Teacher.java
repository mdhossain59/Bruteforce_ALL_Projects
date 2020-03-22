package com.oops_class;

public class Info_Of_Teacher {

	public static void main(String[] args) {
		Teacher ourTeacher = new Teacher(" Richard Holowczak", "Male", "Long Island", " CIS", " Senior Prof", 43, 718923421, 2014, 78000);
		ourTeacher.displayInfo();
		
		// another object creation.
		
		Teacher schoolTeacher = new Teacher( "Cipolina Natalia", "Male", "Queens", "Political department", "Head of the department", 65, 917234534, 2008, 81000);
		schoolTeacher.displayInfo();
		
		Teacher ourTeacher2 = new Teacher();
		ourTeacher2.displayInfo();
	}

}
