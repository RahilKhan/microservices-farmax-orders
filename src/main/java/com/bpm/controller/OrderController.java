package com.bpm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bpm.service.OrderServiceInf;
import com.google.gson.Gson;


@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderServiceInf orderService; 	
	
	/**
	 * This service returns Order details
	 * @return String
	 */
	@RequestMapping(value = "/getOrderDetails", method = RequestMethod.GET)
	public @ResponseBody
	String getOrderDetails(HttpServletRequest request) {
		System.out.println("OrderController : getOrderDetails");
		String response = null;

    	List dashboardBeanList = orderService.getOrderDetails();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}

	/**
	 * This service creates an order  
	 * @return String
	 */
	@RequestMapping(value = "/createOrder", method = RequestMethod.GET)
	public @ResponseBody
	String createOrder(HttpServletRequest request) {
		System.out.println("OrderController : createOrder");
		String response = null;

    	List dashboardBeanList = orderService.createOrder();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	
	
	/**
	 * This service edit an order  
	 * @return String
	 */
	@RequestMapping(value = "/editOrder", method = RequestMethod.GET)
	public @ResponseBody
	String editOrder(HttpServletRequest request) {
		System.out.println("OrderController : editOrder");
		String response = null;

    	List dashboardBeanList = orderService.editOrder();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	
	
	/**
	 * This service edit an order  
	 * @return String
	 */
	@RequestMapping(value = "/deleteOrder", method = RequestMethod.GET)
	public @ResponseBody
	String deleteOrder(HttpServletRequest request) {
		System.out.println("OrderController : deleteOrder");
		String response = null;

    	List dashboardBeanList = orderService.deleteOrder();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	

	/**
	 * This service edit an order  
	 * @return String
	 */
	@RequestMapping(value = "/findOrder", method = RequestMethod.GET)
	public @ResponseBody
	String findOrder(HttpServletRequest request) {
		System.out.println("OrderController : findOrder");
		String response = null;

    	List dashboardBeanList = orderService.findOrder();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	

	/**
	 * This service edit an order  
	 * @return String
	 */
	@RequestMapping(value = "/findAllOrder", method = RequestMethod.GET)
	public @ResponseBody
	String findAllOrder(HttpServletRequest request) {
		System.out.println("OrderController : findAllOrder");
		String response = null;

    	List dashboardBeanList = orderService.findAllOrders();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	

}
