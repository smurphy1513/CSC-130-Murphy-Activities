/**
 * Lab 03 - changing pennies into dollars and cents, four fours activity
 *
 * @author Sara Murphy
 * @version February 27
 *
 */

import java.util.Scanner;

public class ChangingPennies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	int numPennies;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		int penniesmod1;
		int penniesmod2;
		int penniesmod3;
		
		Scanner scnr = new Scanner (System.in);
		System.out.println("Pennies: ");
		numPennies = scnr.nextInt();
		double dollars = (double) numPennies / 100;
		
		System.out.println("Dollars: $ " + dollars);
		System.out.println("Conversion: ");
		
		quarters = numPennies / 25;
		System.out.println(quarters + " quarters");
		
		penniesmod1 = numPennies % 25;
		dimes = penniesmod1 / 10;
		System.out.println(dimes + " dimes");
		
		penniesmod2 = penniesmod1 % 10;
		nickels = penniesmod2 / 5;
		System.out.println(nickels + " nickels");
		
		penniesmod3 = penniesmod2 % 5;
		pennies = penniesmod3;
		System.out.println(pennies + " pennies");
			
		System.out.println("Counting only quarters and dimes, you have $" + ((quarters * .25) + (dimes * .10)));
		System.out.println();
			
// Four Fours
		System.out.println("We can make 0 with four fours: (4 + 4 - 4 - 4) = " + (4 + 4 - 4 - 4));	
	    System.out.println("We can make 1 with four fours: (4 % 4 + 4 / 4) = " + (4 % 4 + 4 / 4));
	    System.out.println("We can make 2 with four fours: (Math.sqrt(4) + Math.sqrt(4) - 4 + Math.sqrt(4)) = " + (Math.sqrt(4) + Math.sqrt(4) - 4 + Math.sqrt(4)));
	    System.out.println("We can make 3 with four fours: (((4 * 4) - 4) / 4) = " + (((4 * 4) - 4) / 4));
	    System.out.println("We can make 4 with four fours: (4 + 4 % 4 / 4) = " + (4 + 4 % 4 / 4));      
	    System.out.println("We can make 5 with four fours: ((4 * 4 + 4) / 4) = " + ((4 * 4 + 4) / 4));
	    System.out.println("We can make 6 with four fours: (4 - 4 + 4 + Math.sqrt(4)) = " + (4 - 4 + 4 + Math.sqrt(4)));
	    System.out.println("We can make 7 with four fours: (4 + 4 - (4 / 4)) = " + (4 + 4 - (4 / 4)));
	    System.out.println("We can make 8 with four fours: (((4 + 4) * 4) / 4) = " + (((4 + 4) * 4) / 4));
     	System.out.println("We can make 9 with four fours: (4 + 4 + (4 / 4)) = " + (4 + 4 + (4 / 4)));
	    System.out.println("We can make 10 with four fours: ((44 - 4)/4) = " + ((44 - 4)/4));
	    System.out.println("We can make 11 with four fours: (44 / (Math.sqrt(4) + Math.sqrt(4))) = " + (44 / (Math.sqrt(4) + Math.sqrt(4))));
	    System.out.println("We can make 12 with four fours: (Math.sqrt(4 * 4) + 4 + 4) = " + (Math.sqrt(4 * 4) + 4 + 4));
	    System.out.println("We can make 13 with four fours: ((44 / 4) + Math.sqrt(4)) = " + ((44 / 4) + Math.sqrt(4)));
	    System.out.println("We can make 14 with four fours: (Math.sqrt(4) + 4 + 4 + 4) = " + (Math.sqrt(4) + 4 + 4 + 4));
	    System.out.println("We can make 15 with four fours: ((4 * 4) - (4/4)) = " + ((4 * 4) - (4/4)));
	    System.out.println("We can make 16 with four fours: (4 + 4 + 4 + 4) = " + (4 + 4 + 4 + 4));
	    System.out.println("We can make 17 with four fours: (4 * 4 + 4 / 4) = " + (4 * 4 + 4 / 4));
	    System.out.println("We can make 18 with four fours: (44 / Math.sqrt(4) - 4) = " + (44 / Math.sqrt(4) - 4));

		}

	}
