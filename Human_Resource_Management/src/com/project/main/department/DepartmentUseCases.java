package com.project.main.department;

import java.util.List;

import com.project.model.Department;

public class DepartmentUseCases {
	
	public static void printDepartmentList(List<Department> list) {
		try {
			System.out.println();
			System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
			Thread.sleep(30);
			System.out.printf("%10s %15s", "   DEPARTMENT ID |","DEPARTMENT NAME");  
			System.out.println();   
			System.out.println("█═══════════════════════════════════█");
		} catch (InterruptedException e) {}
		for(int i=0; i<list.size(); i++){  
			System.out.format("%10s %16s", list.get(i).getId(), list.get(i).getName()); 
			System.out.println();
			try {
			if(i==list.size()-1) {
				Thread.sleep(30);
				System.out.println("█                                   █");
				Thread.sleep(30);
				System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
			}
			else {
				Thread.sleep(30);
				System.out.println("█-----------------------------------█"); 
			}
			} catch (InterruptedException e) {}
		}  
		 
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
	}

}
