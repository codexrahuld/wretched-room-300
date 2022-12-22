package com.project.features;

import java.util.Scanner;

import com.project.main.employee.EmployeeUseCases;
import com.project.model.Employee;
import com.project.usecases.EmployeeByDepartment;
import com.project.usecases.GetAllDepartment;
import com.project.usecases.RegisterDepartment;
import com.project.usecases.RegisterEmployee;
import com.project.usecases.UpdateDepartment;
import com.project.usecases.UpdateEmployee;
import com.project.usecases.ViewAllEmployee;
import com.project.usecases.ViewEmployeeDetail;
import com.project.usecases.transferEmployee;



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
			
			int ch = sc.nextInt();
			
	

			switch(ch) {
			case 1:
				RegisterDepartment.main(null);
				break;
			case 2:
				GetAllDepartment.main(null);
				break;
			case 3:
				UpdateDepartment.main(null);
				break;
			case 4:
				RegisterEmployee.main(null);
				break;
			case 5:
				ViewAllEmployee.main(null);
				break;
			case 6:
//				pendingLeave.main(null);
				break;
			case 7:
				System.out.println("Enter ID of Employee");
				int id=sc.nextInt();
				ViewEmployeeDetail.main(id);
				break;
			case 8:
				System.out.println("Enter ID of Employee");
				int id1=sc.nextInt();
				UpdateEmployee.main(id1);
				break;
			case 9:
				transferEmployee.main(null);
				break;
			case 10:
				EmployeeByDepartment.main(null);
				break;
			case 11:
				extraFeature.thank();
				return;
				default:
					System.out.println("Wrong Input");
			}

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
//			case 3:
//				changeEmpPass.main(employee.getId());
//				break;
//			case 4:
//				applyLeave.main(employee.getId());
//				break;
//			case 5:
//				CoolThings.thank();
//				return;
				default:
					System.out.println("Wrong Input");
			}
			
		}
		
		
	}
	
	
	
	
	

}
