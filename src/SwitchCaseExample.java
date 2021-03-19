import java.util.Scanner;

public class SwitchCaseExample {
	static Scanner sc = new Scanner(System.in);
	// A = 90 - 100
	// B = 80 - 90
	// C = 70 - 80
	// D = 60 - 70
	// E = 50 - 60
	// F = below 50
	
	public static void main(String[] args) {
		System.out.println("Enter score: ");
		double score = sc.nextDouble();
		int switch_score = (int)(score / 10);
		System.out.println("switch_score " + switch_score);
		if(switch_score >= 10) switch_score = 9; // Anything over 100 will be an A
				
		switch (switch_score) {
			case 9:  // 90 - 100
				System.out.println("Value between 90 - 100");
				System.out.println("Grade A");
				break;
			case 8:  // 80 - 90
				System.out.println("Grade B");
				break;
			case 7:  // 70 - 80
				System.out.println("Grade C");
				break;
			case 6:  // 60 - 70
				System.out.println("Grade D");
				break;
			case 5:  // 50 - 60
				System.out.println("Grade E");
				break;
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("Value between Fail");
				System.out.println("Grade F");
				break;
			default:
				System.out.println("Grade F");
		}
		
	}
}