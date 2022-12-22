package com.project.usecases;

import java.util.List;

import com.project.dao.DepartmentDAO;
import com.project.dao.DepartmentDaoImpl;
import com.project.exceptions.DepartmentException;
import com.project.main.department.DepartmentUseCases;
import com.project.model.Department;

public class GetAllDepartment {
	
	public static void main(String[] args) {
		
		DepartmentDAO dao=new DepartmentDaoImpl();
		
		try {
			List<Department>list=dao.getAllDepartment();
			
			DepartmentUseCases.printDepartmentList(list);

		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
