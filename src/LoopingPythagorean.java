import java.util.Scanner;

public class LoopingPythagorean {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		double side_a = 0.0;
		double side_b = 0.0;
		double side_c = 0.0;
		while (side_a >= 0 && side_b >= 0) {
			side_a = 0.0;
			side_b = 0.0;
			side_c = 0.0;
			
			System.out.println("Enter Side A");
			side_a = input.nextDouble();
			System.out.println("Enter Side B");
			side_b = input.nextDouble();
			
			if(side_a >= 0 && side_b >= 0) {
				side_c = Math.sqrt(Math.pow(side_a, 2) + Math.pow(side_b, 2));
				System.out.println("Side C - " + side_c);
			}else
				System.out.println("Side C - Not Calulated ");
		}
	}
}