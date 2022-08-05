package com.alula.ecommerce.dto;

import java.util.Set;

import com.alula.ecommerce.entity.Address;
import com.alula.ecommerce.entity.Customer;
import com.alula.ecommerce.entity.Order;
import com.alula.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {
	private Customer customer;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	private Set<OrderItem> orderItems;

}
