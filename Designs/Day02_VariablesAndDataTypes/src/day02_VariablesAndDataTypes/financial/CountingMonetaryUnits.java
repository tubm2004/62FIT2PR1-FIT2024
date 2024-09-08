package day02_VariablesAndDataTypes.math;

import java.util.*;

public class CountingMonetaryUnits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the amount of money by dollars: ");
		double amount = sc.nextDouble();
		double cent = amount * 100;
		int cents = (int) cent;
		System.out.println("You have " + cents + " cents");
		double dollar = cents/100;
		int centRemain = cents%100;
		System.out.println("It is equal to " + Math.round(dollar) + " dollars and " + centRemain + " cents.");
		int quarter = centRemain*25;
		System.out.println("It is equal to " + Math.round(dollar) + " dollars and " + quarter + " quarters.");
		int dime = centRemain*10;
		System.out.println("It is equal to " + Math.round(dollar) + " dollars and " + dime + " dimes.");
		int nickel = centRemain*5;
		System.out.println("It is equal to " + Math.round(dollar) + " dollars and " + nickel + " nickels.");
		System.out.println("It is equal to " + Math.round(dollar) + " dollars and " + centRemain + " pennies.");
	}

}
