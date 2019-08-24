package com.expense.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expense.beans.Employee;
import com.expense.beans.Form;
import com.expense.dao.FormDaoImple;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AdminController {

	static FormDaoImple formDao = new FormDaoImple();
	
	
	
	public static String importForm(HttpServletRequest request, int claimId) {
		//retrieving the employee object in our session
		Employee manager = (Employee)request.getSession().getAttribute("Employee");
		
		
		Form existingForm = formDao.selectClaimById(claimId);  //Takes in claim ID typed in By the Manager to load form.
		

		try {
			//returns JSON string of the desired reimbursment form
			return (new ObjectMapper().writeValueAsString(existingForm));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static String importPendingForms(HttpServletRequest request) {
		//retrieving the employee object in our session
		Employee manager = (Employee)request.getSession().getAttribute("Employee");
		
		
		
		Object pendingList = formDao.selectAllPendingClaimsIds();
		
		try {
			//returns the list of form objects in a JSON string
			return (new ObjectMapper().writeValueAsString(pendingList));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
	
}
