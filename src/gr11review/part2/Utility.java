package gr11review.part2;

import java.io.*;

public class Utility {
  
    /**
     * Given a string determine if all x's have at least one y coming after them in the string
     * 
     * @param str string to determine if x-y balanced
     * @return boolean value if string is x-y balanced
     * @author G.Ge
     * 
     */

    public static boolean xyBalance(String str) {

        // Initialize variables for location of x and y chars
        int intXPos = 0;
        int intXCount = 0;
        int intYPos = 0;


        // If index of y is greater than x, string is balanced
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'x'){
                intXPos = i;
                intXCount++;
            }
            if (str.charAt(i) == 'y'){
                intYPos = i;
            }
            if (intYPos > intXPos){
                return true;
            }
        }

        // Otherwise, return false.
        if (intXCount == 0){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Given a file with multiple lines of words, return the longest word
     * 
     * @param filenametxt given text file
     * @return return the longest word as a string
     * @author G.Ge
     * 
     */

    public static String longestWord(String filenametxt)throws IOException{
        // Create two string variables
        String strLargest = "";
        String strCurrent;

        // Initialized buffered reader and set a string equal to the first line in theh file
        BufferedReader reader = new BufferedReader(new FileReader(filenametxt));
        String line = reader.readLine();
        
        // While the file still has words loop through the file
        while (line != null) {
            
            // If current word is longer than longest word, replace it
            strCurrent = line;
            if (strCurrent.length() > strLargest.length()){
                strLargest = strCurrent;
            }
            // Read next line
            line = reader.readLine();
        }
        reader.close();
        return strLargest;
    }
    
    /**
     * Given an array replace all '10s' with 0s at the end of the array and move all non-ten elements to the beginning
     * 
     * @param nums array of numbers to sort 
     * @return array with tens replaced 
     * @author G.Ge
     * 
     */

    public static int[] withoutTen(int[] nums) {

        // Create a new array and counter
        int intCounter = 0;
        int newArr[] = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            // if element in array isn't equal to 10 add to beginning of new array
            if (nums[i] != 10){
                newArr[intCounter] = nums[i];
                intCounter++;
            }
        }
        // return new array
        return newArr; 
    }
   
    /**
     * Given an array determine if you can split the array, so boths sides are equal
     * 
     * @param nums Array to be split
     * @return If the array could be split equally 
     * @author G.Ge
     * 
     */

    public static boolean canBalance(int[] nums) {

        // Variables for the sums of the array from left and right
        int intSumLeft = 0;
        int intSumRight = 0;
        
        // Get sum of array from the left side
        for(int i = 0; i < nums.length; i++){
            intSumRight = 0;
            intSumLeft += nums[i];
            // Get sum of array from the right side
            for (int x = (nums.length-1); x>i; x--){
                intSumRight += nums[x];
                // If sums match and all elements in array are accounted for, return true
                if (intSumLeft == intSumRight && x == (i+1)){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Given an 2d array, return an array with elements up to a certain row and column of the original 2d array
     * 
     * @param arr Original array
     * @param row The row to fetch up to
     * @param col The column to fetch up to
     * @return an array with elements up to the designated row and column
     * @author G.Ge
     * 
     */

    public static int[][] split(int[][] arr, int row, int col){

        // Create new array with lengths of row and column desired
        int [][] newArray = new int[row+1][col+1];

        for (int i = 0; i <= row; i++){
            for (int x = 0; x <= col; x++){
                // Up to the row and column copy elements to new array
                newArray[i][x] = arr[i][x];
            }
        }
        return newArray;
    }
}