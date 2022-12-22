package com.project.usecases;

import java.util.List;
import java.util.Scanner;

import com.project.dao.EmployeeDao;
import com.project.dao.EmployeeDaoImpl;
import com.project.exceptions.EmployeeException;
import com.project.main.employee.EmployeeUseCases;
import com.project.model.Employee;

public class EmployeeByDepartment {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Department ID");
		
		int id=sc.nextInt();
		
		EmployeeDao emp=new EmployeeDaoImpl();
		
		try {
			List<Employee>list=emp.employeeByDepartment(id);
			EmployeeUseCases.printEmployeeList(list);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
