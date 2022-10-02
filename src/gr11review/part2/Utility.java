package gr11review.part2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Utility {


    public static void main(String[] args)throws IOException {

        xyzMiddle("AAxyzBB");
        seriesUp(3);

        System.out.println(alphaWord("C:\\Users\\Tiger\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_1.txt"));

        
    
    }


    /**
     * Given a string, determine if 'xyz' is in the middle
     * 
     * @param str Given a string, determine if 'xyz' is in the middle
     * @return true if 'xyz' is in the middle of the string, false otherwise
     * @author A. Chan
     */
    public static boolean xyzMiddle(String str) {
        int intMiddle = str.length()/2 - 1;

        // check right of middle, if 'xyz' is found, return true
        if (str.length() >= 3 && (str.substring(intMiddle, intMiddle + 3).equals("xyz"))) {
            return true;
        }
        
        // check left of middle, if 'xyz' is found, return true
        if (str.length() % 2 == 0 && str.substring(intMiddle - 1, intMiddle + 2).equals("xyz")) {
            return true;
         }

        // return false if xyz is not found in the middle of the string
        return false;
    }

    /**
     * Sorts a text file with multiple words on separate lines, returns the word that is alphabetically first
     * 
     * @param filenametxt Text file location
     * @return The word that is alphabetically first
     * @author A. Chan
     */
    public static String alphaWord(String filenametxt) throws IOException {

        // create array list
        ArrayList<String> str = new ArrayList<String>();

        // read line variable
        String word;

        // text file input
        BufferedReader reader = new BufferedReader(new FileReader(filenametxt));

        // add words to array list
        while ((word = reader.readLine()) != null) {
            str.add(word);
        }
        reader.close();

        // sort the array
        Collections.sort(str);
        
        // return the word that is alphabetically first (index 0)
        String alpha = str.get(0);

        return alpha;
    }

    /**
     * Given an array, return a version where every instance of the given value which is alone is replaced by whichever value to its left or right is larger
     * 
     * @param nums Specified array
     * @param value Value that is to be replaced
     * @return value by replacing it with whichever value to its left or right is larger
     * @author A. Chan
     */
    public static int[] notAlone(int[] nums, int value) {

        // loop through array
        for (int i = 1; i < nums.length - 1; i++) {
            
            // check if array index is equal to specified value, and that the values before and after are not the same value
            if(nums[i] == value && nums[i - 1] != nums[i] && nums[i] != nums[i + 1]) {

                // replace array index with the greater of the two numbers
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        // return array
        return nums;
    }

    /**
     * Creates an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
     * 
     * @param n Number that will be at the end of the pattern (1, 1, 2 ... 1, 2, 3 .. n)
     * @return An array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
     * @author A. Chan
     */
    public static int[] seriesUp(int n) {

        // create new array
        int[] newArray = new int[n * (n + 1) / 2];

        // set intCounter variable to 0
        int intCounter = 0;

        // outer loop, loop through numbers until n (specified num)
        for (int i = 1; i <= n; i++) {

            // inner loop, iterate through loop until i (outer loop)
            for (int j = 1; j <= i; j++) {

                // set index of array equal to j
                newArray[intCounter++] = j; 
            }
        }

        // return new array
        return newArray;    
    }

    /**
     * Inverts a 2D array (each row of the 2D array is now a column, and each column is now a row)
     * 
     * @param arr Given 2D array to be inverted
     * @return Inverted array
     * @author A. Chan
     */
    public static int[][] invert(int[][] arr) {

        // row and column variables
        int rows = arr.length;
        int columns = arr[0].length;

        // new array to store inverted values
        int invertedArray[][] = new int[rows][columns];

        // loop through rows
        for (int i = 0; i < rows; i++) {
            
            // loop through columns
            for (int j = 0; j < columns; j++) {
                
                // replace element with inverted value
                invertedArray[rows - i - 1][columns - j - 1] = arr[i][j];
            }
        }
        return invertedArray;
    }
}