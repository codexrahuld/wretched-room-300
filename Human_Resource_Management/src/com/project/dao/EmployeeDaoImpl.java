package com.project.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.exceptions.EmployeeException;
import com.project.model.Employee;
import com.project.utility.DButil;
		// Employee dao Implementation 
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String registerEmployee(Employee employee) {
		
		String message="Employee not Registered !";
		
		try(Connection con=DButil.getConnection()){
			
			PreparedStatement ps=con.prepareStatement
			("insert into employee(firstName,lastName,mobile,email,password,dateOfBirth,address,salary,hireDate,departmentID) values(?,?,?,?,?,?,?,?,?,?)");

			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setString(3, employee.getMobile());
			ps.setString(4, employee.getEmail());
			ps.setString(5, employee.getPassword());
			ps.setString(6, employee.getDateOfBirth());
			ps.setString(7, employee.getAddress());
			ps.setInt(8, employee.getSalary());
			ps.setString(9, employee.getHireDate());
			ps.setInt(10, employee.getDepartmentID());
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Employee Registered Sucessfully ! Password is "+employee.getPassword();
			
		}catch(SQLException e) {
			message=e.getMessage();
		}
		
		return message;
		
	}

	
	@Override
	public List<Employee> getAllEmployee() throws EmployeeException {
		List<Employee> list=new ArrayList<>();
		
		try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("select * from employee");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setFirstName(rs.getString("firstName"));
				e.setLastName(rs.getString("lastName"));
				e.setMobile(rs.getString("mobile"));
				e.setEmail(rs.getString("email"));
				e.setPassword(rs.getString("password"));
				e.setDateOfBirth(rs.getString("dateOfBirth"));
				e.setAddress(rs.getString("address"));
				e.setSalary(rs.getInt("salary"));
				e.setHireDate(rs.getString("hireDate"));
				e.setDepartmentID(rs.getInt("departmentID"));
				
				list.add(e);
			}
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		if(list.size()==0) {
			throw new EmployeeException("List is empty");
		}
		
		return list;
	}


	@Override
	public String changeDepartment(int employeeID, int newDepartmentID) {
		String message="Department Not Change";
		
		try (Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("update employee set departmentid=? where id=?");
			
			ps.setInt(1, newDepartmentID);
			ps.setInt(2, employeeID);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Employee Transferred to New Department";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		
		
		
		return message;
	}


	@Override
	public String changeEmpPassword(int id) {
		String message="Not Change";
		
		try (Connection con=DButil.getConnection()) {
			
			PreparedStatement ps = con.prepareStatement(" select * from employee where id = ?");
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter existing password");
				String pass=sc.next();
				if(pass.equals(rs.getString("password"))) {
					message=changePass(id);
				}
				else {
					message="Incorrect password";
				}
			}
			else {
				return "Employee Not Found";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}

		return message;
	}

	
	private String changePass(int id) {
		String messagesg="Password Not Updated";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter new password");
		String npass=sc.next();
		
		try (Connection con=DButil.getConnection()){
			PreparedStatement ps=con.prepareStatement("update employee set password=? where id=?");
			ps.setString(1, npass);
			ps.setInt(2, id);
			
			int rs=ps.executeUpdate();
			if(rs>0) {
				messagesg="Password Updated Sucessfully";
			}

		} catch (SQLException e) {
			
			messagesg=e.getMessage();
		 
		}
		
	   return messagesg;
		
	}
	
	

	@Override
	public Employee getEmployeeByID(int id1)throws EmployeeException{
		Employee emp=null;
		
		try (Connection con=DButil.getConnection()){
			
			PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
			
			ps.setInt(1, id1);
			
			ResultSet rs=ps.executeQuery();
			DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
			if(rs.next()) {
				
				int id=rs.getInt("id");
				String firstname=rs.getString("firstName");
				String lastname=rs.getString("lastName");
				String mobile=rs.getString("mobile");
				String email=rs.getString("email");
				String password=rs.getString("password");
				Date dob=rs.getDate("dateOfBirth");
				String dateOfBirth=dateFormat.format(dob); 
				String address=rs.getString("address");
				int salary=rs.getInt("salary");
				Date hd=rs.getDate("hireDate");
				String hireDate=dateFormat.format(hd);
				int departmentId=rs.getInt("departmentId");
				
				emp=new Employee(id, firstname, lastname, mobile, email, password, dateOfBirth, address, salary, hireDate, departmentId);
				
			}else {
				throw new EmployeeException("Employee not exist with this id : "+id1);
			}
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		return emp;
	}


	@Override
	public String updateEmployee(String column, String typeName, int id) {
		String message="Not Updated";
		
		try (Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("update employee set "+column+"=? where id=?");
			
			ps.setString(1, typeName);
			ps.setInt(2, id);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message=column+" Updated Successfully";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}

		return message;
	}


	@Override
	public List<Employee> employeeByDepartment(int id) throws EmployeeException {
		List<Employee> list=new ArrayList<>();
		
		try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("select * from employee where departmentID=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setFirstName(rs.getString("firstName"));
				e.setLastName(rs.getString("lastName"));
				e.setMobile(rs.getString("mobile"));
				e.setEmail(rs.getString("email"));
				e.setPassword(rs.getString("password"));
				e.setDateOfBirth(rs.getString("dateOfBirth"));
				e.setAddress(rs.getString("address"));
				e.setSalary(rs.getInt("salary"));
				e.setHireDate(rs.getString("hireDate"));
				e.setDepartmentID(rs.getInt("departmentID"));
				
				list.add(e);
			}
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		if(list.size()==0) {
			throw new EmployeeException("Zero Employee in this Department");
		}
		
		return list;
	}

}
