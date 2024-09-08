package day02_VariablesAndDataTypes.math;
import java.util.*;
public class RunwayLength {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the speed and acceleration: ");
			int v = input.nextInt();
			double a = input.nextDouble();
			double length = Math.pow(v, 2)/(2*a);
			System.out.printf("The minimum runway length for this airplane is %.3f", length);
		}

	}

}
