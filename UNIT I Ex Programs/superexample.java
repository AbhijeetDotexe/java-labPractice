class Animal {
public Animal(){System.out.println("Parent object");}
  // overridden method
  public void display(){
    System.out.println("I am an animal");
  }
}

class Dog extends Animal {
public Dog(){super();
System.out.println("Child object");}

  // to access the parent overriding method
  @Override
  public void display(){super.display();
    System.out.println("I am a dog");
  }

  public void printMessage(){
    display();
  }
}

class superexample {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.printMessage();
  }
}
