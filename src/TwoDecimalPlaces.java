/**
	This java program was created for understanding the problem with maintaining two
	decimal places. This program is currently being constructed while learning from 
	the course module.
*/

public class TwoDecimalPlaces {
	
	public static void main(String[] args) {
		double grapes = 3.99 ;
		double apple = 1.99;
		double totl = grapes + apple ;
		double tax = totl * .0925 ;
		
		double grandTotal = totl + tax;
		
		System.out.println(grandTotal);
		
	}
}