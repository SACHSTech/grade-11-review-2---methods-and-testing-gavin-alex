package gr11review.part2;

import java.io.*;
import java.util.Scanner;

public class Utility {
    public static void main(String[] args) {
        // All test cases
        
        xyBalance("xaaby");
        //longestWord("C:/Users/gavin/OneDrive/Desktop/grade-11-review-2---methods-and-testing-gavin-alex/src/gr11review/test2/Review2_3Test_1.txt");
        int [] array = {1, 10, 10, 2};
        withoutTen(array);
        int [] arrayTwo = {1, 10, 10, 2};
        canBalance(arrayTwo);
        int [][] arrayThree = {{1,2,3},{4,5,6},{7,8,9}};
        split(arrayThree, 2, 2);

    }

    /**
     * Given a string determine if it's x y balanced
     * 
     * @param str Given a string determine if it's x and y balanced
     * @return if the string is x-y balanced
     * @author G.Ge
     * 
     */


    public static boolean xyBalance(String str) {

        // Initialize variables for location of x and y chars
        int intX = 0;
        int intY = 0;


        // If index of y is greater than x, string is balanced
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'x'){
                intX = i;
            }
            if (str.charAt(i) == 'y'){
                intY = i;
            }
            if (intY > intX){
                System.out.println("True");
                return true;
            }
        }
        // Otherwise, return false.
        System.out.println("False");
        return false;
        
    }
    
    public static String longestWord(String filenametxt)throws FileNotFoundException{
        String strLargest = "";
        String strCurrent;
        Scanner scanner  = new Scanner(new File(filenametxt));
        String line;
        while (scanner.hasNextLine()) {
            strCurrent = scanner.nextLine();
            if (strCurrent.length() > strLargest.length()){
                strLargest = strCurrent;
            }
        }
        return strLargest;
    }
    
    
    /**
     * Given an array replace all '10s' with 0s at the end of the array and move all nonten elements to the beginning
     * 
     * @param nums array of numbers to sort 
     * @return array with tens replaced 
     * @author G.Ge
     * 
     */

    public static int[] withoutTen(int[] nums) {
        // Create a ccounter and new array
        int intArrayCounter = 0;
        int newArr[] = new int[nums.length];
        

        for(int i = 0; i < nums.length; i++){
            // if element in array isn't equal to 10 add to new array
            if (nums[i] != 10){
                newArr[intArrayCounter] = nums[i];
                intArrayCounter++;
            }
            System.out.println(newArr[i]);
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
     */
    public static boolean canBalance(int[] nums) {
        // Variables for the sumes of the array from left and right
        int intSumLeft = 0;
        int intSumRight = 0;
        
        for(int i = 0; i < nums.length; i++){
            intSumLeft += nums[i];
            for (int x = nums.length-1; x>i; x--){
                intSumRight += nums[x];
                if (intSumLeft == intSumRight && x == (i+1)){
                    System.out.println("true");
                    return true;
                }
                intSumRight = 0;
            }
        }
        System.out.println("false");
        return false;
    }
    /**
     * Given an 2d array, return an array with elements up to a certain row and column
     * 
     * @param arr Original array
     * @param row The row to fetch up to
     * @param col The column to fetch up to
     * @return an array with elements up to the designated row and column
     * @author G.Ge
     */
    public static int[][] split(int[][] arr, int row, int col){

        // Create new array up to length of row and column desured
        int [][] newArray = new int[row+1][col+1];

        for (int i = 0; i <= row; i++){
            for (int x = 0; x <= col; x++){
                // Up to the row and column copy elements to new array
                newArray[i][x] = arr[i][x];
                System.out.println(newArray[i][x]);
            }
        }
        return newArray;
        
    }

    

}

