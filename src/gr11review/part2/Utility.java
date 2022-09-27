package gr11review.part2;

import java.io.*;

public class Utility {
    public static void main(String[] args) {
        xyBalance("yaaxbb");
        //longestWord("Review2_3Test_1.txt");
        int [] array = {10,10,10};
        withoutTen(array);
        int [] arrayTwo = {10, 10, 10};
        canBalance(arrayTwo);
        int [][] arrayThree = {{1,2,3},{4,5,6},{7,8,9}};
        split(arrayThree, 1, 1);

    }


    public static boolean xyBalance(String str) {

        int intX = 0;
        int intY = 0;

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
        System.out.println("False");
        return false;
        
    }
    /* 
    public static String longestWord(String filenametxt){
        String strLargest = "";
        String strCurrent;
        BufferedReader read = new BufferedReader(new FileReader(filenametxt));
        String line;
        while ((line = read.FileReader()) != null){
            strCurrent = line;
            if (strCurrent.length() > strLargest.length()){
                strLargest = strCurrent;
            }
        }
        return strLargest;
    }
    */
  
    public static int[] withoutTen(int[] nums) {
        int intArrayCounter = 0;
        int newArr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != 10){
                newArr[intArrayCounter] = nums[i];
                intArrayCounter++;
            }
            System.out.println(newArr[i]);
        }
        return newArr;
    }
   

    public static boolean canBalance(int[] nums) {
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

    public static int[][] split(int[][] arr, int row, int col){
        int [][] newArray = new int[row+1][col+1];
        for (int i = 0; i <= row; i++){
            for (int x = 0; x <= col; x++){
                newArray[i][x] = arr[i][x];
                System.out.println(newArray[i][x]);
            }
        }
        return newArray;
        
    }

    

}

