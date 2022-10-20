/*
 	Q. WAP to create Employee management using collections 
	Perform operations:
	1.Add an employee
	2. Delete an employee
	3. Find an employee"
	4. Display
*/

package com.EmployeeManagement;

// imports
import java.util.ArrayList;
import java.util.Scanner;

// Create EmployeeServices class
public class EmployeeServices implements Requirements {
	// list of employees
	ArrayList<Employee> empList = new ArrayList<Employee>();
	// create scanner object
	Scanner sc = new Scanner(System.in);

	// Create employee method
	public void createEmp() {
		// try the following
		try {
			// Employee object
			Employee emp = new Employee();
			// input employee id
			System.out.println("Enter employee Id :");
			emp.setEmpId(sc.nextInt());
			// input employee name
			System.out.println("Enter employee Name :");
			emp.setEmpName(sc.next());
			// input employee salary
			System.out.println("Enter employee Salary :");
			emp.setEmpSalary(sc.nextFloat());

			// adding employee to empList
			empList.add(emp);
			System.out.println("--------- EMPLOYEE ADDED --------\n");
		}
		// if any exception
		catch (Exception e) {
			// print exception
			System.out.println(e);
		} // catch ends
	}

	// read employee
	public void readEmp() {
		// try following
		try {
			// input employee id
			System.out.println("Enter employee Id :");
			int empId = sc.nextInt();
			// if found
			boolean isFound = false;

			// traversing the empList
			for (Employee emp : empList) {
				// if required employee
				if (emp.getEmpId() == empId) {
					// print employee details
					System.out.println("\n--------- EMPLOYEE DETILS --------");
					System.out.println(emp);
					// set isFound to true
					isFound = true;
				}
			}

			// if not found
			if (!isFound) {
				System.out.println("No such Id\n");
			}
		}
		// if any exception
		catch (Exception e) {
			// print exception
			System.out.println(e);
		} // catch ends

	}

	// read all employee
	public void readAllEmp() {
		// print all employee details
		System.out.println("\n--------- LIST OF EMPLOYEES --------");
		empList.forEach(a -> {
			System.out.println(a);
		});
	}

	// update employee
	public void updateEmp() {
		// try following
		try {
			// input empId
			System.out.println("Enter employee Id :");
			int empId = sc.nextInt();
			// employee
			Employee empToUpdate = null;
			// if found
			boolean isFound = false;

			// traverse empList
			for (Employee emp : empList) {
				// if employee present
				if (emp.getEmpId() == empId) {
					// set wantToUpdate as true
					empToUpdate = emp;
					// set isFound true
					isFound = true;
				}
			} // for ends

			// if not found
			if (!isFound) {
				System.out.println("No such Id\n");
			}

			// if the empId is present
			if (empToUpdate != null) {
				System.out.println("------ CHOICE -----");
				System.out.println("1. UPDATE NAME");
				System.out.println("2. UPDATE SALARY");
				// choice
				System.out.println("Enter the choice :");
				int choice = sc.nextInt();
				// compare choices
				switch (choice) {
				// if update name
				case 1 -> {
					System.out.println("Enter employee name :");
					// set empName
					empToUpdate.setEmpName(sc.next());
					System.out.println("------ EMPLOYEE NAME UPDATED ------\n");
				}
				// if update salary
				case 2 -> {
					System.out.println("Enter employee salary :");
					// set empName
					empToUpdate.setEmpSalary(sc.nextInt());
					System.out.println("------ EMPLOYEE SALARY UPDATED ------\n");
				}
				// if no such choice
				default -> {
					System.out.println("No such option");
				}
				}// switch ends
			} // if ends
		}
		// if any exception
		catch (Exception e) {
			// print exception
			System.out.println(e);
		} // catch ends

	}

	// delete employee
	public void delEmp() {
		// input employee id
		System.out.println("Enter employee Id :");
		int empId = sc.nextInt();
		// if found
		boolean isFound = false;
		// try the following
		try {
			// store the employee to be deleted
			Employee delEmp = null;
			// traversing the empList
			for (Employee emp : empList) {
				// if required employee
				if (emp.getEmpId() == empId) {
					// initialize the empList
					delEmp = emp;
					isFound = true;
				}
			} // for ends

			// check if the employee present
			if (isFound) {
				// remove the employee
				empList.remove(delEmp);
				System.out.println("--------- EMPLOYEE DELETED --------\n");
			} else {
				System.out.println("No such Id\n");
			}
		} // try ends
			// if any exception
		catch (Exception e) {
			// print exception
			System.out.println(e);
		} // catch ends

	}

}
