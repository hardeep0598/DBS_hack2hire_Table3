package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {
	 
}
