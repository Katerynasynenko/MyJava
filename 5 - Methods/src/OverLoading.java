
public class OverLoading {

	public static void main(String[] args) {
		
		int new_score = calculateScore("Mike", 500);
		System.out.println("New score is "+ new_score);
		
		calculateScore(75);
		
		
		calculateScore();
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+ playerName + " scored "+ score + " points");
		return score*100;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed Player Scored "+ score + " points");
		return score*100;
	}
	
	public static void calculateScore() {
		System.out.println("No Player Name, No Player Score");
	}

}
