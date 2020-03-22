package loan_option;
import java.util.Scanner;
public class Loan {

	public static void main(String[] args) {
		double salary;
		int year;
		String name;
		Scanner loan = new Scanner( System.in);
		System.out.println(" What is your name?");
		name = loan.nextLine();
		System.out.println(" Your name is " +name);
		
		System.out.print(" What is your annual Salary" +name);
		salary = loan.nextDouble();
		System.out.println(" Your annual salary is:  $" +salary);
		
		System.out.println(" What year did jont to work?");
		year = loan.nextInt();
		System.out.println(" You joined to work " +year+ " years ago.");
		// if and else clause.
		if ( salary >= 30000 &&  year >= 2) {
			System.out.println(" Congratulation " +name+ "!!! your loan is approved.");
		}
		else {
			System.out.println(" Sorry "+name+ ".....  you are qualified for this loan.");
		}

	}

}
