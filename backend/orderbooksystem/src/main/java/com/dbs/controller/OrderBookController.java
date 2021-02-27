package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.model.Order;
import com.dbs.model.Stock;
import com.dbs.service.OrderService;
import com.dbs.service.StockService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrderBookController {
	
	@Autowired
    private OrderService service;
	
	@Autowired
	private StockService stockService;
	
	@PostMapping("/orders")
	public void add(@RequestBody Order order) {
	    service.save(order);
	}
	
	@GetMapping("/stocks")
	public List<Stock> getStocks() {
		return stockService.getAllStocks();
	}

}
