package kata.problem;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TennisTest {

    private static final String TENDUKLAR = "Tenduklar";
    private static final String SHARAPOVA = "Sharapova";
    private TennisGame tennisGame;
    
    @Before
    public void setup() {
        tennisGame = new TennisGameImpl(SHARAPOVA, TENDUKLAR);
    }
    
    @Test
    public void SHscorePoint() {
        tennisGame.wonPoint(SHARAPOVA);
        assertEquals("Fifteen-Love", tennisGame.getScore());
    }
    
    @Test
    public void TDScorePoint() {
        tennisGame.wonPoint(TENDUKLAR);
        assertEquals("Love-Fifteen", tennisGame.getScore());
    }
    
    @Test
    public void TD1SH2ScorePoint() {
        tennisGame.wonPoint(TENDUKLAR);
        assertEquals("Fifteen-Thirty", tennisGame.getScore());
    }
    
    @Test
    public void TD2SH1corePoint() {
        tennisGame.wonPoint(TENDUKLAR);
        assertEquals("Thirty-Fifteen", tennisGame.getScore());
    }
    
    


}
