package day02_VariablesAndDataTypes.math;

public class DisplayingTheCurrentTime {

	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		long sec = currentTimeMillis/1000;
		long currentSeconds = sec%60;
		long minutes = currentTimeMillis/1000/60;
		long currentMinutes = minutes%60;
		long hours = ((currentTimeMillis/1000)/60)/60;
		long currentHours = hours%24 + 7; //Do GMT hơn 7 tiếng so với UTC
		System.out.println(currentHours + ":" + currentMinutes + ":" + currentSeconds);	
	}

}
