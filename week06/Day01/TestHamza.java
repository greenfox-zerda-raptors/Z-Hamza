import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestHamza {
    @org.junit.Test
    public void countHowMany1() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(2, wSource.countHowMany('t') );
    }
    @Test
    public void countHowMany2() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(3, wSource.countHowMany('a') );
    }

    @Test
    public void countHowMany3() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(1, wSource.countHowMany('r') );
    }
    @Test
    public void countHowMany4() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(1, wSource.countHowMany('z') );
    }
    @Test
    public void countHowMany5() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(2, wSource.countHowMany('n') );
    }
    @Test
    public void countHowMany6() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(1, wSource.countHowMany('\'') );
    }
    @Test
    public void countHowMany7() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(2, wSource.countHowMany('s') );
    }
    @Test
    public void countHowMany9() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(1, wSource.countHowMany('o') );
    }
    @Test
    public void countHowMany10() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(1, wSource.countHowMany('e') );
    }
    @Test
    public void countHowMany11() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(1, wSource.countHowMany('i') );
    }
    @Test
    public void countHowMany12() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(1, wSource.countHowMany('l') );

    }
    @Test
    public void countHowMany13() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(1, wSource.countHowMany(' ') );
    }
    @Test
    public void isAnAnagram() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(false, wSource.isAnAnagram("macska"));
    }
    @Test
    public void countHowmanyuppercase() throws Exception{
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(1, wSource.countHowManyUpperCase('T'));
    }
}