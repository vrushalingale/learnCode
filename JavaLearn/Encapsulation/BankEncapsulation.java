package Encapsulation;

public class BankEncapsulation {
private int balance;
	
	
	public void setfund (int bal)
	{
		balance = bal;
				
	}
	
	
	public int getfund ()
	{
		if (balance <1000)
		{
			System.out.println("your balance is less than 1000");
		}
		
		if (balance <0)
		{
			System.out.println("negative value is not allowed");
		}
	return balance;

	}
}




/*
 The whole idea behind encapsulation is to hide the implementation details from users. 
 If a data member is private it means it can only be accessed within the same class. 
 No outside class can access private data member (variable) of other class.
  However if we setup public getter and setter methods to update 
  (for e.g. void setfund (int bal))and read (for e.g.  int getfund) the private data fields 
  then the outside class can access those private data fields via public methods. 
  This way data can only be accessed by public methods thus making the private fields
   and their implementation hidden for outside classes. 
   That’s why encapsulation is known as data hiding. 
 
 */