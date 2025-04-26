package typeCasting;

public class Example {

	public static void main(String[] args) {
		byte num1, num2;
		short  sum;

		num1=125;
		num2=50;

		sum=(short) (num1+num2);	//down Type casting

		System.out.println("Sum of 2 byte number after Type casting is: " + sum);
		
	}

}
