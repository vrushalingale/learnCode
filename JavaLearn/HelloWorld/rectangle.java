package HelloWorld;

//Object and classes

public class rectangle 
{
	 int length;  
	 int width;  
	  
	 void insert(int l,int w){  
	  length=l;  
	  width=w;  
	 }  
	  
	 void calculateArea()
	 {
		 System.out.println(length*width);
	 }  
	  
	 public static void main(String args[])
	 {  
	  rectangle r1=new rectangle();  
	  rectangle r2=new rectangle();  
	  
	  r1.insert(11,5);  
	  r2.insert(3,15);  
	  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  

}
