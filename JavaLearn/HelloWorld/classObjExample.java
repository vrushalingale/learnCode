package HelloWorld;

//Object and classes

public class classObjExample 
{
	int rollno;  
	 String name;  
	  
	 void insertRecord(int r, String n)
	 {  //method  
	  rollno=r;  
	  name=n;  
	 }  
	  
	 void displayInformation()
	 {
		 System.out.println(rollno+" "+name);
	 }//method  
	  
	 public static void main(String args[])
	 {  
		 
		 classObjExample s1=new classObjExample();  
		 classObjExample s2=new classObjExample();  
	  
	  s1.insertRecord(111,"Karan");  
	  s2.insertRecord(222,"Aryan");  
	  
	  s1.displayInformation();  
	  s2.displayInformation();  
	  
	 }  

}
