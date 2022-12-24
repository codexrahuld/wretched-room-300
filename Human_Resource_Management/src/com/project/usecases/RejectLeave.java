package com.project.usecases;

import com.project.dao.LeaveDAO;
import com.project.dao.LeaveDaoImpl;

public class RejectLeave {

	public static void main(int id) {

		LeaveDAO l=new LeaveDaoImpl();
		
		String res=l.rejectLeave(id);
		
		System.out.println(res);

		
	}

}
