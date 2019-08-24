package com.expense.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class RequestHelper {
	
	public static String process(HttpServletRequest request, HttpServletResponse response) {

		switch(request.getRequestURI()) {
		
		case "/NirojDylanProject/html/Login.do":
			return LoginController.Login(request);
		
//		case "/NirojDylanProject/html/Dashboard.do":
//			return DashboardController.method(request);
//			
//		case "/NirojDylanProject/html/Admin.do":
//			return AdminController.method(request);
		case "/NirojDylanProject/html/LoadForm.do":
//			return AdminController.method(request);
		
		default:
			return "/html/Login.html";
		}
	}

}
