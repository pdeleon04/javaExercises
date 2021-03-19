import java.util.Scanner;

class ComputeChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the amount as a decimal number, such as 11.65
		System.out.print("Enter an amount in double, for example 11.65: ");
		double amount = input.nextDouble();
		
		// Convert the amount (e.g. 11.56) into cents (1156)
		int remainingAmount = (int)(amount * 100);
		
		// Divide the cents by 100 to FIND the NUMBER OF DOLLARS. 
		// Obtain the remaining cents using the cents remainder 100
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Divide the remaining cents by 25 to FIND the NUMBER of QUARTERS
		// Obtain the remaining cents using the cents remainder 25
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Divide the remaining cents by 10 to FIND the NUMBER of DIMES
		// Obtain the remaining cents using the cents remainder 10
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Divide the remaining steps by 5 to FIND the NUMBER of NICKELS
		// Obtain the remaining cents using the cents remainder 5
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// The remaining cents are PENNIES
		int numberOfPennies = remainingAmount;
		
		// Display the result
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("    " + numberOfOneDollars + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters ");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickels + " nickels");
		System.out.println("    " + numberOfPennies + " pennies");
	}
}