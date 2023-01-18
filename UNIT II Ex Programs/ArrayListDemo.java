// Java program to demonstrate the 
// working of ArrayList in Java 
  
import java.io.*; 
import java.util.*; 
  //class ArrayList implements the List interface and is used to 
  //create dynamic arrays in java helpful if lots of array manipulation needed
  //Java ArrayList allows us to randomly access the list. 
  //ArrayList can not be used for primitive types, like int, char, etc. 
  //We will need a wrapper class for such cases. 
class ArrayListDemo { 
    public static void main(String[] args) 
    { 
        // Declaring the ArrayList with  initial size n 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
		LinkedList<Integer> ll = new LinkedList<Integer>();
  
        // Appending new elements at the end of the list 
        for (int i = 10; i <= 15; i++) 
		{ al.add(i); 
		  ll.add(i);}
        // Printing elements 
        System.out.println(al);
        System.out.println(ll);		
  
        // Remove element at index 3 
        al.remove(3); 
		ll.remove(3);
  
        // Displaying the ArrayList after deletion 
        System.out.println(al); 
		System.out.println(ll); 
  
        // Printing elements one by one 
        for (int i = 0; i < al.size(); i++) 
		{ System.out.print(al.get(i) + " ");
		System.out.print(ll.get(i)+" "); }			
    } 
} 