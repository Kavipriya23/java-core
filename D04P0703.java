package com.learning.core.day4session1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;	 
 public class D04P0703 {
	    public static void main(String[] args) {

	        // Pre-defined information of four products

	        Product product1 = new Product("P001", "Maruti 800");

	        Product product2 = new Product("P002", "Maruti Zen");

	        Product product3 = new Product("P003", "Maruti Denzire");

	        Product product4 = new Product("P004", "Maruti ALt0");
	 
	        // Store products in a HashSet

	        Set<Product> productSet = new HashSet<>();

	        productSet.add(product1);

	        productSet.add(product2);

	        productSet.add(product3);

	        productSet.add(product4);
	 
	        // Manual input for product ID and name

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter product ID: ");

	        String productIdInput = scanner.nextLine();

	        System.out.print("Enter product name: ");

	        String productNameInput = scanner.nextLine();
	 
	        // Check if the product exists in the HashSet

	        Product inputProduct = new Product(productIdInput, productNameInput);

	        if (productSet.contains(inputProduct)) {

	            System.out.println("Product found.");

	        } else {

	            System.out.println("Product not found.");

	        }
              scanner.close();
	    }
 }
