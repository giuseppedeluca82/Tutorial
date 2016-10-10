package com.giuseppe.fruit.basket.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.giuseppe.fruit.basket.model.Item;

public class FruitBasketService implements BasketService{
	
	private static final Logger LOGGER = Logger.getLogger( FruitBasketService.class.getName() );
	
	private static final Map<String, Double> priceMap;
	
    static {
        Map<String, Double> tmpMap = new HashMap<String,Double>();
        tmpMap.put("Banana",1.0);
        tmpMap.put("Orange",1.2);
        tmpMap.put("Apple",1.4);
        tmpMap.put("Lemon",1.6);
        tmpMap.put("Peache",1.8);
        priceMap = Collections.unmodifiableMap(tmpMap);
    }
    
	private Double totalPrice = new Double(0.0);
			
	private List<Item> fruitBasket = new ArrayList<Item>();
	
	
	public void addItem(Item fruitItem) {
		if(fruitItem!=null){
			fruitItem.setPrice(priceMap.get(fruitItem.getName()));
			LOGGER.info("Adding "+fruitItem.getName()+", item price="+fruitItem.getPrice());
			fruitBasket.add(fruitItem);
		}
	}
	
	public Double calculateTotalPrice(){
		for(Item fruit : fruitBasket){
			if(fruit.getName()!=null && fruit.getPrice()!=null){
				totalPrice+= fruit.getPrice();
			}
		}
		LOGGER.info("Total price="+totalPrice);
		return totalPrice;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<Item> getFruitBasket() {
		return fruitBasket;
	}

	public void setFruitBasket(List<Item> fruitBasket) {
		this.fruitBasket = fruitBasket;
	}

}
