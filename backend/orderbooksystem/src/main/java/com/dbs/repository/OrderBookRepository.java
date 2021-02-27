package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.model.Order;
 
public interface OrderBookRepository extends JpaRepository<Order, Integer> {
 
}