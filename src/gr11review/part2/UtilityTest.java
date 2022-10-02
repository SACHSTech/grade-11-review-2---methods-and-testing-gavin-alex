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
    public void alphaWordTest1() throws IOException {
        assertEquals("accompany", Utility.alphaWord("C:\\Users\\Tiger\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }

    @Test
    public void notAloneTest1() {
        int[] arrayOne = {1, 2, 3};
        int[] arrayExpectedOne = {1, 3, 3};
        assertArrayEquals(arrayExpectedOne, Utility.notAlone(arrayOne, 2));
    }
    
  
}
