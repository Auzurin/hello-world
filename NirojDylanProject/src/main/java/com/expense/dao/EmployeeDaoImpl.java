package com.expense.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.expense.beans.Employee;
import com.expense.beans.Form;

public class EmployeeDaoImpl implements EmployeeDao {
	
private static String url = "jdbc:oracle:thin:@dylansrevaturedb.cpu77pyuv98o.us-east-2.rds.amazonaws.com:1521:orcl"; // endpoint: port: SID
	
	private static String username = "Dboycerev";
	private static String password = "Dylanrev91";
	
	
	static{

	       try {

	           Class.forName("oracle.jdbc.driver.OracleDriver");

	       } catch (ClassNotFoundException e) {

	           e.printStackTrace();

	       }

	   }
	

	@Override
	public void insertEmployee(Employee employee) {
		
		
	}

	@Override
	public Employee selectEmpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public Employee selectEmpByUsername(String name, String pass) {
		Employee employee = null;
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM employees WHERE username =? AND password =?");
			ps.setString(1, name);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {

				employee = new Employee(rs.getInt("emp_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("title"), rs.getString("email"),rs.getString("username"),
						rs.getString("password"));
			}
			System.out.println(employee);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
		
	}

	@Override
	public List<Form> selectEmpsByTitle(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Form> selectAllEmps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteEmp(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
