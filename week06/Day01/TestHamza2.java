import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zoltán on 2016.11.21..
 */
public class TestHamza2 {
    @Test
    public void countHowMany14() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowMany('m') );
    }
    @Test
    public void countHowMany15() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(2, wSource.countHowMany('e') );
    }
    @Test
    public void countHowMany16() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(3, wSource.countHowMany(' ') );
    }
    @Test
    public void countHowMany17() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowMany('t') );
    }
    @Test
    public void countHowMany18() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowMany('y') );
    }
    @Test
    public void countHowMany19() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowMany('o') );
    }
    @Test
    public void countHowMany20() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowMany('u') );
    }
    @Test
    public void countHowMany21() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowMany(',') );
    }
    @Test
    public void countHowMany22() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowMany('j') );
    }
    @Test
    public void countHowMany23() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(3, wSource.countHowMany('a') );
    }
    @Test
    public void countHowMany24() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowMany('r') );
    }
    @Test
    public void countHowMany25() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowMany('z') );
    }
    @Test
    public void countHowMany26() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(2, wSource.countHowMany('n') );
    }
    @Test
    public void countHowmanyuppercase1() throws Exception{
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowManyUpperCase('T'));
    }
    @Test
    public void countHowmanyuppercase2() throws Exception{
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowManyUpperCase('M'));
    }
    @Test
    public void countHowmanyuppercase3() throws Exception{
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowManyUpperCase('Y'));
    }
    @Test
    public void countHowmanyuppercase4() throws Exception{
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(1, wSource.countHowManyUpperCase('J'));
    }

}
