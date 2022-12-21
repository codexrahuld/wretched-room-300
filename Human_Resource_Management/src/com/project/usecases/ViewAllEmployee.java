package com.project.usecases;

import java.util.List;

import com.project.dao.EmployeeDao;
import com.project.dao.EmployeeDaoImpl;
import com.project.exceptions.EmployeeException;
import com.project.main.employee.EmployeeUseCases;
import com.project.model.Employee;

public class ViewAllEmployee {

	public static void main(String[] args) {
		
		EmployeeDao emp=new EmployeeDaoImpl();
		
		try {
			List<Employee>list=emp.getAllEmployee();
			EmployeeUseCases.printEmployeeList(list);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
