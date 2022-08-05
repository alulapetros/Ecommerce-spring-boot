package com.alula.ecommerce.service;

import com.alula.ecommerce.dto.Purchase;
import com.alula.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
	PurchaseResponse placeOrder(Purchase purchase);

}
