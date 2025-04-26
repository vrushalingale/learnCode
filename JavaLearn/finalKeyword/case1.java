package finalKeyword;

public class case1 
{
	final int speedlimit=90;//final variable  
	 void run()
	 {  
		 //Uncomment it and check the error
	  //speedlimit=400;  
	 }  
	 
	 public static void main(String args[])
	 {  
		 case1 obj=new  case1();  
		 obj.run();  
	 }  

}

/*There is a final variable speedlimit, we are going to change the value of this variable, 
 * but It can't be changed because final variable once assigned a value can never be changed.*/


/*The final keyword in java is used to restrict the user. The java final keyword can be used in many context. 
* Final can be:
1.variable
2.method
3.class

The final keyword can be applied with the variables, a final variable that have no value it is called blank final 
variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable
can be static also which will be initialized in the static block only. We will have detailed learning of these.
Let's first learn the basics of final keyword.

1) Java final variable
If you make any variable as final, you cannot change the value of final variable(It will be constant).*/