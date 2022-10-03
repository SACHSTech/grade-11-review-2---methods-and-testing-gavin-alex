package gr11review.part2;
import java.io.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Utility {

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
* @author A. Young
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
* @author A. Young
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
* @author A.Young
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
* @author A. Young
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
* @author A.Young
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
    }