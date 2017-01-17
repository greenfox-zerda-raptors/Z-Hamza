import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zoltán on 2017.01.17..
 */



public class GameOfLifeTest {

    private GameOfLife testGameOfLife;

    private int[][] testArrOne = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
    };
    private int[][] testArrTwo = {
            {0,0,0},
            {0,0,0},
            {0,0,1}
    };
    private int[][] testArrThree = {
            {0,0,0},
            {0,1,1},
            {0,1,1}
    };

    @Test
    public void testForZero(){
        int[][] expectedResult = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        testGameOfLife = new GameOfLife(3,3);
        testGameOfLife.nextGeneration();
        assertEquals(expectedResult, testGameOfLife.getCellField());

    }

    @Test
    public void testForOne(){
        int[][] expectedResult = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        testGameOfLife = new GameOfLife(testArrOne);
        testGameOfLife.nextGeneration();
        assertEquals(expectedResult, testGameOfLife.getCellField());

    }

    @Test
    public void testForOneInTheCorner(){
        int[][] expectedResult = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

        testGameOfLife = new GameOfLife(testArrTwo);
        testGameOfLife.nextGeneration();
        assertEquals(expectedResult, testGameOfLife.getCellField());
    }

    @Test
    public void testForStable(){
        int[][] expectedResult = {
                {0,0,0},
                {0,1,1},
                {0,1,1}
        };

        testGameOfLife = new GameOfLife(testArrThree);
        testGameOfLife.nextGeneration();
        assertEquals(expectedResult, testGameOfLife.getCellField());
    }

    @Test
    public void testToString(){
        testGameOfLife = new GameOfLife(3,3);
        String expected = " .  .  . \n .  .  . \n .  .  . \n";

        assertEquals(expected, testGameOfLife.toString());
    }

    @Test
    public void testChangeXYOne(){
        testGameOfLife = new GameOfLife(3,3);
        int[][] expectedResult = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        testGameOfLife.changeCellinXY(1,1);

        assertEquals(expectedResult, testGameOfLife.getCellField());
    }

    @Test
    public void testChangeXYTwo(){
        testGameOfLife = new GameOfLife(new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0}
        });
        int[][] expectedResult = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        testGameOfLife.changeCellinXY(1,1);

        assertEquals(expectedResult, testGameOfLife.getCellField());
    }

}
