package gr11review.part2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


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

    public static String alphaWord(String filenametxt) throws IOException {
        ArrayList<String> str = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filenametxt));
        String word = reader.readLine();

        while (word != null) {
            str.add(word);
        }
        reader.close();
        Collections.sort(str);
        
        String alpha = str.get(0);

        return alpha;
    }

    public static int[] notAlone(int[] nums, int value) {
        for (int i = 1; i < nums.length - 1; i++) {
            if(nums[i] == value && nums[i - 1] != nums[i] && nums[i] != nums[i + 1]) {

                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public static int[] seriesUp(int n) {

        int[] newArray = new int[n * (n + 1) / 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                newArray[i++] = j; 
            }
            
        }
        return newArray;
    }
}