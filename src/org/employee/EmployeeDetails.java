package org.employee;

public class EmployeeDetails {
	
	// private -> access specifier
	// void    -> return type of given method
	// empName -> method name
	// ()      -> arguments place / input or parameter place
	// {}      -> block or body of the method
	private void empName() {
		// implementation detail / business logic
		// "" - double quote - String (predefined class)
		System.out.println("Employee name: Anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	private void empLocation() {
		System.out.println("location: OMR");
	}
	private void empId() {
		System.out.println("Employee id: 1122");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> 46b285c13b6e3a3f2c2f5a9da209c9906f8a6e12
	
	public static void main(String[]  args) {
		
		// object
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
		e.empMobile();
		
	}
	

}
