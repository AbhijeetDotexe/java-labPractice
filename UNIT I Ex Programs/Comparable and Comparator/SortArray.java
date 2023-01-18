import java.util.*; 
public class SortArray {  
 
    public static void main(String args[]) 
    { 
        //Creating array of Primitive Type
        int[] intArray = {15,93,10,50, 44};
 
        //Print array elements
        System.out.println("Int Array before sorting: " + Arrays.toString(intArray));
 
        //Sorting array elements
        Arrays.sort(intArray);
 
        //Print array elements
        System.out.println("Int Array after sorting: " + Arrays.toString(intArray));
 
        //Creating String array
        String[] strArray = {"java", "c", "php", "oracle", "sql"};
 
        //Print array elements
        System.out.println("String Array before sorting: " + Arrays.toString(strArray));
 
        //Sorting array elements
        Arrays.sort(strArray);
 
        //Print array elements
        System.out.println("String Array after sorting: " + Arrays.toString(strArray));
 
        //Creating list of Wrapper class objects
        List<String> strList = new ArrayList<>();
 
        //Adding elements to list
        strList.add("java");
        strList.add("c");
        strList.add("php");
        strList.add("oracle");
        strList.add("sql");
 
        //Print array elements
        System.out.println("String List before sorting: " + strList);
 
        //Sorting list elements
        Collections.sort(strList);
 
        //Print array elements
        System.out.println("String List after sorting: " + strList);
    }  
}