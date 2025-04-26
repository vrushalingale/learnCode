package Mathematics.JavaCodesLearn;

public class AddingZeroinReverseNumber {
    public void addZeroInNumberWhileRever(int numToChekPalindrom){
        int reverseNum=0;
        int temp = numToChekPalindrom;
        while(temp!=0){
            int lastDigit = temp % 10;
            reverseNum =  reverseNum*100+lastDigit;
            temp = temp/10;
        }
        
        System.out.println(reverseNum);
    }

    public static void main(String[] args) {
        AddingZeroinReverseNumber a = new AddingZeroinReverseNumber();
        a.addZeroInNumberWhileRever(777);
    }
}
