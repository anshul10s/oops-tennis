package kata.problem;

public class TennisGameImpl implements TennisGame {

    private int score1;
    private int score2;

    private String player1;
    private String player2;

    public TennisGameImpl(String player1, String player2) {
        super();
        this.player1 = player1;
        this.player2 = player2;
    }

    public void wonPoint(String playerName) {
        if (player1.equals(playerName)) {
            score1++;
        } else if (player2.equals(playerName)) {
            score2++;
        }
    }

    public String getScore() {
        return scoreDisplayValue(score1)+"-"+scoreDisplayValue(score2);
    }
    
    public String scoreDisplayValue(int score) {
        switch (score) {
        case 0:
            return "Love";
        case 1:
            return "Fifteen";
        case 2:
            return "Thirty";
        case 3:
            return "Forty";
        default:
            return null;
        }
    }

}
