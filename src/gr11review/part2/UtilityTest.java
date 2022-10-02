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

    public void addvowelCount() throws IOException{
        assertEquals("Hello", Utility.vowelCount("C:\\Users\\Alex Young\\git\\grade-11-review-2---methods-and-testing-gavin-alex-1\\src\\gr11review\\part2\\test1.txt"));
        
    }

    @Test

    public void addszeroFront1(){
        int [] nums = {1, 0 , 0 , 0}; 
        int [] numsTest = {0, 0 ,0, 1}; 
        assertArrayEquals(numsTest, Utility.zeroFront(nums));
    }

    @Test 

    public void addszeroFront2(){
        int [] nums = {1, 0 , 0 , 0, 2, 3}; 
        int [] numsTest = {0, 0 ,0, 1, 2, 3}; 
        assertArrayEquals(numsTest, Utility.zeroFront(nums));
    }

    @Test 

    public void addlinearIn(){
    
    int [] outer = {1, 2, 3, 4, 5};
    int [] inner = {3, 4, 5};

    assertEquals(true, Utility.linearIn(outer, inner));
    }

    @Test 

    public void addreverse(){
        int [][] arrTest = {{9,8,7},{6,5,4},{3,2,1}};;
       
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};;
        ;
    
        assertArrayEquals(arrTest, Utility.reverse(arr));
    }
}
