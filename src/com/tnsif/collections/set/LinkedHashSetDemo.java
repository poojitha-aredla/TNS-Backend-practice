package com.tnsif.collections.set;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        
        Set<String> visitedWebsites = new LinkedHashSet<>();
        
        
        visitedWebsites.add("google.com");
        visitedWebsites.add("github.com");
        visitedWebsites.add("stackoverflow.com");
        visitedWebsites.add("github.com"); // Duplicate
        
       
        System.out.println("Visited sites in order: " + visitedWebsites);
        
        System.out.println("Visited GitHub? " + 
            visitedWebsites.contains("github.com")); // true
            
        
        visitedWebsites.remove("google.com");
        System.out.println("After removal: " + visitedWebsites);
        
        System.out.println("\nBrowsing history:");
        for (String site : visitedWebsites) {
            System.out.println("- " + site);
        }
        
        Set<String> newSites = new LinkedHashSet<>();
        newSites.add("linkedin.com");
        newSites.add("reddit.com");
        
        visitedWebsites.addAll(newSites);
        System.out.println("\nUpdated history: " + visitedWebsites);
       
    }
}
