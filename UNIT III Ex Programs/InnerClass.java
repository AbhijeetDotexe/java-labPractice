public interface Animal 
 { 
// Abstract method does not have a body. 
   public void food(); // No body. 
 } 
public class Lion 
{ 
// Here, we are using an anonymous inner class that implements an interface Animal. 
 Animal a = new Animal() 
 { 
  public void food() 
  { 
    System.out.println("Lion eats flesh"); // Overriding food method of Interface Animal. 
  } 
 }; 
public void display() 
{ 
   a.food(); 
 } 
} 
public class InnerClass{ 
public static void main(String[] args) 
{ 
 Lion l = new Lion(); 
  l.display(); // 1st method to call an anonymous function by local class method. 
  l.a.food(); // 2nd method to call an anonymous function directly. 
    } 
}