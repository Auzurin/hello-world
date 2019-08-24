package com.expense.dao;

import java.util.List;

import com.expense.beans.Form;

public interface FormDao {

	
		//CREATE
		public void insertForm(Form claim);
	
			
		//READ
		public Form selectClaimById(int id);
		public List<Form> selectClaimIdsByEmpId(int empid);
		public List<Form> selectAllClaims();
		public List<Form> selectAllPendingClaimsIds();
		public List<Form> selectAllResolvedClaimsIds();
			
		//UPDATE
		public void updateClaim(Form form);
			
		//DELETE
		public int deleteClaim(Form p);
	
}
