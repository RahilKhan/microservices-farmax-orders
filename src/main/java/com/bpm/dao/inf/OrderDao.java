package com.bpm.dao.inf;

import java.util.List ;

import com.bpm.model.OrderItem;

public interface OrderDao {

	/*
	public List<OrderItem> getOrderDetails();

	public List<OrderItem> editOrder();

	public List<OrderItem> deleteOrder();

	public List<OrderItem> findOrder();

	public List<OrderItem> findAllOrder();

	public List<OrderItem> createOrder();
	*/
	
	
	public List getOrderDetails();

	public List editOrder();

	public List deleteOrder();

	public List findOrder();

	public List findAllOrder();

	public List createOrder();


	
}
