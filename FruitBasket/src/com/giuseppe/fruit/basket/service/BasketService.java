package com.giuseppe.fruit.basket.service;


import com.giuseppe.fruit.basket.model.Item;

public interface BasketService {
	
	public void addItem(Item fruitItem);
	public Double calculateTotalPrice();

}
