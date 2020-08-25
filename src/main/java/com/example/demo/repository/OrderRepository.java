package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Books;
import com.example.demo.model.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	//@Query("SELECT new com.example.demo.model.Order(b.id , a.aid) from author a JOIN a.books1 b")
	//public List<Order> getAllOrders();
	
	

}
