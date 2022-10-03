package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;
import java.io.*;

public class UtilityTest{
  

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
