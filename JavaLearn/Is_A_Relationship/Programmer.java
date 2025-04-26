package Is_A_Relationship;

public class Programmer extends Employee
{
float bonus;
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Programmer(int id, String name, float sal, float bonus) {
		super(id, name, sal);	// Super calls parameterized constructor of parent
		this.bonus=bonus;
		super.calSal();
		System.out.println("Above salary method is called from Parent class using SUPER");
		System.out.println("");
		// TODO Auto-generated constructor stub
	}
	/*public void disp(){
		System.out.println("Below salary method is called from Child class");
		System.out.println("Id     = "+ id);
		System.out.println("Name   = "+ name);
		System.out.println("Salary = "+ sal);
		System.out.println("Bonus  = "+ bonus);
	}*/
	
	@Override
	public String toString() {
		return "Programmer [bonus=" + bonus + ", id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}								//======================================== Source- Generate to String method
	
	
	
	public void calSal(){
		System.out.println("Salary is = "+(sal+bonus));
	}
		

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p1=new Programmer(1, "Kedar", 10000, 500);
		Programmer p2=new Programmer(2, "edar", 2000, 50);
		System.out.println(p1);
		//p1.disp();
		p1.calSal();
		
	}
	
}
