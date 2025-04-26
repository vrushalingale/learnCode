package AbstractClass;

abstract class Bank
{    
	abstract int getRateOfInterest();    
}    
   
	class SBI extends Bank
	{    
		int getRateOfInterest()
		{
			return 7;
		}    
	}   
	
	class PNB extends Bank
	{    
		int getRateOfInterest()
		{
			return 8;
		}    
	}    
   
class TestBank
{    
	public static void main(String args[])
	{    
		Bank b=new SBI();//object is SBI, method of SBI will be invoked
				
		int interestSBI=b.getRateOfInterest();    
		System.out.println("Rate of Interest is: "+interestSBI+" %");
		
		Bank b1=new PNB();//object is PNB, method of PNB will be invoked
		
		int interestPNB=b1.getRateOfInterest();
		System.out.println("Rate of Interest is: "+interestPNB+" %");
	}
}

