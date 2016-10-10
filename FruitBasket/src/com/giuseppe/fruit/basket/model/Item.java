package com.giuseppe.fruit.basket.model;

public class Item {
	
	  public Item(String name){
		  this.name=name;
	  }
	  
	  private String name;
	  private Double price;
	  
	  public String getName() {
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }

	  public Double getPrice() {
		  return price;
	  }
	  public void setPrice(Double price) {
		  this.price = price;
	  }


}
