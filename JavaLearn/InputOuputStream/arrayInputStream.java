package InputOuputStream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class arrayInputStream 
{
	 public static void main(String args[])throws Exception
	 {  
		   FileInputStream fin1=new FileInputStream("D:\\f1.txt");  
		   FileInputStream fin2=new FileInputStream("D:\\f2.txt");  
		  
		   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
		   int i;  
		   while((i=sis.read())!=-1)
		   {  
		    System.out.print((char)i);
		   }  
		   sis.close();  
		   fin1.close(); 
		   fin2.close();  
	 }  

}
