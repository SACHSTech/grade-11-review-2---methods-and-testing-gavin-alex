package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

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
        assertEquals("accompany", Utility.alphaWord(
                "C:\\Users\\Andrew\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }

    /**
     * Second text file test
     * 
     * @author A. Chan
     */
    @Test
    public void alphaWordTest2() throws IOException {
        assertEquals("able", Utility.alphaWord(
                "C:\\Users\\Andrew\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_2.txt"));
    }

    /**
     * Third text file test
     * 
     * @author A. Chan
     */
    @Test
    public void alphaWordTest3() throws IOException {
        assertEquals("bark", Utility.alphaWord(
                "C:\\Users\\Andrew\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_3.txt"));
    }

    /**
     * Fourth text file test
     * 
     * @author A. Chan
     */
    @Test
    public void alphaWordTest4() throws IOException {
        assertEquals("acid", Utility.alphaWord(
                "C:\\Users\\Andrew\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_4.txt"));
    }

    /**
     * notAlone test 3 elements
     * 
     * @author A. Chan
     */
    @Test
    public void notAloneTest1() {
        int[] arrayActual = { 1, 2, 3 };
        int[] arrayExpected = { 1, 3, 3 };
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 2));
    }

    /**
     * notAlone test multiple elements
     * 
     * @author A. Chan
     */
    @Test
    public void notAloneTest2() {
        int[] arrayActual = { 1, 2, 3, 2, 5, 2 };
        int[] arrayExpected = { 1, 3, 3, 5, 5, 2 };
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 2));
    }

    /**
     * notAlone test 2 elements
     * 
     * @author A. Chan
     */
    @Test
    public void notAloneTest3() {
        int[] arrayActual = { 3, 4 };
        int[] arrayExpected = { 3, 4 };
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 3));
    }

    /**
     * notAlone test specified character at end of array
     * 
     * @author A. Chan
     */
    @Test
    public void notAloneTest4() {
        int[] arrayActual = { 3, 3, 2 };
        int[] arrayExpected = { 3, 3, 2 };
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 2));
    }

    /**
     * seriesUp test 1
     * 
     * @author A. Chan
     */
    @Test
    public void seriesUpTest1() {

        int[] arrayExpected = { 1, 1, 2, 1, 2, 3 };
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

        int[] arrayExpected = { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1,
                2, 3, 4, 5, 6, 7, 8 };
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
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        int[][] arrayExpected = {
                { 1, 4, 7 },
                { 2, 5, 8 },
                { 3, 6, 9 },
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
                { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
        };

        int[][] arrayExpected = {
                { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 },
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
                { 7, 8, 9 },
                { 19, 29, 48 },
                { 13, 3, 2 },
        };

        int[][] arrayExpected = {
                { 7, 19, 13 },
                { 8, 29, 3 },
                { 9, 48, 2 },
        };

        int[][] resultArr = Utility.invert(arrayActual);
        for (int i = 0; i < arrayActual.length; i++) {
            assertArrayEquals(arrayExpected[i], resultArr[i]);
        }
    }

    @Test 

    /** 
     * Testing addSumNumbers1
     * @author A. Young
     */

    public void addsumNumbersTest1(){
        assertEquals(18, Utility.sumNumbers("7 11"));

    }
    
    @Test

    /** 
     * Testing addSumNumbers2
     * @author A. Young
     */

    public void addsumNumbersTest2(){
        assertEquals(44, Utility.sumNumbers("aa11b33"));

    }

    @Test 

    /** 
     * Testing addSumNumbers3
     * @author A. Young
     */

    public void addsumNumbersTest3() {
        assertEquals(30, Utility.sumNumbers("yes30no"));
    }

    @Test 

    /** 
     * Testing addvowelCount1
     * @author A. Young
     */

    public void addvowelCountTest() throws IOException{
        assertEquals("development", Utility.vowelCount("C:\\Users\\Alex Young\\git\\grade-11-review-2---methods-and-testing-gavin-alex-1\\src\\gr11review\\part2\\test1.txt"));
        
    }

    @Test

    /** 
     * Testing addvowelCount2
     * @author A. Young
     */

    public void addVowelCountTest2() throws IOException{
        assertEquals("mainstream", Utility.vowelCount("C:\\Users\\Alex Young\\git\\grade-11-review-2---methods-and-testing-gavin-alex-1\\src\\gr11review\\part2\\test2.txt"));
    }

    @Test
    
    /** 
     * Testing addvowelCount3
     * @author A. Young
     */

    public void addVowelCountTest3() throws IOException{
        assertEquals("jurisdiction", Utility.vowelCount("C:\\Users\\Alex Young\\git\\grade-11-review-2---methods-and-testing-gavin-alex-1\\src\\gr11review\\part2\\test3.txt"));
    }

    @Test

    /** 
     * Testing addzeroFront1
     * @author A. Young
     */

    public void addszeroFrontTest1(){
        int [] nums = {1, 0 , 0 , 0}; 
        int [] numsTest = {0, 0 ,0, 1}; 
        assertArrayEquals(numsTest, Utility.zeroFront(nums));
    }

    @Test 

    /** 
     * Testing addzeroFront2
     * @author A. Young
     */

    public void addszeroFrontTest2(){
        int [] nums = {1, 0 , 0 , 0, 2, 3}; 
        int [] numsTest = {0, 0 ,0, 1, 2, 3}; 
        assertArrayEquals(numsTest, Utility.zeroFront(nums));
    }

    @Test

     /** 
     * Testing addzeroFront3
     * @author A. Young
     */

    public void addszeroFrontTest3(){
        int [] nums = {1, 0 , 0 , 4, 6, 8}; 
        int [] numsTest = {0, 0, 1, 4, 6, 8}; 
        assertArrayEquals(numsTest,Utility.zeroFront(nums));
    }

    @Test 

     /** 
     * Testing addlinearInTest1
     * @author A. Young
     */

    public void addlinearInTest1(){
    
    int [] outer = {1, 2, 3, 4, 5};
    int [] inner = {3, 4, 5};

    assertEquals(true, Utility.linearIn(outer, inner));
    }

    @Test

    /** 
     * Testing addlinearInTest2
     * @author A. Young
     */

    public void addlinearInTest2(){
        int [] outer = {1, 2, 3, 4, 5, 7, 9};
        int [] inner = {3, 4, 6};

        assertEquals(false, Utility.linearIn(outer,inner));
    }

    @Test

    /** 
     * Testing addlinearInTest3
     * @author A. Young
     */
    
    public void addlinearInTest3(){
        int [] outer = {1, 2, 3};
        int [] inner = {1, 2, 3, 5};

        assertEquals(false, Utility.linearIn(outer,inner));
    }

    @Test 

    /** 
     * Testing addreverseTest1
     * @author A. Young
     */

    public void addreverseTest1(){
        int [][] arrTest = {{9,8,7},{6,5,4},{3,2,1}};
       
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        
    
        assertArrayEquals(arrTest, Utility.reverse(arr));
    }

    @Test 

     /** 
     * Testing addreverseTest2
     * @author A. Young
     */

    public void addreverseTest2(){
        int [][] arrTest = {{1,2,3},{4,5,6},{7,8,9}};
       
        int [][] arr = {{9,8,7},{6,5,4},{3,2,1}};

        assertArrayEquals(arrTest,Utility.reverse(arr));

    }

    @Test 

     /** 
     * Testing addreverseTest3
     * @author A. Young
     */

    public void addreverseTest3(){
        int [][] arrTest = {{4,6,8},{10,12,14},{16,18,20}};
       
        int [][] arr = {{20,18,16},{14,12,10},{8,6,4}};

        assertArrayEquals(arrTest, Utility.reverse(arr));
    }

    /**
     * Test when one y comes after one x
     * 
     * @author G. Ge
     */

    @Test
    public void xyBalanceTest1() {
        assertEquals(true, Utility.xyBalance("xasdayxasdasday"));
    }

    /**
     * Test when one x comes after one y
     * 
     * @author G. Ge
     */

    @Test
    public void xyBalanceTest2() {
        assertEquals(false, Utility.xyBalance("yaabbsadasdx"));
    }

    /**
     * Test When string has only one y
     * 
     * @author G. Ge
     */
    @Test
    public void xyBalanceTest3() {
        assertEquals(true, Utility.xyBalance("y"));
    }

    /**
     * Test When empty string
     * 
     * @author G. Ge
     */

    @Test
    public void xyBalanceTest4() {
        assertEquals(true, Utility.xyBalance(""));
    }

    /**
     * Test this file of words of varyling length
     * 
     * @throws IOException
     * @author G. Ge
     */
    @Test
    public void longestWordTest1() throws IOException {
        assertEquals("conservation", Utility.longestWord(
                "C:\\Users\\gavin\\OneDrive\\Desktop\\grade-11-review-2---methods-and-testing-gavin-alex\\src\\gr11review\\test2\\LongestWordTest1.txt"));
    }

    /**
     * Test this file when multiple words are of same length
     * 
     * @throws IOException
     * @author G. Ge
     */
    @Test
    public void longestWordTest2() throws IOException {
        assertEquals("epsilon", Utility.longestWord(
                "C:\\Users\\gavin\\OneDrive\\Desktop\\grade-11-review-2---methods-and-testing-gavin-alex\\src\\gr11review\\test2\\LongsetWordTest2.txt"));
    }

    /**
     * Test this array
     * 
     * @author G. Ge
     */

    @Test
    public void withoutTenTest1() {
        int[] array = { 1, 10, 10, 2, 5, 6, 10 };
        int[] arrayExpected = { 1, 2, 5, 6, 0, 0, 0 };
        assertArrayEquals(arrayExpected, Utility.withoutTen(array));
    }

    /**
     * Test this array
     * 
     * @author G. Ge
     */

    @Test
    public void withoutTenTest2() {
        int[] arrayTwo = { 10, 2, 10, 10, 11, 12 };
        int[] arrayExpectedTwo = { 2, 11, 12, 0, 0, 0 };
        assertArrayEquals(arrayExpectedTwo, Utility.withoutTen(arrayTwo));
    }

    /**
     * Test when array is empty
     * 
     * @author G. Ge
     */

    @Test
    public void withoutTenTest3() {
        int[] arrayThree = {};
        int[] arrayExpectedThree = {};
        assertArrayEquals(arrayExpectedThree, Utility.withoutTen(arrayThree));
    }

    /**
     * Test when array is all zeros
     * 
     * @author G. Ge
     */

    @Test
    public void withoutTenTest4() {
        int[] arrayFour = new int[4];
        int[] arrayExpectedFour = new int[4];
        assertArrayEquals(arrayExpectedFour, Utility.withoutTen(arrayFour));
    }

    /**
     * Test when array is all the same numbers
     * 
     * @author G. Ge
     */

    @Test
    public void canBalanceTest1() {
        int[] canBalanceArray1 = { 1, 1, 1, 1 };
        assertEquals(true, Utility.canBalance(canBalanceArray1));
    }

    /**
     * Test when array has one element
     * 
     * @author G. Ge
     */
    @Test
    public void canBalanceTest2() {
        int[] canBalanceArray2 = { 1 };
        assertEquals(false, Utility.canBalance(canBalanceArray2));
    }

    /**
     * Test when array is balanced and long
     * 
     * @author G. Ge
     */

    @Test
    public void canBalanceTest3() {
        int[] canBalanceArray3 = { 10, 20, 100, 50, 60, 20 };
        assertEquals(true, Utility.canBalance(canBalanceArray3));
    }

    /**
     * Test when array is not balanced
     * 
     * @author G. Ge
     */
    @Test
    public void canBalanceTest4() {
        int[] canBalanceArray4 = { 11, 20, 100, 50, 60, 20 };
        assertEquals(false, Utility.canBalance(canBalanceArray4));
    }

    /**
     * Test to return up to a certian point in an array
     * 
     * @author G. Ge
     */

    @Test
    public void splitTest1() {
        int[][] splitArray1 = { { 1, 4, 3 }, { 4, 8, 6 }, { 7, 8, 9 } };
        int[][] splitArrayExpected1 = { { 1, 4 }, { 4, 8 } };
        assertArrayEquals(splitArrayExpected1, Utility.split(splitArray1, 1, 1));
    }

    /**
     * Test to return the whole array
     * 
     * @author G. Ge
     */

    @Test
    public void splitTest2() {
        int[][] splitArray2 = { { 1, 1, 1 }, { 4, 4, 4 }, { 7, 7, 7 } };
        int[][] splitArrayExpected2 = { { 1, 1, 1 }, { 4, 4, 4 }, { 7, 7, 7 } };
        assertArrayEquals(splitArrayExpected2, Utility.split(splitArray2, 2, 2));
    }

    /**
     * Test to return the first number of the array
     * 
     * @author G. Ge
     */

    @Test
    public void splitTest3() {
        int[][] splitArray3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] splitArrayExpected3 = { { 1 } };
        assertArrayEquals(splitArrayExpected3, Utility.split(splitArray3, 0, 0));
    }
}
