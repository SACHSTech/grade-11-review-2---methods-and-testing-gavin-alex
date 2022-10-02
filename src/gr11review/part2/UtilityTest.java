package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;
import java.io.*;

public class UtilityTest {

    @Test
    public void xyzMiddleTest1() {
        assertEquals(true, Utility.xyzMiddle("AAvixyzsod"));
    }

    @Test
    public void xyzMiddleTest2() {
        assertEquals(false, Utility.xyzMiddle("AxyzBBB"));
    }

    @Test
    public void xyzMiddleTest3() {
        assertEquals(true, Utility.xyzMiddle("AxyzBB"));
    }

    @Test
    public void xyzMiddleTest4() {
        assertEquals(false, Utility.xyzMiddle("CGHBDxyzBBC"));
    }

    @Test
    public void alphaWordTest1() throws IOException {
        assertEquals("accompany", Utility.alphaWord("C:\\Users\\Tiger\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }

    @Test
    public void alphaWordTest2() throws IOException {
        assertEquals("able", Utility.alphaWord("C:\\Users\\Tiger\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_2.txt"));
    }

    @Test
    public void alphaWordTest3() throws IOException {
        assertEquals("bark", Utility.alphaWord("C:\\Users\\Tiger\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_3.txt"));
    }

    @Test
    public void alphaWordTest4() throws IOException {
        assertEquals("acid", Utility.alphaWord("C:\\Users\\Tiger\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_4.txt"));
    }

    @Test
    public void notAloneTest1() {
        int[] arrayActual = {1, 2, 3};
        int[] arrayExpected = {1, 3, 3};
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 2));
    }

    @Test
    public void notAloneTest2() {
        int[] arrayActual = {1, 2, 3, 2, 5, 2};
        int[] arrayExpected = {1, 3, 3, 5, 5, 2};
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 2));
    }
    
    @Test
    public void notAloneTest3() {
        int[] arrayActual = {3, 4};
        int[] arrayExpected = {3, 4};
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 3));
    }
    
    @Test
    public void notAloneTest4() {
        int[] arrayActual = {1, 2, 3, 3, 5, 6, 7, 8, 1, 2, 3, 9};
        int[] arrayExpected = {1, 2, 3, 3, 5, 6, 7, 8, 1, 2, 9, 9};
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 3));
    }

    @Test
    public void seriesUpTest1() {

        int[] arrayExpected = {1, 1, 2, 1, 2, 3};
        assertArrayEquals(arrayExpected, Utility.seriesUp(3));
    }
    
    @Test
    public void seriesUpTest2() {

        int[] arrayExpected = {};
        assertArrayEquals(arrayExpected, Utility.seriesUp(0));
    }

    @Test
    public void seriesUpTest3() {

        int[] arrayExpected = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(arrayExpected, Utility.seriesUp(8));
    }
    
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
