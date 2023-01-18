import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
// Set of Person objects
public class PersonCollectionSet {
   public static void main(String[] args) {
      Set<Person> personSet = new HashSet<>();
      personSet.add(new Person("Peter", 21));
      personSet.add(new Person("Paul", 18));
      personSet.add(new Person("John", 60));
      System.out.println(personSet);  //[John(60), Peter(21), Paul(18)]
         // Unlike List, a Set is NOT ordered
      for (Person p : personSet) p.sayHello();
      //John says hello
      //Peter says hello
      //Paul says hello
      // Set does not support duplicate elements
      System.out.println(personSet.add(new Person("Peter", 21))); 
	  //false
	  Scanner s=new Scanner(System.in);
	  System.out.println("Hello, What is your name:");
	  String name=s.nextLine();
	  System.out.println("Hello,"+name+" What is your age:");
	  Integer i=s.nextInt();
	  personSet.add(new Person(name,i));
	  System.out.println(personSet);
	  
   }}