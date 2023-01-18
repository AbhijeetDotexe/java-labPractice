import java.util.*;
//HashSet class implements the Set interface supported by Hash table which is an HashMap instance.Duplicate values 
//are not allowed.Objects are inserted based on their hash code n not in the order of insertion.Null values are allowed.
//also implements Serializable and Cloneable interface
public class SetExample{ 
    public static void main(String[] args) 
    { 
        // Set demonstration using HashSet 
        Set<String> h = new HashSet<String>(); 
  
        h.add("India"); 
        h.add("Australia"); 
        h.add("SouthAfrica"); 
        h.add("India"); 
        h.add("Bangladesh"); 
  
        System.out.println(h); 
		// Displaying the HashSet 
        
        System.out.println("List contains India or not:"+ h.contains("India")); 
  
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+ h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
		 
		 Set<Integer> a = new HashSet<Integer>();  
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));  
        Set<Integer> b = new HashSet<Integer>();  
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));  
  
        // To find union  
        Set<Integer> union = new HashSet<Integer>(a);  
        union.addAll(b);  
        System.out.print("Union of the two Set");  
        System.out.println(union);  
  
        // To find intersection  
        Set<Integer> intersection = new HashSet<Integer>(a);  
        intersection.retainAll(b);  
        System.out.print("Intersection of the two Set");  
        System.out.println(intersection);  
  
        // To find the symmetric difference  
        Set<Integer> difference = new HashSet<Integer>(a);  
        difference.removeAll(b);  
        System.out.print("Difference of the two Set");  
        System.out.println(difference); 
       		
    } 
} 