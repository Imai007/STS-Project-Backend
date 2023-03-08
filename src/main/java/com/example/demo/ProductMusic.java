package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductMusic {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private int CustomerId;
	private String ItemName;
	private float Price;
	private int Quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public ProductMusic(int id, int customerId, String itemName, float price, int quantity) {
		super();
		this.id = id;
		CustomerId = customerId;
		ItemName = itemName;
		Price = price;
		Quantity = quantity;
	}
	public ProductMusic() {
		super();
		// TODO Auto-generated constructor stub
	}

}