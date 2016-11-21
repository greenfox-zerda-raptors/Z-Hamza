package Week06;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Zoltán on 2016.11.21..
 */
public class FibonacciTest {
    @Test
    public void seriesFibonacci() throws Exception {
    Fibonacci a = new Fibonacci();
        assertEquals(new Integer[]{0,1,1,2,3,5}, a.listFibonacci(5));
    }
    @Test
    public void seriesFibonacci1() throws Exception {
        Fibonacci b = new Fibonacci();
        assertEquals(new Integer[]{0,1}, b.listFibonacci(1));
    }
    @Test
    public void seriesFibonacci2() throws Exception {
        Fibonacci c = new Fibonacci();
        assertEquals(new Integer[]{0}, c.listFibonacci(0));
    }
    @Test
    public void seriesFibonacci3() throws Exception {
        Fibonacci d = new Fibonacci();
        assertEquals(new Integer[]{}, d.listFibonacci(-1));
    }
}