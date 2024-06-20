package test;

import Arrays.IntArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class IntArraysTest {
    @Test
    public void testIntArray(){
        IntArray result = new IntArray(5);
        int []  expected = {1,2,3,4,5};
        assertArrayEquals(expected,result.getMyArray());
    }
}
