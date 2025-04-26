package Interface;

public class Customer implements BankInterface {

	public String ch;
	
	@Override
	public void seebalance() 
	{
	 System.out.println("Balance is 12390987");
		
	}

	@Override
	public String customerDetail(String naam) 
	{
		System.out.println(naam);
		
		naam = ch;
		System.out.println(ch);
		return ch;
	}

}
