package com.project.usecases;

import com.project.dao.LeaveDAO;
import com.project.dao.LeaveDaoImpl;

public class ApproveLeave {

	public static void main(int id) {
		
		LeaveDAO l=new LeaveDaoImpl();
		
		String res=l.approveLeave(id);
		
		System.out.println(res);
		
	}

}
