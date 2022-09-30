package gr11review.part2;

import java.io.*;

public class Utility {


    public static void main(String[] args)throws IOException {

        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    
    }


    public static boolean xyzMiddle(String str) {
        int middle = str.length()/2 - 1;

        // check right of middle
        if (str.length() >= 3 && (str.substring(middle, middle + 3).equals("xyz"))) {
            return true;
        }
        
        // check left of middle
        if (str.length() % 2 == 0 && str.substring(middle - 1, middle + 2).equals("xyz")) {
            return true;
         }

        // return false if xyz is not found in the middle of the string
        return false;
    }


}