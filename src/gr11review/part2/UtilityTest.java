package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{


    @Test
    public void xyBalanceTest1(){
        assertEquals(true, Utility.xyBalance("xasdayxasdasday"));
    }

    @Test
    public void xyBalanceTest2(){
        assertEquals(true, Utility.xyBalance("yasdasdasdasdax"));
    }

    @Test
    public void xyBalanceTest3(){
        assertEquals(true, Utility.xyBalance("y"));
    }
    @Test
    public void xyBalanceTest4(){
        assertEquals(true, Utility.xyBalance(" "));
    }

    @Test
    public void longestWordTest1() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\gavin\\OneDrive\\Desktop\\grade-11-review-2---methods-and-testing-gavin-alex\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    } 

    @Test
    public void withoutTenTest1(){
        int[] array = {1, 10, 10, 2};
        int[] arrayExpected = {1,2,0,0};
        assertArrayEquals(arrayExpected, Utility.withoutTen(array));
    }

    @Test
    public void withoutTenTest2(){
        int[] arrayTwo = {10, 2, 10};
        int[] arrayExpectedTwo = {2,0,0};
        assertArrayEquals(arrayExpectedTwo, Utility.withoutTen(arrayTwo));
    }

    @Test
    public void withoutTenTest3(){
        int[] arrayThree = {1, 99, 10};
        int[] arrayExpectedThree = {1, 99, 0};
        assertArrayEquals(arrayExpectedThree, Utility.withoutTen(arrayThree));
    }
    
    @Test 
    public void withoutTenTest4(){
        int[] arrayFour = new int[4];
        int[] arrayExpectedFour = new int[4];
        assertArrayEquals(arrayExpectedFour, Utility.withoutTen(arrayFour));
    }

    @Test
    public void canBalanceTest1(){
        int[] canBalanceArray1 = {1,1,1,1};
        assertEquals(true, Utility.canBalance(canBalanceArray1));
    }

    @Test
    public void canBalanceTest2(){
        int[] canBalanceArray2 = {1,3,4};
        assertEquals(true, Utility.canBalance(canBalanceArray2));
    }

    @Test
    public void canBalanceTest3(){
        int[] canBalanceArray3 = {10,20,100,50,60,20};
        assertEquals(true, Utility.canBalance(canBalanceArray3));
    }

    @Test
    public void splitTest1(){
        int[][] splitArray1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] splitArrayExpected1 = {{1,2},{4,5}};
        assertArrayEquals(splitArrayExpected1, Utility.split(splitArray1, 1, 1));
    }
    
    
  
}
