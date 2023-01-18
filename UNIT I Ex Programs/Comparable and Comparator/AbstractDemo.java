package  p1;
// An example abstract class in Java 
abstract class Shape { 
    int color; 
  Shape(){System.out.println("Base class constructor called");}
    // An abstract function (like a pure virtual function in C++) 
    abstract void draw();  
} 
class Triangle extends Shape{
	Triangle(){super();System.out.println("Trianngle constructor called");}
	void draw(){System.out.println("Enter three sides of the triangle:");}
}
class AbstractDemo{
public static void main(String args[]){
// Uncommenting the following line will cause compiler error as the  
        // line tries to create an instance of abstract class. 
Shape s;
Triangle t=new Triangle();
s=new Triangle();
t.draw();
s.draw();
}}