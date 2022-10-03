package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;
import java.io.*;

public class UtilityTest {

    /**
     * Testing xyzMiddle #1
     * 
     * @author A. Chan
     */
    @Test
    public void xyzMiddleTest1() {
        assertEquals(true, Utility.xyzMiddle("AAvixyzsod"));
    }

    /**
     * Testing xyzMiddle difference > 1
     * 
     * @author A. Chan
     */
    @Test
    public void xyzMiddleTest2() {
        assertEquals(false, Utility.xyzMiddle("AxyzBBB"));
    }

    /**
     * Testing xyzMiddle #3
     * 
     * @author A. Chan
     */
    @Test
    public void xyzMiddleTest3() {
        assertEquals(true, Utility.xyzMiddle("AxyzBB"));
    }
    
    /**
     * Testing xyzMiddle capital XYZ
     * 
     * @author A. Chan
     */
    @Test
    public void xyzMiddleTest4() {
        assertEquals(false, Utility.xyzMiddle("CGHBDXYZBBC"));
    }

    /**
     * First text file test
     * 
     * @author A. Chan
     */
    @Test
    public void alphaWordTest1() throws IOException {
        assertEquals("accompany", Utility.alphaWord("C:\\Users\\Andrew\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }

    /**
     * Second text file test
     * 
     * @author A. Chan
     */
    @Test
    public void alphaWordTest2() throws IOException {
        assertEquals("able", Utility.alphaWord("C:\\Users\\Andrew\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_2.txt"));
    }

    /**
     * Third text file test
     * 
     * @author A. Chan
     */
    @Test
    public void alphaWordTest3() throws IOException {
        assertEquals("bark", Utility.alphaWord("C:\\Users\\Andrew\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_3.txt"));
    }

    /**
     * Fourth text file test
     * 
     * @author A. Chan
     */
    @Test
    public void alphaWordTest4() throws IOException {
        assertEquals("acid", Utility.alphaWord("C:\\Users\\Andrew\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_4.txt"));
    }

    /**
     * notAlone test 3 elements
     * 
     * @author A. Chan
     */
    @Test
    public void notAloneTest1() {
        int[] arrayActual = {1, 2, 3};
        int[] arrayExpected = {1, 3, 3};
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 2));
    }

    /**
     * notAlone test multiple elements
     * 
     * @author A. Chan
     */
    @Test
    public void notAloneTest2() {
        int[] arrayActual = {1, 2, 3, 2, 5, 2};
        int[] arrayExpected = {1, 3, 3, 5, 5, 2};
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 2));
    }
    
    /**
     * notAlone test 2 elements
     * 
     * @author A. Chan
     */
    @Test
    public void notAloneTest3() {
        int[] arrayActual = {3, 4};
        int[] arrayExpected = {3, 4};
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 3));
    }
    
    /**
     * notAlone test specified character at end of array
     * 
     * @author A. Chan
     */
    @Test
    public void notAloneTest4() {
        int[] arrayActual = {3, 3, 2};
        int[] arrayExpected = {3, 3, 2};
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 2));
    }

    /**
     * seriesUp test 1
     * 
     * @author A. Chan
     */
    @Test
    public void seriesUpTest1() {

        int[] arrayExpected = {1, 1, 2, 1, 2, 3};
        assertArrayEquals(arrayExpected, Utility.seriesUp(3));
    }
    
    /**
     * seriesUp test 2, 0 inputted
     * 
     * @author A. Chan
     */
    @Test
    public void seriesUpTest2() {

        int[] arrayExpected = {};
        assertArrayEquals(arrayExpected, Utility.seriesUp(0));
    }

    /**
     * seriesUp test three
     * 
     * @author A. Chan
     */
    @Test
    public void seriesUpTest3() {

        int[] arrayExpected = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(arrayExpected, Utility.seriesUp(8));
    }
    
    /**
     * invert test 1
     * 
     * @author A. Chan
     */
    @Test
    public void invertTest1() {
        
        int[][] arrayActual = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        int[][] arrayExpected = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9},
        };

            assertArrayEquals(arrayExpected, Utility.invert((arrayActual)));
    } 
    
    /**
     * invert test 2
     * 
     * @author A. Chan
     */
    @Test
    public void invertTest2() {
        
        int[][] arrayActual = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3},
        };

        int[][] arrayExpected = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3},
        };

        int[][] resultArr = Utility.invert(arrayActual);
        for (int i = 0; i < arrayActual.length; i++) {
            assertArrayEquals(arrayExpected[i], resultArr[i]);
        } 
    }

    /**
     * seriesUp test 3
     * 
     * @author A. Chan
     */
    @Test
    public void invertTest3() {
        
        int[][] arrayActual = {
            {7, 8, 9},
            {19, 29, 48},
            {13, 3, 2},
        };

        int[][] arrayExpected = {
            {7, 19, 13},
            {8, 29, 3},
            {9, 48, 2},
        };

        int[][] resultArr = Utility.invert(arrayActual);
        for (int i = 0; i < arrayActual.length; i++) {
            assertArrayEquals(arrayExpected[i], resultArr[i]);
        } 
    }
  
}
