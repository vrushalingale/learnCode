package InputOuputStream;

import java.io.FileInputStream;

//to read from file

public class fileInputstream 
{
	public static void main(String args[])
	{  
		  try
		  {  
		    FileInputStream fin=new FileInputStream("D:\\abc.txt");  
		    int i=0;  
		    while((i=fin.read())!=-1)
		    {  
		     System.out.print((char)i);  
		    }  
		    fin.close();  
		  }catch(Exception e)
		  {
			  System.out.println(e);
		  }  
	}  

}
