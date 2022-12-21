package com.project.features;

import java.util.Scanner;

import com.project.main.employee.EmployeeUseCases;
import com.project.model.Employee;
import com.project.usecases.UpdateEmployee;



public class Options {
	
	public static final String YELLOW_BOLD = "\033[1;33m";
	public static final String CYAN_BOLD = "\033[1;36m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void adminPanel() {
		System.out.println();
		System.out.println();
		System.out.println(YELLOW_BOLD+"------------welcome to admin panel------------"+ANSI_RESET);
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println();

			System.out.println("----------------------------------------------");
			try {
			Thread.sleep(50);
			System.out.println(CYAN_BOLD+"            ╔═══════════════════╗");
			Thread.sleep(50);
			System.out.println("                Choose option");
			Thread.sleep(50);
			System.out.println("            ╚═══════════════════╝");
			Thread.sleep(50);
			System.out.println("1.  Add Department          2. View All Department");
			Thread.sleep(50);
			System.out.println("3.  Update Department       4. Add New Employee");
			Thread.sleep(50);
			System.out.println("5.  View All Employee       6. View Leave Request");
			Thread.sleep(50);
			System.out.println("7.  View Employee by ID     8. Update Employee");
			Thread.sleep(50);
			System.out.println("9.  Transfer Employee to other Department");
			Thread.sleep(50);
			System.out.println("10. Employee By Department");
			Thread.sleep(50);
			System.out.println("11. Exit"+ANSI_RESET);
			Thread.sleep(50);
			System.out.println("----------------------------------------------");
			} catch (InterruptedException e) {}
			
			int opt = sc.nextInt();
			
	

		}
		
	}
	
	
	
public static void employeePanel(Employee employee) {
		
		System.out.println();
		System.out.println();
		System.out.println(YELLOW_BOLD+"WELCOME "+employee.getFirstName()+" "+employee.getLastName()+ANSI_RESET);
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("----------------------------------------------");
			try {
			Thread.sleep(50);
			System.out.println(CYAN_BOLD+"            ╔═══════════════════╗");
			Thread.sleep(50);
			System.out.println("                Choose option");
			Thread.sleep(50);
			System.out.println("            ╚═══════════════════╝");
			Thread.sleep(50);
			System.out.println("1. View Profile      2. Update Profile");
			Thread.sleep(50);
			System.out.println("3. Change Password   4. Apply for Leave");
			Thread.sleep(50);
			System.out.println("5. Exit"+ANSI_RESET);
			Thread.sleep(50);
			System.out.println("----------------------------------------------");
			} catch (InterruptedException e) {}
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				EmployeeUseCases.printSingleEmployee(employee);
				break;
			case 2:
				UpdateEmployee.main(employee.getId());
				break;
			
			case 3:
				extraFeature.thank();
				return;
				default:
					System.out.println("Wrong Input");
			}
			
		}
		
		
	}
	
	
	
	
	

}
