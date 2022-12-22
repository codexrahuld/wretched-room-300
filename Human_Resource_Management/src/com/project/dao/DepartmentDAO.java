package com.project.dao;
import java.util.List;

import com.project.exceptions.DepartmentException;
import com.project.model.Department;

public interface DepartmentDAO {
	
	public String registerDepartment(String name);
	
	public List<Department> getAllDepartment()throws DepartmentException;
	
	public String updateDepartment(Department department);

}
