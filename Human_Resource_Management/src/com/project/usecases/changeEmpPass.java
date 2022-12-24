package com.project.usecases;

import com.project.dao.EmployeeDao;
import com.project.dao.EmployeeDaoImpl;

public class changeEmpPass {

	public static void main(int id) {
		
		EmployeeDao d=new EmployeeDaoImpl();
		
		String res=d.changeEmpPassword(id);
		System.out.println();
		System.out.println(res);

	}

}
