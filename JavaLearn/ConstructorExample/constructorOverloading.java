package ConstructorExample;

public class constructorOverloading 
{
	int id;  
    String name;  
    int age;  
    constructorOverloading(int i,String n)
    {  
    id = i;  
    name = n;  
    }  
    
    constructorOverloading(int i,String n,int a)
    {  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display()
    {
    	System.out.println(id+" "+name+" "+age);
    }  

	public static void main(String[] args) 
	{
		constructorOverloading c =new constructorOverloading(7,"vrick");
		c.display();
		
		constructorOverloading c1 = new constructorOverloading(7,"vrick",24);		
		c1.display();
	}

}
