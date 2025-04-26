package InputOuputStream;

import java.io.FileOutputStream;

//to write into file

public class fileOutputStream 
{

	public static void main(String[] args) 
	{
		try{  
		     FileOutputStream fout=new FileOutputStream("D:\\abc.txt");  
		     String s="Sachin Tendulkar is my favourite player";  
		     
		     byte b[]=s.getBytes();//converting string into byte array  
		     fout.write(b);  
		     fout.close();  
		     
		     System.out.println("success...");  
		    }
		catch(Exception e)
			{
		    	System.out.println(e);
		    }  

	}

}
