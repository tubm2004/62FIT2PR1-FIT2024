package day02_VariablesAndDataTypes.math;
import java.util.*;
public class DistanceOfTwoPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter x1 and y1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.printf("Enter x2 and y2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.printf("The distance between the two points is " + distance);

	}

}
