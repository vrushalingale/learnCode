/**
 *
 */
package collectionAssignment;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ashish.Bele
 *
 */
public class EmployeeDemo {

	Map<Integer, Employee> employeeMap =new HashMap<Integer, Employee>();

	public static void main(String [] args) {

		EmployeeDemo employeeDemo = new EmployeeDemo();
		employeeDemo.addEmployee();

		try{
			employeeDemo.findEmployee(78);
			employeeDemo.findEmployee(23);
		}catch(EmployeeNotFoundException e){
			System.out.println("Employee is not preset in system");
		}
	}

	void addEmployee(){

		Employee employee1 = new Employee();
		employee1.setEmpId(10);
		employee1.setSalary(1000);
		employee1.setName("Ashish");

		Employee employee2 = new Employee();
		employee2.setEmpId(78);
		employee2.setSalary(9000);
		employee2.setName("Vikas");

		Employee employee3 = new Employee();
		employee3.setEmpId(96);
		employee3.setSalary(12000);
		employee3.setName("Rahul");

		Employee employee4 = new Employee();
		employee4.setEmpId(46);
		employee4.setSalary(5634);
		employee4.setName("Vrushal");

		Employee employee5 = new Employee();
		employee5.setEmpId(89);
		employee5.setSalary(23541);
		employee5.setName("Kunal");


		employeeMap.put(10, employee1);
		employeeMap.put(78, employee2);
		employeeMap.put(96, employee3);
		employeeMap.put(46, employee4);
		employeeMap.put(89, employee5);
	}

	void findEmployee(int empId) throws EmployeeNotFoundException {

		if(!employeeMap.containsKey(empId)){
			throw new EmployeeNotFoundException("Employee with Id "+empId+" is not preset in system");
		}else{
			System.out.println("Test");
		}



	}

}
