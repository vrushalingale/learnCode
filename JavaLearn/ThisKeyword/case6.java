package ThisKeyword;

//The this keyword can be passed as argument in the constructor call.
//We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes. 

public class case6 
{
	A4 obj;  
	case6(A4 obj)
	{  
	    this.obj=obj;  
	}  
	
	void display()
	  {  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  
	}  
	  
	class A4
	{  
	  int data=10;  
	  
	  A4()
	  {  
		  case6 b=new case6(this);  
		  b.display();  
	  }  
	  
	  public static void main(String args[])
	  {  
	   A4 a=new A4();  
	  }  
	

}
