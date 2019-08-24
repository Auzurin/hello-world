package com.expense.beans;

public class Form {

	private int claimId;
	private int empId;
	private int adminId;
	private String dateOfRequest;
	private String dateOfResolution;
	private String dateOfExpense;
	private Object receiptImage;
	private String claimStatus;
	
	private double travelAmount;
	private double lodgeingAmount;
	private double foodAmount;
	private double otherAmount;
	private String comments;
	private double claimTotal;

	
	
	
	 public Form() {
		// TODO Auto-generated constructor stub
	}


	 
	



	public Form(int claimId, int empId, double claimTotal) {
		super();
		this.claimId = claimId;
		this.empId = empId;
		this.claimTotal = claimTotal;
	}







	public Form(int claimId, int empId) {
		super();
		this.claimId = claimId;
		this.empId = empId;
	}







	public Form(int claimId, int empId, int adminId, String dateOfRequest, String dateOfResolution,
			String dateOfExpense, Object receiptImage, String claimStatus, double travelAmount,
			double lodgeingAmount, double foodAmount, double otherAmount, String comments, double claimTotal) {
		super();
		this.claimId = claimId;
		this.empId = empId;
		this.adminId = adminId;
		this.dateOfRequest = dateOfRequest;
		this.dateOfResolution = dateOfResolution;
		this.dateOfExpense = dateOfExpense;
		this.receiptImage = receiptImage;
		this.claimStatus = claimStatus;
		this.travelAmount = travelAmount;
		this.lodgeingAmount = lodgeingAmount;
		this.foodAmount = foodAmount;
		this.otherAmount = otherAmount;
		this.comments = comments;
		this.claimTotal = claimTotal;
	}
	

	public Form(int claimId, int empId, int adminId, String dateOfRequest, String dateOfResolution,
			String dateOfExpense, Object receiptImage, String claimStatus) {
		super();
		this.claimId = claimId;
		this.empId = empId;
		this.adminId = adminId;
		this.dateOfRequest = dateOfRequest;
		this.dateOfResolution = dateOfResolution;
		this.dateOfExpense = dateOfExpense;
		this.receiptImage = receiptImage;
		this.claimStatus = claimStatus;
	}

	public Form(double travelAmount, double lodgeingAmount, double foodAmount, double otherAmount, String comments,
			double claimTotal) {
		super();
		this.travelAmount = travelAmount;
		this.lodgeingAmount = lodgeingAmount;
		this.foodAmount = foodAmount;
		this.otherAmount = otherAmount;
		this.comments = comments;
		this.claimTotal = claimTotal;
	}

	public Form(int claimId) {
		super();
		this.claimId = claimId;
	}







	public int getClaimId() {
		return claimId;
	}



	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public int getAdminId() {
		return adminId;
	}



	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}



	public String getDateOfRequest() {
		return dateOfRequest;
	}



	public void setDateOfRequest(String dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}



	public String getDateOfResolution() {
		return dateOfResolution;
	}



	public void setDateOfResolution(String dateOfResolution) {
		this.dateOfResolution = dateOfResolution;
	}



	public String getDateOfExpense() {
		return dateOfExpense;
	}



	public void setDateOfExpense(String dateOfExpense) {
		this.dateOfExpense = dateOfExpense;
	}



	public Object getReceiptImage() {
		return receiptImage;
	}



	public void setReceiptImage(Object receiptImage) {
		this.receiptImage = receiptImage;
	}


	public String getClaimStatus() {
		return claimStatus;
	}
	

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}



	public double getTravelAmount() {
		return travelAmount;
	}



	public void setTravelAmount(double travelAmount) {
		this.travelAmount = travelAmount;
	}



	public double getLodgeingAmount() {
		return lodgeingAmount;
	}



	public void setLodgeingAmount(double lodgeingAmount) {
		this.lodgeingAmount = lodgeingAmount;
	}



	public double getFoodAmount() {
		return foodAmount;
	}



	public void setFoodAmount(double foodAmount) {
		this.foodAmount = foodAmount;
	}



	public double getOtherAmount() {
		return otherAmount;
	}



	public void setOtherAmount(double otherAmount) {
		this.otherAmount = otherAmount;
	}



	public double getClaimTotal() {
		return claimTotal;
	}



	public void setClaimTotal(double claimTotal) {
		this.claimTotal = claimTotal;
	}



	public String getComments() {
		return comments;
	}



	public void setComments(String comments) {
		this.comments = comments;
	}



	@Override
	public String toString() {
		return "Form [claimId=" + claimId + ", empId=" + empId + ", adminId=" + adminId + ", dateOfRequest="
				+ dateOfRequest + ", dateOfResolution=" + dateOfResolution + ", dateOfExpense=" + dateOfExpense
				+ ", receiptImage=" + receiptImage + ", claimType=" + ", claimStatus=" + claimStatus
				+ ", travelAmount=" + travelAmount + ", lodgeingAmount=" + lodgeingAmount + ", foodAmount=" + foodAmount
				+ ", otherAmount=" + otherAmount + ", claimTotal=" + claimTotal + ", comments=" + comments + "]";
	}
	 
	 
	 
	
	
	
	
	
}
