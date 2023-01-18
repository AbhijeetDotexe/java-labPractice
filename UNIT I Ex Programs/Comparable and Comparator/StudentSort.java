import java.util.*; 
 
class Student {
    private int id;
    private String name;
    private int age;
 
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    @Override
    //Override toString method to return Student details
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age +"]";
    }
 
}
 
public class StudentSort {  
 
    public static void main(String args[]) 
    { 
        //Creating Student list
        ArrayList<Student> stuList = new ArrayList<Student>(); 
 
        //Adding Student elements
        stuList.add(new Student(1, "Himanshi", 32));
        stuList.add(new Student(4, "Amani", 33));
        stuList.add(new Student(3, "Swati", 33));
        stuList.add(new Student(2, "Prabhjot", 31));
 
        //Print array elements
        System.out.println("List before sorting: ");
        for(Student student : stuList){  
            System.out.println(student);  
        }  
 
        //Sorting list elements
        Collections.sort(stuList);  
 
        //Print array elements
        System.out.println("List after sorting: ");
        for(Student student : stuList){  
            System.out.println(student);  
        } 
    }  
}