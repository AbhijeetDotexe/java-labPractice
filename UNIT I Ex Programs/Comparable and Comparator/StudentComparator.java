import java.util.*; 
import java.io.*;  
 
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
 
    //Compare based on id
    public static Comparator<Student> IdComparator = new Comparator<Student>() {
 
        @Override
        public int compare(Student stu1, Student stu2) {
            return (int) (stu1.getId() - stu2.getId());
        }
    };
 
    //Compare based on name
    public static Comparator<Student> NameComparator = new Comparator<Student>() {
 
        @Override
        public int compare(Student stu1, Student stu2) {
            return stu1.getName().compareTo(stu2.getName());
        }
    };
 
    @Override
    //Override toString method to return Student details
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age +"]";
    }
 
}
 
public class StudentComparator {  
 
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
 
        //Sorting list elements by Student Id
        Collections.sort(stuList, Student.IdComparator);  
 
        //Print array elements
        System.out.println("List after sorting by Student Id: ");
        for(Student student : stuList){  
            System.out.println(student);  
        } 
 
        //Sorting list elements by Student Name
        Collections.sort(stuList, Student.NameComparator);  
 
        //Print array elements
        System.out.println("List after sorting by Student Name: ");
        for(Student student : stuList){  
            System.out.println(student);  
        } 
    }  
}