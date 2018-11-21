
public class Task {

	public static void main(String[] args) {
		
		displayHighScorePosition("Mike", calculateHighScorePosition(600));
		displayHighScorePosition("Stela", calculateHighScorePosition(1000));
		displayHighScorePosition("Katya", calculateHighScorePosition(500));
		
	}
	
	public static void displayHighScorePosition(String name, int highScorePosition) {
		
		System.out.println(name+ " managed to get into position " + highScorePosition + " on the high score table");
		
	}

	public static int calculateHighScorePosition(int score) {
		
		if(score>=1000) {
			return 1;
		}else if(score>=500 && score<1000) {
			return 2;
		}else if(score>=100 && score<500) {
			return 3;
		}else {
			return 4;
		}
		
	}

}
