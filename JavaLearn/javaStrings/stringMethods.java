package javaStrings;

public class stringMethods 
{

	public static void main(String[] args) 
	{
		String s1= "Vrushal";
		System.out.println(s1);
		
		//creating java string by new keyword
				String s2=new String("Vrushal");
				System.out.println(s2);
		
		//chatAt
		char ch=s1.charAt(2);
		System.out.println("CharAt:\t"+ch);
		
		//compareTo
		System.out.println("Compare to:\t"+s1.compareTo(s2));
		
		//concat
		s1.concat("\tIngale");
		System.out.println("Before Concat:\t"+s1);
		
		s1=s1.concat("\tIngale");  
		
		System.out.println("After concat:\t"+s1);
		
		//contains
		System.out.println("Contains:\t"+s1.contains("u"));
		
		//ends with
		System.out.println("Ends with:\t"+s1.endsWith("l"));
		
		//equals
		System.out.println("String Equals:\t"+s1.equals(s2));
		
		//equalsIgnoreCase
		System.out.println("EqualsIgnoreCase:\t"+s1.equalsIgnoreCase(s2));
		
		//toUpperCase
		String s3="shreyas";
		String s3Up=s3.toUpperCase();
		System.out.println("to Uppercase:\t"+s3Up);
		
		//toLowercase
		String s3Low =s3.toLowerCase();
		System.out.println("to LowerCase:\t"+s3Low);
		
	}

}
