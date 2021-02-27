package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbs.model.Stock;
import com.dbs.repository.StockRepository;

public class StockService {
	
	@Autowired StockRepository repo;
	
	public List<Stock> getAllStocks(){
		return repo.findAll();
	}

}
