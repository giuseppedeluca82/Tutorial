package com.giuseppe.fruit.basket.client;

import com.giuseppe.fruit.basket.model.Item;
import com.giuseppe.fruit.basket.service.BasketService;
import com.giuseppe.fruit.basket.service.FruitBasketService;

public class BasketClient {
	
    
	public static void main(String[] args){
		
		BasketService basketService = new FruitBasketService();
		
		Item banana1 = new Item("Banana");
		basketService.addItem(banana1);
		
		Item banana2 = new Item("Banana");
		basketService.addItem(banana2);
		
		Item banana3 = new Item("Banana");
		basketService.addItem(banana3);
		
		Item apple1 = new Item("Apple");
		basketService.addItem(apple1);
		
		Item apple2 = new Item("Apple");
		basketService.addItem(apple2);
		
		Item lemon1 = new Item("Lemon");
		basketService.addItem(lemon1);
		
		Item lemon2 = new Item("Lemon");
		basketService.addItem(lemon2);
		
		Item orange1 = new Item("Orange");
		basketService.addItem(orange1);
		
		Item peache1 = new Item("Peache");
		basketService.addItem(peache1);
		
	
		basketService.calculateTotalPrice();
		
		
		
		
	}
	

}
