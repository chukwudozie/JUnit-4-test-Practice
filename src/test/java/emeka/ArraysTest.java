package emeka;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

// this is testing with JUnit 4
public class ArraysTest {

    @Test
    public void testArraySort_RandomArray(){
        int [] numbers = {12,8,5,7,13,1,4};
        int [] expectedArray = {1,4,5,7,8,12,13};
        Arrays.sort(numbers);
        assertArrayEquals(expectedArray,numbers);

    }

    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray(){
        int [] numbers = null;
        int [] expectedArray = {1,4,5,7,8,12,13};
        Arrays.sort(numbers);
        assertArrayEquals(expectedArray,numbers);

    }

    @Test(timeout = 1000)
    public  void testSort_Performance(){
        int[] array = {12,23,4};
        for(int i = 1; i < 1000000; i++){
            array[0]=i;
            Arrays.sort(array);
        }
    }

}