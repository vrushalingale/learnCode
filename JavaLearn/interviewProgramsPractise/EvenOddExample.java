package interviewProgramsPractise;

import java.io.FileInputStream;
import java.util.Scanner;

public class EvenOddExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Enter number to chec Even Odd:");
		a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}

	}

}
