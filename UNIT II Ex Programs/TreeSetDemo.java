// Java program to demonstrate the working of a TreeSet. Implementation of a SortedSet interface that uses Tree for storag.
//The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided.
//The TreeSet implements a NavigableSet interface by inheriting AbstractSet class.No duplicate values allowed.
//Objects in a TreeSet are stored in a sorted and ascending order.
//TreeSet does not preserve the insertion order of elements but elements are sorted by keys.

import java.util.*; 
public class TreeSetDemo { 
	public static void main(String args[]) 
	{ 
		// Creating TreeSet and adding elements 
		TreeSet<String> ts = new TreeSet<String>(); 
         HashSet<String> hs=new HashSet<String>();
		ts.add("B"); 
		ts.add("A"); 
		ts.add("d"); 
		ts.add("D"); 
		ts.add("C"); 
		hs.add("Delhi");
		hs.add("Mumbai");
		hs.add("Rajasthan");
           System.out.println(ts);
		// Traversing elements 
		Iterator<String> itr = ts.iterator(); 
		while (itr.hasNext()) { 
			System.out.println(itr.next()); 
		} 
		Iterator<String> itr1 = hs.iterator(); 
		while (itr1.hasNext()) { 
			System.out.println(itr1.next()); 
		}
	} 
} 
