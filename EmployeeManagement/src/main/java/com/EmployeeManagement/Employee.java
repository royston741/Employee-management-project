/*
 	Q. WAP to create Employee management using collections 
	Perform operations:
	1.Add an employee
	2. Delete an employee
	3. Find an employee"
	4. Display
*/

package com.EmployeeManagement;

// Employee class
public class Employee {
	// employee properties
	private int empId;
	private String empName;
	private float empSalary;

	// no arguments constructor
	public Employee() {
		super();
	}

	// parameterized constructor
	public Employee(int empId, String empName, float empSalary) {
		super();
		// initialize properties
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	// -------- getter setter for empId --------
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	// -------- getter setter for empName --------
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	// -------- getter setter for empSalary --------
	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}
