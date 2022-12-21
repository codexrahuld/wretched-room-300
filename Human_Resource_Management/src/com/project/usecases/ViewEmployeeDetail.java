package com.project.usecases;

import com.project.dao.EmployeeDao;
import com.project.dao.EmployeeDaoImpl;
import com.project.exceptions.EmployeeException;
import com.project.main.employee.EmployeeUseCases;
import com.project.model.Employee;

public class ViewEmployeeDetail {

	public static void main(int id) {
		
		EmployeeDao d=new EmployeeDaoImpl();
		
		try {
			Employee res=d.getEmployeeByID(id);
			EmployeeUseCases.printSingleEmployee(res);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}
	
	

}
