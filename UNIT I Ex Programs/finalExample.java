//if the keyword final is used with class name the class cannot be exteded
class FinalDemo {
     public final void display() {
      System.out.println("This is a final method.");}

}

class finalExample extends FinalDemo {
  // try to override final method
  public final void display() {
    System.out.println("The final method is overridden.");
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.display();
// create a final variable
    final int AGE = 32;
 // try to change the final variable, compile time error
    AGE = 45;
    System.out.println("Age: " + AGE);

  }
}

