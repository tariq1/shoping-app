package com.abc.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.abc.model.BillDetail;
import com.abc.model.CustomerDetail;
import com.abc.model.Product;
import com.abc.model.UserDetail;
import com.abc.util.DateUtil;

public class Payment implements IPayment{
	
	// can use the farmework to inject the bject insted of hardcode
	
	private PaymentHelper paymentHelper ;

	
	public double getPayAmount(int billdId,int userId, int custId) throws Exception {
		double nonGrocery =0;
		double payableAmount =0;
		double groceryAmont =0;
		BillDetail billdetail=paymentHelper.getBillDetail(billdId);
		//we will take the user id from the request
	//	int userId=11045;
	//	int custId=1112;
		UserDetail   userDetail=paymentHelper.getUserDetail(userId ) ;
		CustomerDetail custDetail=paymentHelper.getCustomerDetail(custId) ;
		List<Product> lstOfProduct= billdetail.getLstOfProduct() ;
		
		
		if(lstOfProduct !=null) {
				for(Product p : lstOfProduct){
					if(p.isGrocery()) {
						 groceryAmont=groceryAmont+p.getProductCost();
					 
					   } else {
						
						   nonGrocery=nonGrocery + p.getProductCost();
						
					}
				}	
				
				if(userDetail.isEmployee()){
					
					nonGrocery=nonGrocery-(nonGrocery*30)/100;
				}
				else if(userDetail.isAffilate()){
					
					nonGrocery=nonGrocery-(nonGrocery*10)/100;
				
				}else if(DateUtil.isTwoYearOlder(custDetail.getStartDate())){
					
					nonGrocery=nonGrocery-(nonGrocery*5)/100;
				}
				
				payableAmount=nonGrocery+groceryAmont;
			   
				if((payableAmount) > 100){
					
					int discount = (int)(payableAmount) /100 ;
				     payableAmount=payableAmount - (discount*5);
				}	
		
		} else {
			
			throw new Exception(" product list is empty") ;
		}
		
		return payableAmount;
	}
	
	// to get the product detail
	
	public PaymentHelper getPaymentHelper() {
		return paymentHelper;
	}



	public void setPaymentHelper(PaymentHelper paymentHelper) {
		this.paymentHelper = paymentHelper;
	}



	public Product getProductDetail(int productId) {
	
		return null;
	}

// to get the customer detail	
	public CustomerDetail getCustomerDetail(int custId) {
		
		return null;
	}

}
