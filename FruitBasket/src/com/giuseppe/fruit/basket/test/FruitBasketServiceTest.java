package com.giuseppe.fruit.basket.test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import com.giuseppe.fruit.basket.model.Item;
import com.giuseppe.fruit.basket.service.FruitBasketService;

public class FruitBasketServiceTest {

	FruitBasketService basketService = new FruitBasketService();
	
	@Before
	public void setUp() {
		basketService = new FruitBasketService();
	}
	
	@Test
    public void basketIsEmpty() {
	        assertEquals(basketService.getTotalPrice().toString(), "0.0");
	        assertEquals(basketService.getFruitBasket().size(), 0);
	}
	
	@Test
    public void addOneBananaInThebasket() {
		    Item banana = new Item("Banana");
		    basketService.addItem(banana);
		    assertEquals(basketService.getFruitBasket().size(), 1);
		    basketService.calculateTotalPrice();
	        assertEquals(basketService.getTotalPrice().toString(), "1.0");
	       
	}
	
	@Test
    public void addTwoBananasInTheBasket() {
		    Item banana1 = new Item("Banana");
		    Item banana2 = new Item("Banana");
		    basketService.addItem(banana1);
		    basketService.addItem(banana2);
		    assertEquals(basketService.getFruitBasket().size(), 2);
		    basketService.calculateTotalPrice();
	        assertEquals(basketService.getTotalPrice().toString(), "2.0");
	       
	}
	
	@Test
    public void addTwoBananasAndThreeApplesInTheBasket() {
		    Item banana1 = new Item("Banana");
		    Item banana2 = new Item("Banana");
		    basketService.addItem(banana1);
		    basketService.addItem(banana2);
		    Item apple1 = new Item("Apple");
		    Item apple2 = new Item("Apple");
		    Item apple3 = new Item("Apple");
		    basketService.addItem(apple1);
		    basketService.addItem(apple2);
		    basketService.addItem(apple3);
		    assertEquals(basketService.getFruitBasket().size(), 5);
		    basketService.calculateTotalPrice();
		    Double totalPrice = basketService.getTotalPrice();
		    NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
		    DecimalFormat df = (DecimalFormat)nf;
		    df.setMaximumFractionDigits(1);
	        assertEquals(df.format(totalPrice), "6.2");
	       
	}
	
	@Test
    public void addAllFruitsInTheBasket() {
		    Item banana1 = new Item("Banana");
		    Item banana2 = new Item("Banana");
		    Item banana3 = new Item("Banana");
		    basketService.addItem(banana1);
		    basketService.addItem(banana2);
		    basketService.addItem(banana3);
		    Item apple1 = new Item("Apple");
		    Item apple2 = new Item("Apple");
		    basketService.addItem(apple1);
		    basketService.addItem(apple2);
		    Item lemon1 = new Item("Lemon");
		    Item lemon2 = new Item("Lemon");
		    basketService.addItem(lemon1);
		    basketService.addItem(lemon2);
		    Item orange = new Item("Orange");
		    basketService.addItem(orange);
		    Item peache = new Item("Peache");
		    basketService.addItem(peache);
		    assertEquals(basketService.getFruitBasket().size(), 9);
		    basketService.calculateTotalPrice();
	        assertEquals(basketService.getTotalPrice().toString(), "12.0");
	       
	}

}
