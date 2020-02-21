package com.olympus.nbva.contracts;

 public class ContractData {
	
	
	private String contractID;
	private String customerName;
	private String commenceDate;
	private long term;
	private String termDate;
	private double equipPayment;
	private double servicePayment;
	
	/****************************************************************************************************************************************************/
	public String getContractID() {
		return contractID;
	}
	public void setContractID(String contractID) {
		this.contractID = contractID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCommenceDate() {
		return commenceDate;
	}
	public void setCommenceDate(String commenceDate) {
		this.commenceDate = commenceDate;
	}
	public long getTerm() {
		return term;
	}
	public void setTerm(long term) {
		this.term = term;
	}
	public String getTermDate() {
		return termDate;
	}
	public void setTermDate(String termDate) {
		this.termDate = termDate;
	}
	public double getEquipPayment() {
		return equipPayment;
	}
	public void setEquipPayment(double equipPayment) {
		this.equipPayment = equipPayment;
	}
	public double getServicePayment() {
		return servicePayment;
	}
	public void setServicePayment(double servicePayment) {
		this.servicePayment = servicePayment;
	}
	
	/****************************************************************************************************************************************************/

	
} // End Class
