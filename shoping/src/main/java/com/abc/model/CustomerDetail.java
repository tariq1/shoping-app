package com.abc.model;

import java.util.Date;
import java.util.List;

public class CustomerDetail {
	  private int custId;
	  private String custName;
	  private Address custAddress;
	  private String mobileNumbr;
	  private Date startDate;
	  private Date endDate;
	  private List<BillDetail> lstOfBill;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}
	public String getMobileNumbr() {
		return mobileNumbr;
	}
	public void setMobileNumbr(String mobileNumbr) {
		this.mobileNumbr = mobileNumbr;
	}
	
	public List<BillDetail> getLstOfBill() {
		return lstOfBill;
	}
	public void setLstOfBill(List<BillDetail> lstOfBill) {
		this.lstOfBill = lstOfBill;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	  	  
}
