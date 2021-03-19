import java.util.Scanner;

public class ScoresToGrade {
	// A > 90
	// B > 80
	// C > 70
	// D > 60
	// E > 50
	// F < 50
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score;
		System.out.println("Input Score");
		score = sc.nextDouble();
		System.out.println("Score " + score);
		
		if(score > 90)
			System.out.print("Grade A");
		else if(score > 80)
			System.out.print("Grade B");
		else if(score > 70)
			System.out.print("Grade C");
		else if(score > 60)
			System.out.print("Grade D");
		else if(score > 50)
			System.out.print("Grade E");
		if(score < 50)
			System.out.print("Grade F");
	}
}