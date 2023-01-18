// java program to demonstrate need of try-catch clause 
  
class Excep { 
    public static void main (String[] args) { 
        try{  
        // array of size 4. 
        int[] arr = new int[4]; 
       
        // this statement causes an exception 
        int i = arr[3]; }
		catch(ArrayIndexOutOfBoundsException a)
		{System.out.println("You are trying to access an array index beyond the array size");}
         finally{ 
        // the following statement will never execute 
		 System.out.println("Hi, I want to execute"); }
    } 
} 
