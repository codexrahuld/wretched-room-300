package com.project.main.leave;

import java.util.List;

import com.project.model.Leave;

		// Leave Use cases are here

public class LeaveUseCases {
	
	public static void printLeaveList(List<Leave>list) {
		for(Leave leave:list) {
			try {
			System.out.println("-----------------------------");
			System.out.println();
			System.out.println("EMPLOYEE ID   : "+leave.getEmployeeId());
			Thread.sleep(20);
			System.out.println("EMPLOYEE NAME : "+leave.getFirstName()+" "+leave.getLastName());
			Thread.sleep(20);
			System.out.println("DEPARTMENT ID : "+leave.getDepartmentID());
			Thread.sleep(20);
			System.out.println("START DATE    : "+leave.getStartDate());
			Thread.sleep(20);
			System.out.println("END DATE      : "+leave.getEndDate());
			Thread.sleep(20);
			System.out.println("STATUS        : "+leave.getStatus());
			Thread.sleep(20);
			System.out.println();
			} catch (InterruptedException e) {}
		}
		System.out.println("-----------------------------");
		System.out.println();
	}

}
