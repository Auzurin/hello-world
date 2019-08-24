package com.expense.dao;

import java.util.List;

import com.expense.beans.Employee;
import com.expense.beans.Form;

public interface EmployeeDao {

	
			//CREATE
			public void insertEmployee(Employee employee);
		
				
			//READ
			public Employee selectEmpById(int id);
			public Employee selectEmpByUsername(String username,String password);
			public List<Form> selectEmpsByTitle(int empid);
			public List<Form> selectAllEmps();
			
				
			//UPDATE
			public void updateEmployee(int empId);
				
			//DELETE
			public int deleteEmp(int empId);
}
