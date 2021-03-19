import java.util.Scanner;

public class LoopAdd {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double input;
		double sum = 0;
		for(int i = 1; i < 11; i++) {
			System.out.println("Enter number " + i);
			input = sc.nextDouble();
			sum = sum + input;
		}
			System.out.println("Result " + sum);
	}
}