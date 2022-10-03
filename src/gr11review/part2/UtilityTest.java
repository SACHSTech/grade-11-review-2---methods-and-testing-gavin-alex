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
  

    @Test 

    public void addsumNumbersTest1(){
        assertEquals(18, Utility.sumNumbers("7 11"));

    }
    
    @Test

    public void addsumNumbersTest2(){
        assertEquals(44, Utility.sumNumbers("aa11b33"));

    }

    @Test 

    public void addsumNumbersTest3() {
        assertEquals(30, Utility.sumNumbers("yes30no"));
    }

    @Test 

    public void addvowelCountTest() throws IOException{
        assertEquals("development", Utility.vowelCount("C:\\Users\\Alex Young\\git\\grade-11-review-2---methods-and-testing-gavin-alex-1\\src\\gr11review\\part2\\test1.txt"));
        
    }

    @Test

    public void addVowelCountTest2() throws IOException{
        assertEquals("mainstream", Utility.vowelCount("C:\\Users\\Alex Young\\git\\grade-11-review-2---methods-and-testing-gavin-alex-1\\src\\gr11review\\part2\\test2.txt"));
    }

    @Test

    public void addVowelCountTest3() throws IOException{
        assertEquals("jurisdiction", Utility.vowelCount("C:\\Users\\Alex Young\\git\\grade-11-review-2---methods-and-testing-gavin-alex-1\\src\\gr11review\\part2\\test3.txt"));
    }

    @Test

    public void addszeroFrontTest1(){
        int [] nums = {1, 0 , 0 , 0}; 
        int [] numsTest = {0, 0 ,0, 1}; 
        assertArrayEquals(numsTest, Utility.zeroFront(nums));
    }

    @Test 

    public void addszeroFrontTest2(){
        int [] nums = {1, 0 , 0 , 0, 2, 3}; 
        int [] numsTest = {0, 0 ,0, 1, 2, 3}; 
        assertArrayEquals(numsTest, Utility.zeroFront(nums));
    }

    @Test

    public void addszeroFrontTest3(){
        int [] nums = {1, 0 , 0 , 4, 6, 8}; 
        int [] numsTest = {0, 0, 1, 4, 6, 8}; 
        assertArrayEquals(numsTest,Utility.zeroFront(nums));
    }

    @Test 

    public void addlinearInTest(){
    
    int [] outer = {1, 2, 3, 4, 5};
    int [] inner = {3, 4, 5};

    assertEquals(true, Utility.linearIn(outer, inner));
    }

    @Test

    public void addlinearInTest2(){
        int [] outer = {1, 2, 3, 4, 5, 7, 9};
        int [] inner = {3, 4, 6};

        assertEquals(false, Utility.linearIn(outer,inner));
    }

    @Test
    
    public void addlinearInTest3(){
        int [] outer = {1, 2, 3};
        int [] inner = {1, 2, 3, 5};

        assertEquals(false, Utility.linearIn(outer,inner));
    }

    @Test 

    public void addreverseTest(){
        int [][] arrTest = {{9,8,7},{6,5,4},{3,2,1}};
       
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        
    
        assertArrayEquals(arrTest, Utility.reverse(arr));
    }

    @Test 

    public void addreverseTest2(){
        int [][] arrTest = {{1,2,3},{4,5,6},{7,8,9}};
       
        int [][] arr = {{9,8,7},{6,5,4},{3,2,1}};

        assertArrayEquals(arrTest,Utility.reverse(arr));

    }

    @Test 
    
    public void addreverseTest3(){
        int [][] arrTest = {{4,6,8},{10,12,14},{16,18,20}};
       
        int [][] arr = {{20,18,16},{14,12,10},{8,6,4}};

        assertArrayEquals(arrTest, Utility.reverse(arr));
    }
}
