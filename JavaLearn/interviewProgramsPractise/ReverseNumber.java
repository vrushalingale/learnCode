package interviewProgramsPractise;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 3456, temp;
		
		temp =num;

		int remainder, result=0; 
		
		
		
		while(num>0){
			remainder = num%10;
			result = result * 10 + remainder;
			num = num/10;
		}
		
		num = temp;
		System.out.println("Number :" + num);
		System.out.println("Reverse Num :" + result);
	}
}
