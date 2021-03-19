/**
 	Name: Adam Alcala
 	File: stringToUppercase.java
 	Created: 3/18/2021  6:41 PM PST
 	
 	Description:
 	This file takes entered string and uppercases all letters. I created this to help when I 
 	serialize or need to verify serials and it becomes confusing to determine whether something
 	is letter or number.
 */

import java.util.Scanner;

public class stringToUpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Serial Number Counts (integer): ");
		int sn_count = sc.nextInt();
		System.out.println("SN count is: " + sn_count);
		
		for (int i = 0; i < sn_count; i++) {
			System.out.print("Enter SN: ");
			System.out.print(" ");
			String sn = sc.next();
			System.out.println(sn.toUpperCase());
			
		} 
		System.out.println("You have successfully processed " + sn_count + " serial numbers!");
	}
}
