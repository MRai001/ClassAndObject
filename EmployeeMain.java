package day8;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		
		employee1.eid = 101;
		employee1.ename = "John";
		employee1.job= "Manager";
		employee1.sal=70000;
		
		employee1.display();
		
		Employee employee2= new Employee (); 
		employee2.eid = 102;
		employee2.ename = "Ralph";
		employee2.job= "Senior VP";
		employee2.sal=100000;
		
		employee2.display();
		
	}

}
