package Mathematics.JavaCodesLearn;

/*
Number read from Right To Left or Left To Right matches same its Palindrom.

 * Input : 2112
 * Output: True, It's Palindrom
 * 
 * Input : 2
 * Output: True, It's Palindrom
 * 
 * Input : 2122
 * Output: False, It's Not Palindrom
 * 
*/

public class PalindromNumber {
    public boolean checkPalindromNumber(int originalNumber){
        int reverseNum=0;
        int temp = originalNumber;
        while(temp!=0){
            int lastDigit = temp % 10;
            reverseNum =  reverseNum*10+lastDigit;
            temp = temp/10;
        }
        
        return(reverseNum==originalNumber);
        
    }

    public static void main(String[] args) {
        PalindromNumber p = new PalindromNumber();
        System.out.println("Number Palindrom is : "+p.checkPalindromNumber(73437));
        //System.out.println("Number Palindrom is : "+p.checkPalindromNumber(341));
    }
    
}
