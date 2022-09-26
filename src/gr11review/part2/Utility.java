package gr11review.part2;

import java.io.*;

public class Utility {
    public static void main(String[] args) {
        xyBalance("yaaxbb");
        longestWord("Review2_3Test_1.txt");
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

    public static String longestWord(String filenametxt){
        String strLargest = "";
        String strCurrent;
        BufferedReader read = new BufferedReader(new FileReader(filenametxt));
        String line;
        while ((line = read.readLine()) != null){
            strCurrent = line;
            if (strCurrent.length() > strLargest.length()){
                strLargest = strCurrent;

            }
        }
        return strLargest;

    }
}

