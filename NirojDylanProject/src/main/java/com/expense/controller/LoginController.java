package com.expense.controller;

import javax.servlet.http.HttpServletRequest;

import com.expense.beans.Employee;
import com.expense.dao.EmployeeDaoImpl;

public class LoginController {

	
	public static String Login(HttpServletRequest request) {
		
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			EmployeeDaoImpl empDaoImpl = new EmployeeDaoImpl();
			Employee emp = new Employee();
			
			emp = empDaoImpl.selectEmpByUsername(username,password);
			System.out.println(emp);
			
			
				try {
					if(username.equals(emp.getUsername()) && password.equals(emp.getPassword())) {
						request.getSession().setAttribute("Employee", emp);
						
						return "/html/employee_reimburstment.html";
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return "/html/index.html";		
		}
	
	
}
