import java.io.*; 
import java.io.IOException; 
import java.util.Scanner;
class CreateFile 
{ public static void main(String[] args) throws IOException 
	{ Scanner s=new Scanner(System.in);
	System.out.println("Enter a statement you want to store in a file:");
		// Accept a string 
		String str = s.nextLine(); 
		// attach a file to FileWriter 
		FileWriter fw=new FileWriter("targetfile.txt",true); 
		// read character wise from string and write  into FileWriter 
		for (int i = 0; i < str.length(); i++) 
			fw.write(str.charAt(i)); 
		System.out.println("Writing successful"); 
		//close the file 
		fw.close(); 	
		// variable declaration 
        int ch; 
        // check if File exists or not 
        try
        { FileReader fr = new FileReader("targetfile.txt"); 
			// read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
			fr.close();} 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        }       
        // close the file 
         } }
