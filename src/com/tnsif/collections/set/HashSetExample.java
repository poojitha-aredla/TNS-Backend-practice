package com.tnsif.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        
        Set<String> uniqueFruits = new HashSet<>();
        
       
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Orange");
        uniqueFruits.add("Apple"); 
        System.out.println("Initial Set: " + uniqueFruits);
       
       
        System.out.println("Contains 'Banana'? " + uniqueFruits.contains("Banana"));
        
        uniqueFruits.remove("Orange");
        System.out.println("After removing Orange: " + uniqueFruits);
        
        System.out.println("Current size: " + uniqueFruits.size());
        
        System.out.println("Is set empty? " + uniqueFruits.isEmpty());
     
        uniqueFruits.add(null);
        uniqueFruits.add(null); // Second null ignored
        System.out.println("After adding null: " + uniqueFruits);
       
        uniqueFruits.clear();
        System.out.println("After clearing: " + uniqueFruits);
        
        Set<String> moreFruits = new HashSet<>();
        moreFruits.add("Mango");
        moreFruits.add("Pineapple");
        
        uniqueFruits.addAll(moreFruits);
        System.out.println("After addAll: " + uniqueFruits);
     
        System.out.println("\nIterating through set:");
        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }
        
        
        
        Set<String> toRemove = new HashSet<>();
        toRemove.add("Mango");
        
        uniqueFruits.removeAll(toRemove);
        System.out.println("After removeAll: " + uniqueFruits);
        
    }
}
