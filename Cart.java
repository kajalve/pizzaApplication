package in.ac.sharda.Demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Products> products =new ArrayList<>();
	
	public void addProducts(Products product){
		this.products.add(product);
	}

}
