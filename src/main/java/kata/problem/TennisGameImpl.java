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
        if (score1 == 1 && score2 == 0)
            return "Fifteen-Love";
        else if (score1 == 0 && score2 == 1)
            return "Love-Fifteen";
        else if (score1 == 1 && score2 == 2)
            return "Fifteen-Thirty";
        else if (score1 == 2 && score2 == 1)
            return "Thirty-Fifteen";
        return null;
    }

}
