package Mathematics.JavaCodesLearn;
/*
 * Problem Statement: Count Number of Digits for Input number value.
 *      Input : 77897
 *      Output: 5
 * 
 *      Input : 77
 *      Output: 2
 *      
 *      Input : 7
 *      Output: 1
 * 
*/
public class CountDigits{

    public static int countNumbeOfDigitsforNumber(int num){
        int countOfNum = 0;
        while(num>0){
            
            num = num / 10;
            countOfNum++;
        }
        return countOfNum;
    }
  
   public static void main(String args[]){
      System.out.println(countNumbeOfDigitsforNumber(7777777));
   }
}