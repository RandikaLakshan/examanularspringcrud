package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Order;
import com.example.demo.repository.Booksrepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderrepository;
	@Override
	public List<Order> getAllOrders() {
		
		//return orderrepository.getAllOrders();
		return null;
		
		
	}
	
	
	

}
