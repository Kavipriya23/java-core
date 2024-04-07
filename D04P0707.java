package com.learning.core.day4session1;
	import java.util.TreeSet;
	public class D04P0707 {
	    public static void main(String[] args) {
	        // Pre-defined information of 6 persons
	    	  Person person1 = new Person(1, "Alice", 30, 50000.0);
	          Person person2 = new Person(2, "Bob", 28, 55000.0);
	          Person person3 = new Person(3, "Charlie", 25, 60000.0);
	          Person person4 = new Person(4, "David", 35, 70000.0);
	          Person person5 = new Person(5, "Eva", 20, 45000.0);
	          Person person6 = new Person(6, "Frank", 40, 80000.0);
	 
	        // Store persons in a TreeSet (sorted based on ID)
	        TreeSet<Person> personSet = new TreeSet<>();
	        personSet.add(person1);
	        personSet.add(person2);
	        personSet.add(person3);
	        personSet.add(person4);
	        personSet.add(person5);
	        personSet.add(person6);
	 
	        // Print all names in uppercase
	        System.out.println("Names in uppercase:");
	        for (Person person : personSet) {
	            System.out.println(person.getName().toUpperCase());
	        }
	    }
}
