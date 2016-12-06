import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.Assert.assertEquals;


public class AccumulTest {
    @Test
    public void testA(){
        assertEquals("A", Accumul.accum("a"));
    }
    @Test
    public void testAB(){
        assertEquals("A-Bb", Accumul.accum("ab"));
    }
    @Test
    public void TestAb(){
        assertEquals("A-Bb", Accumul.accum("aB"));
    }
    @Test
    public void testABC(){
        assertEquals("A-Bb-Ccc", Accumul.accum("abc"));
    }
    @Test
    public void testGenericTwoLetters(){
        assertEquals("V-Ff", Accumul.accum("vf"));
    }
    @Test
    public void testGenericFiveLetters(){
        assertEquals("K-Uu-Ttt-Yyyy-Aaaaa",Accumul.accum("KuTyA"));
    }

}
