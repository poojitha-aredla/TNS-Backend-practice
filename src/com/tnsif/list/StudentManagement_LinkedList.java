package com.tnsif.list;
import java.util.LinkedList;
class Student {
    String name;
    int id;
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class StudentManagement_LinkedList {
	public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        
        
        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 102));
        students.addFirst(new Student("Charlie", 100)); // Adds to beginning
        
        
        System.out.println("All Students:");
        for(Student s : students) {
            System.out.println(s);
        }
        
        
        int removeId = 101;
        students.removeIf(s -> s.id == removeId);
        System.out.println("\nAfter removing ID " + removeId + ":");
        students.forEach(System.out::println);
        
       
        String searchName = "Bob";
        System.out.println("\nSearch results for '" + searchName + "':");
        students.stream()
               .filter(s -> s.name.equals(searchName))
               .forEach(System.out::println);
        
        
        System.out.println("\nTotal students: " + students.size());
    }
	



	
	    

}
