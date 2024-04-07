package com.learning.core.day4session1;
import java.util.ArrayList;
import java.util.Scanner; 
public class D04P0701 {

    public static void main(String[] args) {

        // Creating an ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter 5 names:");
        for(int i=1;i<=5;i++) {
        	name=sc.nextLine();
        	studentNames.add(name);
        }     
        // Taking manual input for the name to search
    
        System.out.println("Enter the name to search: ");
        String nameToSearch = sc.nextLine();
 
        // Checking if the name found in the list

        if (studentNames.contains(nameToSearch)) {
            System.out.println(nameToSearch + " Found ");
        } else {
            System.out.println(nameToSearch + " Not Found ");
        }
        sc.close();
    }
    }
 