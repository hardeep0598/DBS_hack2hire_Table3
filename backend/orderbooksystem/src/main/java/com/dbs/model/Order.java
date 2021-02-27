package com.dbs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {

	
	

	public Order(int custID,int id, String Stock,int quantity, String orderType, double price,
			String status, String orderDate,int executedQty) {
		super();
		this.custID = custID;
		this.id = id;
		this.Stock = Stock;
		this.quantity = quantity;
		this.orderType = orderType;
		this.price = price;
		this.status = "";
		this.orderDate = orderDate;
		this.executedQty = executedQty;
	}
	private Integer id;
	private int quantity;
	private String orderType;
	private int custID;
	private String orderDate;
	private String Stock;
	private String status;
	private double price;
	private int executedQty;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getcustID() {
		return custID;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public int getCustID() {
		return custID;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    public Integer getId() {
	        return id;
	    }
	
}