package com.project.dao;

import java.util.List;

import com.project.model.Leave;

public interface LeaveDAO {
	
	public String requestLeave(int id, String startDate, String endDate);
	
	public String approveLeave(int id);
	
	public String rejectLeave(int id);
	
	public List<Leave> pendingLeaves();

}
