package com.abc.service;

import com.abc.model.CustomerDetail;
import com.abc.model.Product;

public interface IPayment {
	
	double getPayAmount(int billdId,int userId, int custId) throws Exception ;
	Product getProductDetail(int productId);
	CustomerDetail getCustomerDetail(int custId) ;
	
	
}
