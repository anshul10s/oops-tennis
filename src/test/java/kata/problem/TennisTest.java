package kata.problem;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Level 3:
 * 
 * Implementing the concept of Love & Deuce
 * @author anshul.gupta
 *
 */
@RunWith(Parameterized.class)
public class TennisTest {

    private static final String TENDUKLAR = "Tenduklar";
    private static final String SHARAPOVA = "Sharapova";
    
    private int tendulkarScore;
    private int sharapova2Score;
    private String expectedScore;

    public TennisTest(int player1Score, int player2Score, String expectedScore) {
        this.tendulkarScore = player1Score;
        this.sharapova2Score = player2Score;
        this.expectedScore = expectedScore;
    }
    
    @Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][] {
                { 0, 0, "Love-All" },
                { 1, 1, "Fifteen-All" },
                { 2, 2, "Thirty-All"},
                { 3, 3, "Deuce"},
                { 4, 4, "Deuce"},
                
                { 1, 0, "Fifteen-Love"},
                { 0, 1, "Love-Fifteen"},
                { 2, 0, "Thirty-Love"},
                { 0, 2, "Love-Thirty"},
                { 3, 0, "Forty-Love"},
                { 0, 3, "Love-Forty"},
                
                { 2, 1, "Thirty-Fifteen"},
                { 1, 2, "Fifteen-Thirty"},
                { 3, 1, "Forty-Fifteen"},
                { 1, 3, "Fifteen-Forty"},

                { 3, 2, "Forty-Thirty"},
                { 2, 3, "Thirty-Forty"},
                
        });
    }

    public void checkAllScores(TennisGame game) {
        int highestScore = Math.max(this.tendulkarScore, this.sharapova2Score);
        for (int i = 0; i < highestScore; i++) {
            if (i < this.tendulkarScore)
                game.wonPoint(TENDUKLAR);
            if (i < this.sharapova2Score)
                game.wonPoint(SHARAPOVA);
        }
        assertEquals(this.expectedScore, game.getScore());
    }

    @Test
    public void checkAllScoresTennisGame1() {
        TennisGameImpl game = new TennisGameImpl(TENDUKLAR, SHARAPOVA);
        checkAllScores(game);
    }
    
    
}
