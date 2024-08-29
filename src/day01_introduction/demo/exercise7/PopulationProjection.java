package day01_introduction.demo.exercise7;

public class PopulationProjection {

	public static void main(String[] args) {
		System.out.println("The population in the next 01 year is: " + (312032486 + (365 * 24 * 60 * 60)/7 - (365 * 24 * 60 * 60)/13 + (365 * 24 * 60 * 60)/45));
		System.out.println("The population in the next 02 years is: " + (312032486 + (365 * 2 * 24 * 60 * 60)/7 - (365 * 2 * 24 * 60 * 60)/13 + (365 * 2 * 24 * 60 * 60)/45));
		System.out.println("The population in the next 02 years is: " + (312032486 + (365 * 3 * 24 * 60 * 60)/7 - (365 * 3 * 24 * 60 * 60)/13 + (365 * 3 * 24 * 60 * 60)/45));
		System.out.println("The population in the next 02 years is: " + (312032486 + (365 * 4 * 24 * 60 * 60)/7 - (365 * 4 * 24 * 60 * 60)/13 + (365 * 4 * 24 * 60 * 60)/45));
		System.out.println("The population in the next 02 years is: " + (312032486 + (365 * 5 * 24 * 60 * 60)/7 - (365 * 5 * 24 * 60 * 60)/13 + (365 * 5 * 24 * 60 * 60)/45));
	}

}
