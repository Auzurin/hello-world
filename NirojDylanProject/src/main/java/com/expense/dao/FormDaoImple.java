package com.expense.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.expense.beans.Form;



public class FormDaoImple implements FormDao {
	
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
	
	
	public void insertForm(Form form) {
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO reim_form VALUES(null,?,null,?,null,?,null,'pending',?,?,?,?,?,?)");
			//ps.setInt(null, form.getClaimId());  //Need to figure out how to sync this with claim_types table
			ps.setInt(1, form.getEmpId());
			//ps.setInt(null, form.getAdminId());  //Inserted in UPDATE Method
			ps.setString(2, form.getDateOfRequest());
			//ps.setString(null, form.getDateOfResolution()); Inserted in UPDATE method
			ps.setString(3, form.getDateOfExpense());
			//ps.setBlob(null, image()); Apparently NOT using BLOB for this project
			//ps.setString(4, form.getClaimStatus()); auto fill as pending
			ps.setDouble(4, form.getTravelAmount());
			ps.setDouble(5, form.getLodgeingAmount());
			ps.setDouble(6, form.getFoodAmount());
			ps.setDouble(7, form.getOtherAmount());
			ps.setString(8, form.getComments());
			ps.setDouble(9, form.getClaimTotal());
	
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	

	public Form selectClaimById(int claimid) {
		Form form = null;
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM reim_form WHERE claim_id =?");
			ps.setInt(1, claimid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				form = new Form(rs.getInt("claim_id"), rs.getInt("emp_id"), rs.getInt("admin_id"), rs.getString("date_of_request"),
						rs.getString("date_of_resolution"), rs.getString("date_of_expenses"), rs.getObject("expense_image"),
						rs.getString("claim_status"), rs.getDouble("travel_amount"),rs.getDouble("lodgeing_amount"),
						rs.getDouble("food_amount"),rs.getDouble("other_amount"), rs.getString("expense_comments"),rs.getDouble("claim_Total"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return form;
	}


	
	
	public List<Form> selectClaimIdsByEmpId(int empid) {
		List<Form> forms = new ArrayList<Form>();
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			PreparedStatement ps = conn.prepareStatement("SELECT claim_id FROM reim_form WHERE reim_form.emp_id = ?");
			ps.setInt(1, empid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				forms.add(new Form(rs.getInt("claim_id")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return forms;
	}
	
	

	
	public List<Form> selectAllClaims() {
		List<Form> forms = new ArrayList<Form>();
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM reim_form");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				forms.add(new Form(rs.getInt("claim_id"), rs.getInt("emp_id"), rs.getInt("admin_id"), rs.getString("date_of_request"),
						rs.getString("date_of_resolution"), rs.getString("date_of_expenses"), rs.getObject("expense_image"),
						rs.getString("claim_status"), rs.getDouble("travel_amount"),rs.getDouble("lodgeing_amount"),
						rs.getDouble("food_amount"),rs.getDouble("other_amount"), rs.getString("expense_comments"),rs.getDouble("claim_Total")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return forms;
	}

	
	
	
	
	public List<Form> selectAllPendingClaimsIds() {
		List<Form> forms = new ArrayList<Form>();
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			PreparedStatement ps = conn.prepareStatement("SELECT claim_id FROM reim_form WHERE claim_status = 'pending'");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				forms.add(new Form(rs.getInt("claim_id"), rs.getInt("emp_id"), rs.getInt("claim_total")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return forms;
	}
	
	
	
	
	
	

	public List<Form> selectAllResolvedClaimsIds() {
		List<Form> forms = new ArrayList<Form>();
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			PreparedStatement ps = conn.prepareStatement("SELECT claim_id, emp_id, claim_total FROM reim_form WHERE claim_status = 'resolved'");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				forms.add(new Form(rs.getInt("claim_id"), rs.getInt("emp_id"), rs.getInt("claim_total")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return forms;
	}
	
	
	
	
	

	public void updateClaimToResolved(Form form) {
		try {
			Connection conn = DriverManager.getConnection(url,username, password);
			PreparedStatement ps = conn.prepareStatement("UPDATE reim_form SET claim_status = 'resolved', admin_id =? , date_of_resolution=? WHERE claim_id=?;"); 
			
			ps.setInt(1, form.getAdminId()); 
			ps.setString(2, form.getDateOfResolution());
			ps.setInt(3, form.getClaimId());
			ps.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void updateClaimToDenied(Form form) {
		try {
			Connection conn = DriverManager.getConnection(url,username, password);
			PreparedStatement ps = conn.prepareStatement("UPDATE reim_form SET claim_status = 'denied', admin_id =? , date_of_resolution=? WHERE claim_id=?;"); 
			
			ps.setInt(1, form.getAdminId()); 
			ps.setString(2, form.getDateOfResolution());
			ps.setInt(3, form.getClaimId());
			ps.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	public int deleteClaim(Form p) {
		// TODO Auto-generated method stub
		return 0;
	}






	@Override
	public void updateClaim(Form form) {
		// TODO Auto-generated method stub
		
	}




	


	

	
		
}
