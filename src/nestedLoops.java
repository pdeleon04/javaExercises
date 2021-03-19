/** 
	Name: Adam Alcala
 	Class: CPSC - 06 - 31165
 	AdamAlcalaNestedLoops
*/ 


public class nestedLoops {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i < 100; i++)
			for(int j = 0; j < 10; j++) {
				count = count + 1;
				if (count % 2 != 0) // if number is not divisible by 2 it is odd
				System.out.println(count);
			}
	}
}