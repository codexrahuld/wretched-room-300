package usecase;

import java.util.List;

import Print.PrintEmployee;
import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;

public class GetAllEmployee {

	public static void main(String[] args) {
		
		EmployeeDAO emp=new EmployeeDaoImpl();
		
		try {
			List<Employee>list=emp.getAllEmployee();
			PrintEmployee.printEmployeeList(list);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
