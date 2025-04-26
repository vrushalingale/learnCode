package superKeyword;

class Bike extends Vehicle
{  
	  int speed=100;  
	
	  Bike()
	  {  
		   super();//will invoke parent class constructor  
		   System.out.println("Bike is created");  
	  }
	  
	  Bike(int speed)
	  {
  //example of super keyword where super() is provided by the compiler implicitly.
		    this.speed=speed;  
		    System.out.println(speed);  
	  }  
	  
	  void message()
	  {
				System.out.println("Child class method");
	  }  
		
	  void display1()
	  {  
	   System.out.println(speed);//will print speed of Bike   
	  }  
	  
	  void display2()
	  {  
		   System.out.println(super.speed);//will print speed of Vehicle now  
	  }
	  
	  void display3()
	  {  
		  message();//will invoke current class message() method  
		  super.message();//will invoke parent class message() method  
	  }  
	  
	  
	  
	public static void main(String args[])
	{  
	   Bike b=new Bike();
	   Bike b1=new Bike(10); 
	   b.display1(); 
	   b.display2();
	   b.display3();
	}  

}
