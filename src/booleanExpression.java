import java.util.Scanner;

public class booleanExpression {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers ");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		System.out.println((x < y && y < z) ? "sorted" : "not sorted");
	}
}