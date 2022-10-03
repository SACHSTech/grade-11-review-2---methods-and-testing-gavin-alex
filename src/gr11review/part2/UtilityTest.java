package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import gr11review.part2.Utility; 

public class UtilityTest{


    /**
     * Test When one y comes after one x 
     */
    @Test
    public void xyBalanceTest1(){
        assertEquals(true, Utility.xyBalance("xasdayxasdasday"));
    }

    /**
     * Test when one x comes after one y
     */
    
    @Test
    public void xyBalanceTest2(){
        assertEquals(false, Utility.xyBalance("yaabbsadasdx"));
    }

    /**
     * Test When string has only one y
     */
    @Test
    public void xyBalanceTest3(){
        assertEquals(true, Utility.xyBalance("y"));
    }

    /**
     * Test When empty string
     */

    @Test
    public void xyBalanceTest4(){
        assertEquals(true, Utility.xyBalance(""));
    }
     /**
     * Test this file of words of varyling length
     * @throws IOException
     */
    @Test
    public void longestWordTest1() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\gavin\\OneDrive\\Desktop\\grade-11-review-2---methods-and-testing-gavin-alex\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    } 
     /**
     * Test this file when multiple words are of same length
     * @throws IOException
     */
    @Test
    public void longestWordTest2() throws IOException{
        assertEquals("epsilon", Utility.longestWord("C:\\Users\\gavin\\OneDrive\\Desktop\\grade-11-review-2---methods-and-testing-gavin-alex\\src\\gr11review\\test2\\Review2_3Test_3.txt"));
    } 

    /**
     * Test this array
     */
    @Test
    public void withoutTenTest1(){
        int[] array = {1, 10, 10, 2, 5, 6, 10};
        int[] arrayExpected = {1, 2, 5, 6, 0, 0, 0};
        assertArrayEquals(arrayExpected, Utility.withoutTen(array));
    }
     /**
     * Test this array
     */

    @Test
    public void withoutTenTest2(){
        int[] arrayTwo = {10, 2, 10, 10, 11, 12};
        int[] arrayExpectedTwo = {2, 11, 12, 0, 0, 0};
        assertArrayEquals(arrayExpectedTwo, Utility.withoutTen(arrayTwo));
    }

     /**
     * Test when array is empty
     */

    @Test
    public void withoutTenTest3(){
        int[] arrayThree = {};
        int[] arrayExpectedThree = {};
        assertArrayEquals(arrayExpectedThree, Utility.withoutTen(arrayThree));
    }

     /**
     * Test when array is all zeros
     */

    @Test 
    public void withoutTenTest4(){
        int[] arrayFour = new int[4];
        int[] arrayExpectedFour = new int[4];
        assertArrayEquals(arrayExpectedFour, Utility.withoutTen(arrayFour));
    }

     /**
     * Test when array is all the same numbers
     */

    @Test
    public void canBalanceTest1(){
        int[] canBalanceArray1 = {1, 1, 1, 1};
        assertEquals(true, Utility.canBalance(canBalanceArray1));
    }

     /**
     * Test when array is balanced
     */
    @Test
    public void canBalanceTest2(){
        int[] canBalanceArray2 = {1, 3, 4};
        assertEquals(true, Utility.canBalance(canBalanceArray2));
    }
     /**
     * Test when array is balanced and long
     */

    @Test
    public void canBalanceTest3(){
        int[] canBalanceArray3 = {10, 20, 100, 50, 60, 20};
        assertEquals(true, Utility.canBalance(canBalanceArray3));
    }
    /**
     * Test when array is not balanced 
    */
    @Test
    public void canBalanceTest4(){
        int[] canBalanceArray4 = {11, 20, 100, 50, 60, 20};
        assertEquals(false, Utility.canBalance(canBalanceArray4));
    }

    /**
    * Test to return up to a certian point in an array
    */
    @Test
    public void splitTest1(){
        int[][] splitArray1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] splitArrayExpected1 = {{1, 2},{4, 5}};
        assertArrayEquals(splitArrayExpected1, Utility.split(splitArray1, 1, 1));
    }

    /**
    * Test to return the whole array
    */

    @Test
    public void splitTest2(){
        int[][] splitArray2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] splitArrayExpected2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        assertArrayEquals(splitArrayExpected2, Utility.split(splitArray2, 2, 2));
    }

    /**
    * Test to return the first number of the array
    */
    
    @Test
    public void splitTest3(){
        int[][] splitArray3 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] splitArrayExpected3 = {{1}};
        assertArrayEquals(splitArrayExpected3, Utility.split(splitArray3, 0, 0));
    }
    
}

    

  
