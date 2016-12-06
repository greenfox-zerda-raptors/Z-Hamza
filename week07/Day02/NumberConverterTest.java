import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NumberConverterTest {
    @Test
    public void testForOne(){
        assertEquals("I", NumberConverter.arabicToRoman(1));

    }
    @Test
    public void testForTwo(){
        assertEquals("II", NumberConverter.arabicToRoman(2));
    }
    @Test
    public void testForThree(){
        assertEquals("III", NumberConverter.arabicToRoman(3));
    }
    @Test
    public void testForFive(){
        assertEquals("V", NumberConverter.arabicToRoman(5));
    }
    @Test
    public void testForFour(){
        assertEquals("IV", NumberConverter.arabicToRoman(4));
    }
    @Test
    public void testForSix(){
        assertEquals("VI", NumberConverter.arabicToRoman(6));
    }
    @Test
    public void testForEight(){
        assertEquals("VIII", NumberConverter.arabicToRoman(8));
    }
    @Test
    public void testForNine(){
        assertEquals("IX", NumberConverter.arabicToRoman(9));
    }
    @Test
    public void testForEleven(){
        assertEquals("XI", NumberConverter.arabicToRoman(11));
    }
    @Test
    public void testForTwenty(){
        assertEquals("XX", NumberConverter.arabicToRoman(20));
    }
    @Test
    public void testForThirthynine(){
        assertEquals("XXXIX", NumberConverter.arabicToRoman(39));
    }

    @Test
    public void testForThreethousandFourhunderedThirtyTwo(){
        assertEquals("MMMCDXXXII", NumberConverter.arabicToRoman(3432));
    }

}
