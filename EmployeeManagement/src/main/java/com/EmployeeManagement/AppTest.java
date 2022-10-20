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
import java.util.Scanner;

// EmployeeTest class
public class AppTest {

	// print menu method
	public static void printMenu() {
		System.out.println("------- MENU ---------");
		System.out.println("1. ADD EMPLOYEE");
		System.out.println("2. DISPLAY EMPLOYEE");
		System.out.println("3. DISPLAY ALL EMPLOYEE");
		System.out.println("4. UPDATE EMPLOYEE");
		System.out.println("5. DELETE EMPLOYEE");
		System.out.println("6. EXIT");
	}

	// calling main method
	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		// EmployeeServices object
		EmployeeServices services = new EmployeeServices();

		// want to perform operations
		boolean performOperations = true;

		// while you want to perform operations
		while (performOperations) {
			try {
				// call printMenu functions
				printMenu();
				// choose operations
				System.out.println("Select operations :");
				int choice = sc.nextInt();
				// try the following
				// compare with cases
				switch (choice) {
				// if create employee
				case 1 -> services.createEmp();
				// if read employee
				case 2 -> services.readEmp();
				// if read all employee
				case 3 -> services.readAllEmp();
				// if update employee
				case 4 -> services.updateEmp();
				// if delete employee
				case 5 -> services.delEmp();
				// if exit
				case 6 -> {
					// set performOperations to false
					performOperations = false;
					System.out.println("\n------- EXITED FROM THE PROGRAM ------");
				}
				// if no such choice
				default -> {
					System.out.println("No such option");
				}
				}// switch ends
			}
			// if exception
			catch (Exception e) {
				// print exception
				System.out.println(e);
				break;
			}
		} // while ends

	} // main ends

} // class ends
