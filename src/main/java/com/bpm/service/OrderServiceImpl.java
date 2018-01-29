package com.bpm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bpm.dao.inf.CurrencyDao;
import com.bpm.dao.inf.OrderDao;
import com.bpm.model.OrderItem;
import com.bpm.model.Currency;



@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderServiceInf{

	@Autowired
	CurrencyDao currencyDao;

	@Autowired
	OrderDao orderDao;

	
	@Override
	public List getOrderDetails() {
		System.out.println("OrderServiceImpl.getDashBoardDetails()");
		List orderList = orderDao.getOrderDetails();
		System.out.println("\t orderList.size() : " + orderList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return orderList;
	}

	@Override
	public List createOrder() {
		System.out.println("OrderServiceImpl.createOrder()");
		List<OrderItem> orderList = orderDao.createOrder();
		System.out.println("\t orderList.size() : " + orderList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return orderList;
	}

	@Override
	public List editOrder() {
		System.out.println("DashboardServiceImpl.editOrder()");
		List<OrderItem> orderList = orderDao.editOrder();
		System.out.println("\t orderList.size() : " + orderList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return orderList;
	}

	@Override
	public List deleteOrder() {
		System.out.println("DashboardServiceImpl.deleteOrder()");
		List<OrderItem> orderList = orderDao.deleteOrder();
		System.out.println("\t orderList.size() : " + orderList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return orderList;
	}

	@Override
	public List findOrder() {
		System.out.println("DashboardServiceImpl.findOrder()");
		List<OrderItem> orderList = orderDao.findOrder();
		System.out.println("\t orderList.size() : " + orderList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return orderList;
	}

	@Override
	public List findAllOrders() {
		System.out.println("DashboardServiceImpl.findAllOrder()");
		List<OrderItem> orderList = orderDao.findAllOrder();
		System.out.println("\t orderList.size() : " + orderList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return orderList;
	}

	
}
