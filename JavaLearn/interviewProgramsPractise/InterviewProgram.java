package interviewProgramsPractise;

import java.io.FileInputStream;
import java.io.InputStream;

//import org.testng.annotations.Test;

public class InterviewProgram {

//	@Test
	public void testFactorial() {

		int n = 1;
		int fact = 1;

		for (int i = 5; i >= n; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of 5 is:" + fact);

	}

	//@Test
	public void testFibonacci() {
		int a = 0;
		int b = 1;
		int c = 0;

		int n = 10;

		System.out.print(" " + a + " " + b);

		for (int i = 1; i <= (n - 2); i++) {

			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

}
