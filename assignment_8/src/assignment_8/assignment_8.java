package assignment_8;

public class assignment_8 {

	public static void main(String[] args) {
		
		System.out.println(getDurationString(125,158));
		System.out.println(getDurationString(125,15));
		System.out.println(getDurationString(78,36));
		System.out.println(getDurationString(7256));
		System.out.println(getDurationString(-50));
		

	}
	
	
	public static String getDurationString(int minutes, int seconds) {
		if (minutes<0 || seconds<0 || seconds>59) {
			return ("Invalid Value");
		}else {
			int hours = minutes/60;
			int minute = minutes - (60*hours);
			return (hours+"h "+ minute+"m "+ seconds+"s");
			
		}
	}
	
	
	public static String getDurationString(int second) {
		if(second<0) {
			return("Invalid Value");
		}else {
			int minutes1 = second/60;
			int remainingSec = second - (minutes1*60);
			
			return(getDurationString(minutes1,remainingSec));
		}
	}

}
