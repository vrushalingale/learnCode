package HelloWorld;

public class staticExample 
{
	static int count=0;//will get memory only once and retain its value  
	  
	staticExample()
	{  
		count++;  
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		staticExample c1=new staticExample();  
		staticExample c2=new staticExample();  
		staticExample c3=new staticExample(); 
	
	}

}
