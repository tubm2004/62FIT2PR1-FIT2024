package day02_VariablesAndDataTypes.math;
import java.util.*;
public class IntegerDigitsSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		short integer = sc.nextShort();
		double i1 = integer % 10;
		double i2 = integer / 100;
		double i3 = (integer - i2 * 100 - i1)/10;
		double sum = i1 + i2 + i3;
		System.out.printf("The sum of the digits is " + (int) sum);

	}

}
