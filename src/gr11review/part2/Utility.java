package gr11review.part2;

public class Utility {

  public static void main(String[] args) {

  System.out.println(sumNumbers("7 11"));

  int [] nums = {1, 1 , 1 , 0, 0 , 0 , 2, 0 , 0 }; 
  zeroFront(nums);

    int [] outer = {1, 2, 3, 4, 5};
    int [] inner = {3, 4, 5};
    System.out.println(linearIn(outer, inner));

    int [][] arr;
    arr = new int [3][3];
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[0][2] = 3;
    arr[1][0] = 4;
    arr[1][1] = 5;
    arr[1][2] = 6;
    arr[2][0] = 7;
    arr[2][1] = 8;
    arr[2][2] = 9;
    
    reverse(arr);


}
  public static int sumNumbers(String str){
  int sum = 0;
    
    for (int i = 0; i < str.length(); i++){
      if (Character.isDigit(str.charAt(i))){
        for (int c = 1; i + c < str.length() ; c++){
          if (Character.isDigit(str.charAt(i + c)) == false){
            sum += Integer.parseInt(str.substring(i, i + c ));
            i += c;
            break;
          }
          else if (c + i == str.length()-1){
            sum += Integer.parseInt(str.substring(i, str.length() ));
            i += c;

          }
         
            
          }
        }
      }
      return sum;
    }

    public static void zeroFront(int[] nums){
        int update = 0;
    
        for (int i = 0; i < nums.length; i++){
          if (nums[i] == 0 ){
            nums[i] = nums[update];
            nums[update] = 0;
            update++;
          }
    
          
        }
        for (int c =0; c < nums.length; c++){
            System.out.print(nums[c]);
          }
        System.out.println("");
        
      }

      public static boolean linearIn(int[] outer, int[] inner){
        for (int i = 0; i < inner.length; i++){
          for (int j = 0; j < outer.length; j++){
            if (inner[i] != outer[j]){
              if(j == outer.length- 1){
              return false;
              }
            }
              else if (inner[i] == outer[j]){
                break;
          }
        }
        }
          return true;
      }
      
      public static void reverse(int[][] arr){
        int [] [] arr2;
        int numberRow = arr.length;
        int numberCol = arr[0].length;
        arr2 = new int [arr.length][arr[0].length];
        
      
        for (int row = 0; row < arr.length; row++){
          numberRow --;
          numberCol = arr[0].length;
          for(int col = 0; col < arr[0].length; col ++){
            numberCol --;
            arr2[row][col] = arr[numberRow][numberCol];
        
          }
        }
        for(int a = 0; a < arr2.length; a++){
          for (int b = 0; b < arr2[0].length; b++){
            System.out.print(arr2[a][b]);
          }
          System.out.println(" ");
        }

       
      
        
      }
      
   


  
}