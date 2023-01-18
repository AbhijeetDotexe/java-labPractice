import java.io.File;  
public class FileDemo {  
    public static void main(String[] args) {  
  
        String path = "";  
        boolean bool = false;  
        try { static void p(String s){System.out.println(s);} 
            // createing  new files  
            File file  = new File("testFile1.txt");  
            file.createNewFile();  
            System.out.println("Created file"+file);  
			p("File Name:"+f1.getName());
			p("Path:"+f1.getPath());
			p("Abs path:"+f1.getAbsolutePath());
			p("Parent"+f1.getParent());
			p(f1.canWrite()?"is writable":"is not writable");
			p(f1.canRead()?"is Readable":"is not readable");
            // createing new canonical from file object  
            File file2 = file.getCanonicalFile();  
            // returns true if the file exists  
            System.out.println(file2);  
            bool = file2.exists();  
            // returns absolute pathname  
            path = file2.getAbsolutePath();  
            System.out.println(bool);  
            // if file exists  
            if (bool) {  
                // prints  
                System.out.print(path + " Exists? " + bool);  
            }  
        } catch (Exception e) {  
            // if any error occurs  
            e.printStackTrace();  
        }  
    }  
} 