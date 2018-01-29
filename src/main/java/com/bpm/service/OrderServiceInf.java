package com.bpm.service;

import java.util.List;

public interface OrderServiceInf {

	/**
	 * This service gets dashboard details based on user id
	 * @param userId
	 * @return
	 */
	public List getOrderDetails();

	public List createOrder();

	public List editOrder();

	public List deleteOrder();

	public List findOrder();

	public List findAllOrders();
}
