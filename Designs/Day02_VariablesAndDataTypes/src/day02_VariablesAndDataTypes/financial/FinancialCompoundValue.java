package day02_VariablesAndDataTypes.math;

import java.util.*;

public class FinancialCompoundValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter your monthly saving: ");
		long saving = sc.nextLong();
		double s1 = saving * 1.00417;
		System.out.println("You are saving " + s1 + " VND in 1 month!");
		double s2 = (saving + s1) * 1.00417;
		System.out.printf("You are saving %.4f", s2);
		System.out.println(" VND in 2 months!");
		double s3 = (s2) * 1.00417;
		System.out.printf("You are saving %.4f", s3);
		System.out.println(" VND in 3 months!");
		double s4 = (s3) * 1.00417;
		System.out.printf("You are saving %.4f", s4);
		System.out.println(" VND in 4 months!");
		double s5 = (s4) * 1.00417;
		System.out.printf("You are saving %.4f", s5);
		System.out.println(" VND in 5 months!");
		double s6 = (s5) * 1.00417;
		System.out.printf("You are saving %.4f", s6);
		System.out.println(" VND in 6 months!");
		

	}

}
