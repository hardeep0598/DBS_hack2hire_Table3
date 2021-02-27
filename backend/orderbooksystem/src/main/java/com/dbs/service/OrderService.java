package com.dbs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.model.Order;
import com.dbs.repository.OrderBookRepository;

@Service
@Transactional
public class OrderService {

	@Autowired

    private OrderBookRepository repository;
    
	public void save(Order order) {
        repository.save(order);
    }
	
	
	
}
