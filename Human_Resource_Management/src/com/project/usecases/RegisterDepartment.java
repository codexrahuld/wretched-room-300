package com.project.usecases;

import java.util.Scanner;

import com.project.dao.DepartmentDAO;
import com.project.dao.DepartmentDaoImpl;

public class RegisterDepartment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department Name");
		String dname=sc.nextLine();
		DepartmentDAO dao = new DepartmentDaoImpl();
		String res=dao.registerDepartment(dname);
		System.out.println(res);

	}

}
