package InputOuputStream;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class dataReadWrite 
{
	public static void main(String[] args) throws Exception
	{
		try 
		{
			FileInputStream fin1 = new FileInputStream("D:\\f1.txt");
			FileInputStream fin2 = new FileInputStream("D:\\f2.txt");
			
			FileOutputStream fout1 = new FileOutputStream("D:\\abc.txt");
			
			SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
			   
			int i;  
			   while((i=sis.read())!=-1)  
			   {  
			     fout1.write(i);      
			   }  
			   sis.close();  
			   fout1.close();    
			   fin1.close();    
			   fin2.close();
			   System.out.println("Success");
						
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
