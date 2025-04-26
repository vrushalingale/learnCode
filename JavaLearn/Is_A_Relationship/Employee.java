package Is_A_Relationship;

public class Employee 
{
	// Putting FINAL at start makes it not extendable

		int id;
		String name;
		float sal;
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(int id, String name, float sal) {
			this.id = id;
			this.name = name;
			this.sal = sal;
		}
		
		public void calSal() // "FINAL public void calSal()" you can not override it. But you can overload it	
		{
			System.out.println("Salary is = "+sal);
		}
		//"FINAL" int i makes constants and u can not modify value
	
}
