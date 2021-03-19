import java.util.Scanner;

public class booleanExpression2 {
	public static void main(String[] args) {
		
		// Scanner object
		Scanner input = new Scanner(System.in);
		// Request input from the user
		System.out.println("Enter your age: ");
		// declare integer value
		int age = input.nextInt();
		
		// Print out the results of the boolean expression 
		// (age >= 16) ? ticketPrice = 20 : ticketPrice = 10;
		double ticketPrice = 0;
		
		System.out.println((age >= 16) ? "Your price is $20" : "Your price is $10");
	}
}