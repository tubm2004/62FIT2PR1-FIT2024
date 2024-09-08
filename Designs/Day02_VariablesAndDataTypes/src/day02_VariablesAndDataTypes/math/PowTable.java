package day02_VariablesAndDataTypes.math;

public class PowTable {

	public static void main(String[] args) {
		System.out.printf("%-6s %-6s %-6s","a","b","Pow(a,b)");
		System.out.println();
		System.out.printf("%-6d %-6d %-8d",1,2,(int) Math.pow(1, 2));
		System.out.println();
		System.out.printf("%-6d %-6d %-8d",2,3,(int) Math.pow(2, 3));
		System.out.println();
		System.out.printf("%-6d %-6d %-8d",3,4,(int) Math.pow(3, 4));
	}

}
