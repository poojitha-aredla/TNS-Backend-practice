package com.tnsif.list;
import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();
        
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Initial List: " + fruits);
        
        
        fruits.add(1, "Mango");
        System.out.println("After Insertion: " + fruits);
        
       
        System.out.println("Element at index 2: " + fruits.get(2));
        
        
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));
        
        
        fruits.remove("Apple");
        fruits.remove(0); 
        System.out.println("After Removal: " + fruits);
        
        
        System.out.println("Current Size: " + fruits.size());
        
        
        System.out.print("All Fruits: ");
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        
        
        fruits.clear();
        System.out.println("\nAfter Clearing: " + fruits);
	}
    

}
