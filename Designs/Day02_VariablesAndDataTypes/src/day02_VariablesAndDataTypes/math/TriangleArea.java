package day02_VariablesAndDataTypes.math;
import java.util.*;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter three points for a triangle: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double side1 = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		double side2 = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));
		double side3 = Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2));
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.printf("The area of the triangle is %.1f", area);

	}

}
