package MethodOverriding;

class B extends A {

	void m1()
	{
		System.out.println("B m1");
	}


public static void main(String[] args) 
{
	A a =new A();
	a.m1();
	
	B b =new B();
	b.m1();
	
	A a1 =new B();
	a1.m1();
	
	//B b1 =new A();
}
}
