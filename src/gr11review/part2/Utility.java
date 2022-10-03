package gr11review.part2;
import java.io.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Utility {



    public static void main(String[] args)throws IOException {

        xyzMiddle("AAxyzBB");
        seriesUp(3);

        System.out.println(alphaWord("C:\\Users\\Tiger\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-gavin-alex-andrew\\src\\gr11review\\test2\\Review2_3Test_1.txt"));

        seriesUp(8);
        seriesUp(0);
    
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

            // inner loop, iterate through loop until i 
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
        
        // initialize row and column counter variables
        int columnCount = arr[0].length;
        int rowCount = arr.length;

        // create new array to store inverted values
        int[][] result = new int[columnCount][rowCount];

        // flip rows and columns
        for (int i = 0; i < rowCount; ++i) {
            for (int j = 0; j < columnCount; ++j) {
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }

}
  public static void main(String[] args) throws IOException {

  // Methods 
  System.out.println(sumNumbers("7 11"));

  // FileIO

  System.out.println(vowelCount("C:\\Users\\Alex Young\\git\\grade-11-review-2---methods-and-testing-gavin-alex-1\\src\\gr11review\\part2\\yes.txt\\"));

  // Array - One Dimensional 1 Loop
  int [] nums = {1, 1 , 1 , 0, 0 , 0 , 2, 0 , 0 }; 
  zeroFront(nums);

  // Array - One Dimensional 2 Loop
    int [] outer = {1};
    int [] inner = {3, 4};
    System.out.println(linearIn(outer, inner));

    // Two Dimensional Arrays
    int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};    
    reverse(arr);


}
/**
* Given one string, find the sum of all characters that are listed as numbers (ex: '1'.'3')
*
* @param str  The first string
* @return int of the sum of all number characters in the string
*
*/
  public static int sumNumbers(String str){
  int sum = 0;
    
    for (int i = 0; i < str.length(); i++){
      // Checks to see if a character is a digit
      if (Character.isDigit(str.charAt(i))){
        // Runs another loop to finds where character digit ends
        for (int c = 1; i + c < str.length() ; c++){
          if (Character.isDigit(str.charAt(i + c)) == false){
            // Number is grouped and added 
            sum += Integer.parseInt(str.substring(i, i + c ));
            i += c;
            break;
          }
          // Checks to see if the number makes it to the end 
          else if (c + i == str.length()-1){
            // Number is grouped and added
            sum += Integer.parseInt(str.substring(i, str.length() ));
            i += c;

          }
         
            
          }
        }
      }
      return sum;
    }

/**
* Given a file, check each word per line and to see which word has the most vowels 
*
* @param filenametxt The file that will be looked at 
* @return Word with the most vowels 
*
*/

    public static String vowelCount(String filenametxt) throws IOException{
      
      int highestVowelCount = -1;
      int currentVowelCount = 0;
      String mostVowels = " ";
      String currentWord;
      
      BufferedReader reader = new BufferedReader(new FileReader(filenametxt));
      String line = reader.readLine();

      while (line != null){
        currentWord = line; 
        
        // Iterates through the characters in the word
        for (int i = 0; i < currentWord.length(); i++){
          // Checks to see if the character is a vowel
          if (currentWord.charAt(i) == 'a' || currentWord.charAt(i) == 'e' ||currentWord.charAt(i) == 'i'||currentWord.charAt(i) == 'o'|| currentWord.charAt(i) == 'u'){
            // Adds the amount of time a vowel appears
            currentVowelCount++;
          }
          
        }
        // Checks to see if the vowel count for the word is higher than the highest one 
        if (currentVowelCount > highestVowelCount){
         // Update variable to be the highest one 
          highestVowelCount = currentVowelCount;
         // Store the word with the most vowels in the variable
          mostVowels = currentWord;
      }
      currentVowelCount = 0;
      line = reader.readLine();
      }
      reader.close();
      return mostVowels;
    }

/**
* Given an int array, set all values of zero to the front of the array
*
* @param nums The integer array
* @return New array with zeroes at the front
*
*/
    public static int [] zeroFront(int[] nums){
        int update = 0;
    
        for (int i = 0; i < nums.length; i++){
          // Checks to see where in the array it equals zero
          if (nums[i] == 0 ){
            // Sets the value equal to the first int in the array
            nums[i] = nums[update];
            // Updates the first array to zero
            nums[update] = 0;
            // Variable will now increase by one to account for the other parts of the array
            update++;
          }
    
          
        }
        for (int c =0; c < nums.length; c++){
            System.out.print(nums[c]);
          }
        System.out.println("");

        return nums;
        
      }

  /**
* Given two arrays, check to see if the ints in the inner array are in the outer array
*
* @param outer  The first array
* @param inner  The second array
* @return true if ints in the inner array are in the outer array or false if they aren't
*/

      public static boolean linearIn(int[] outer, int[] inner){
        
        // Loops through the inner array
        for (int i = 0; i < inner.length; i++){
          // Loops through the outer array
          for (int j = 0; j < outer.length; j++){
            // Checks to see if the inner value is not the same as outer values 
            if (inner[i] != outer[j]){
              // Checks to see if it ran through all the values of the outer array
              if(j == outer.length- 1){
              return false;
              }
            }
            // Will break out of first loop if a outer and inner value equals the same 
              else if (inner[i] == outer[j]){
                break;
          }
        }
        }
          return true;
      }
  /**
* Given a 2D array, reverse the order of the content within the array
*
* @param arr  The 2D array
* @return Reverse content in arr
*
*/

      public static int[][] reverse(int[][] arr){
        int [] [] arr2;
        int numberRow = arr.length;
        int numberCol = arr[0].length;
        arr2 = new int [arr.length][arr[0].length];
        
      
        for (int row = 0; row < arr.length; row++){
          numberRow --;
          numberCol = arr[0].length;
          for(int col = 0; col < arr[0].length; col ++){
            numberCol --;
            // Building a new 2D array by using values which are reversed from the first array
            arr2[row][col] = arr[numberRow][numberCol];
        
          }
        }
        for(int a = 0; a < arr2.length; a++){
          for (int b = 0; b < arr2[0].length; b++){
            System.out.print(arr2[a][b]);
          }
          System.out.println(" ");
        }

        return arr2;
       
      
        
      }