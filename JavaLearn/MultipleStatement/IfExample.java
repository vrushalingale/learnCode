package MultipleStatement;

public class IfExample {
	
	public static void SimpleIf()
	{
		 int age=20;  
		    if(age>18)
		    {  
		        System.out.println("Age is greater than 18");
		    }
	}
	
	public static void IfElseStatement()
	{
		int num =13;
		if(num/2==0)
		{
			System.out.println("The number is Even");
		}
		else
		{
			System.out.println("The Number is Odd");
		}
	}
	
	public static void ElseIfLadderCase()
	{
		int marks=65;
		if(marks <=45)
		{
			System.out.println("Grade D");
		}
		else if(marks >=55 && marks <60)
		{
			System.out.println("Grade C");
		}
		else if(marks >=60 && marks <70)
		{
			System.out.println("Grade B");
		}
		else if(marks > 70)
		{
			System.out.println("Grade A");
		}
	}
	
	public static void SwitchCaseExample()
	{
		int number=20;  
	    switch(number)
	    {  
	    case 10: System.out.println("10");
	    break;  
	    
	    case 20: System.out.println("20");
	    break;  
	    
	    case 30: System.out.println("30");
	    break;  
	    
	    default:System.out.println("Not in 10, 20 or 30");  
	    }
	}
	
	public static void forLoopExample()
	{
		System.out.println("\n for Loop");
		for(int i=0; i<=10;i++)
		{
			System.out.println(i);
		}
	}

	public static void foreachExample()
	{
		System.out.println("\n for each");

		int arr[]={12,23,44,56,78};  
	    for(int i:arr)
	    {  
	        System.out.println(i);
	    }
	    
	    /*The for-each loop is used to traverse array or collection in java. 
		It is easier to use than simple for loop because we don't need to increment value 
		and use subscript notation.
		It works on elements basis not index. 
		It returns element one by one in the defined variable.
			Syntax:
		for(Type var:array){  
		//code to be executed  
		}  */
	}
	
	public static void LabeledForExample()
	{
		System.out.println("\n Labeled For Loop");
		aa:  
	        for(int i=1;i<=3;i++)
	        {  
	            bb:  
	                for(int j=1;j<=3;j++)
	                {  
	                    if(i==2&&j==2)
	                    {  
	                        break aa;  
	                    }  
	                    System.out.println(i+" "+j);  
	                }  
	        }
	
	/*We can have name of each for loop. To do so, we use label before the for loop. 
	 It is useful if we have nested for loop so that we can break/continue specific for loop.
	 Normally, break and continue keywords breaks/continues the inner most for loop only.
		Syntax:
	labelname:  
	for(initialization;condition;incr/decr)
	{  
	//code to be executed  
	} 
	*/
	}
	
	public static void whileLoopExample()
	{
		System.out.println("\n While Loop");

		int i=1;  
	    while(i<=10){  
	        System.out.println(i);  
	    i++;  
	    }  
		
	/*The Java while loop is used to iterate a part of the program several times. 
	  If the number of iteration is not fixed, it is recommended to use while loop.
		Syntax:
	while(condition)
	{  
	//code to be executed  
	} 
	*/
	}
	
	
	public static void doWhileExample()
	{
		System.out.println("\n Do While");
		int i=0;
		do 
		{
			System.out.println(i);
			i++;
		}
		while(i<=10);	
			
	/*Java do-while Loop
	The Java do-while loop is used to iterate a part of the program several times. 
	If the number of iteration is not fixed and you must have to execute the loop at 
	least once,	it is recommended to use while loop.
	It is executed at least once because condition is checked after loop body.
		Syntax:
	do
	{  
	//code to be executed  
	}while(condition);
	*/
	}
	
	public static void breakstatement()
	{
		System.out.println("\n break statement");
		for(int i=0;i<10;i++)
		{
			//System.out.println(i);
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
	
	/*The Java break is used to break loop or switch statement. 
	 It breaks the current flow of the program at specified condition. 
	 In case of inner loop, it breaks only inner loop.
		Syntax:
	jump-statement;    
	break;
	*/
	}
	
	public static void innerbreak()
	{
		System.out.println("\n Inner Break");
		for(int i=1;i<=3;i++)
		{
			for(int j=1; j<3;j++)
			{
				if(j==2)
				{
					break;
				}
				System.out.println("i"+i+ " " +"j" + j);
			}
			
		}
	
	/*It breaks inner loop only if you use break statement inside the inner loop*/
	}
	
	public static void continueStatement()
	{
		System.out.println("\n Continue Statement");
		 
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	
	/*The Java continue statement is used to continue loop. 
	 It continues the current flow of the program and skips the remaining code at 
	 specified condition. In case of inner loop, it continues only inner loop.
		Syntax:
	jump-statement;    
	continue;
	*/
	}
		
	public static void continueInner()
	{
		System.out.println("\n Continue INNER Statement");
		
		for(int i=1; i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
				{
					continue;
				}
				System.out.println("i"+i +" "+ "j"+j);
			}
		}
	
	/*It continues inner loop only if you use continue statement inside the inner loop*/
	}
	
	
	public static void main(String[] args) 
	{
		SimpleIf();
		IfElseStatement();
		ElseIfLadderCase();
		
		SwitchCaseExample();
		
		forLoopExample();
		foreachExample();
		LabeledForExample();
		
		whileLoopExample();
		doWhileExample();
		
		breakstatement();
		innerbreak();
		
		continueStatement();
		continueInner();
	}
}
