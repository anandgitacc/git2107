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
	
	public static void main(String[]  args) {
		
		// object
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
		e.empMobile();
		
	}
	

}
