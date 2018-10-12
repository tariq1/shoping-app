package com.abc.model;

import java.util.Date;
import java.util.List;

public class BillDetail {
	private int billId;
	private List<Product> lstOfProduct;
	private Date date;
	private int totalAmount ;
	private int totalPayAmount;
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public List<Product> getLstOfProduct() {
		return lstOfProduct;
	}
	public void setLstOfProduct(List<Product> lstOfProduct) {
		this.lstOfProduct = lstOfProduct;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getTotalPayAmount() {
		return totalPayAmount;
	}
	public void setTotalPayAmount(int totalPayAmount) {
		this.totalPayAmount = totalPayAmount;
	}
	

}
