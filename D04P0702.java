package com.learning.core.day4session1;
import java.util.Scanner;
import java.util.*;
	public class D04P0702{
	    public static void main(String[] args) {
	        // Create HashSet to store Product objects
	        HashSet<Product> products = new HashSet<>();
	   
	     // Predefined information of 4 products
	        Product product1 = new Product("P001", "Maruti 800");
	        Product product2 = new Product("P002", "Maruti Zen");
	        Product product3 = new Product("P003", "Maruti Denzire");
	        Product product4 = new Product("P004", "Maruti ALt0");
	        
	        // Add products to the HashSet
	        products.add(product1);
	        products.add(product2);
	        products.add(product3);
	        products.add(product4);
	    
	        // List all product details
	        System.out.println("Product Details:");
	        for (Product product : products) {
	            System.out.println(product);
	        }
	    }
	}
	        
	    
	    
	    
	    
	    
	    
	       //Predefined information of 4 products
	        //Product product1 = new Product("P001", "Maruti 800");
	        //Product product2 = new Product("P002", "Maruti Zen");
	        //Product product3 = new Product("P003", "Maruti Denzire");
	        //Product product4 = new Product("P004", "Maruti ALt0");
	        // Add products to the HashSet
	        //products.add(product1);
	        //products.add(product2);
	        //products.add(product3);
	        //products.add(product4);
	        
	        // List all product details
	    


