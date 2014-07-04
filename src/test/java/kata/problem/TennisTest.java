package kata.problem;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TennisTest {

    private static final String TENDUKLAR = "Tenduklar";
    private static final String SHARAPOVA = "Sharapova";
    private TennisGame tennisGame;
    
    @Before
    public void setup() {
        tennisGame = new TennisGameImpl();
    }
    
    @Test
    public void gameStarted() {
        assertEquals("Love-all", tennisGame.getScore());
    }
    
    @Test
    public void serapovaScorePoint() {
        tennisGame.wonPoint(SHARAPOVA);
        assertEquals("Fifteen-Love", tennisGame.getScore());
    }
    
    @Test
    public void bothScoreOnePoint() {
        tennisGame.wonPoint(SHARAPOVA);
        tennisGame.wonPoint(TENDUKLAR);
        assertEquals("Fifteen-all", tennisGame.getScore());
    }


}
