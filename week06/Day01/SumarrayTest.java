package Week06;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zoltán on 2016.11.21..
 */
public class SumarrayTest {
    @Test
    public void sum() throws Exception {
        Sumarray a = new Sumarray();
        for(int i = 1; i <11; i++){
            a.add(i);
        }
        assertEquals(new Integer(55), a.Sum());
    }
    @Test
    public void sum1() throws Exception {
        Sumarray b = new Sumarray();
        assertEquals(new Integer(0), b.Sum());
    }
    @Test
    public void sum2() throws Exception {
        Sumarray c = new Sumarray();
        c.add(5);
        assertEquals(new Integer(5), c.Sum());
    }
    @Test
    public void sum4() throws Exception {
        Sumarray d = new Sumarray();
        d.add(0);
        assertEquals(new Integer(0), d.Sum());
    }

}