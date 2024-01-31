import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a game score: ");
        String gameScore = userInput.nextLine().trim();
        String[] teamScoreSplit = gameScore.split("\\|", 2);

        String[] teams = teamScoreSplit[0].split(":", 2);

        String[] scores = teamScoreSplit[1].split(":", 2);
        int score1, score2;

        score1 = Integer.parseInt(scores[0]);
        score2 = Integer.parseInt(scores[1]);

        if(score1 > score2){
            System.out.println("Winner: " + teams[0]);
        }
        else{
            System.out.println("Winner: " + teams[1]);
        }

    }
}
