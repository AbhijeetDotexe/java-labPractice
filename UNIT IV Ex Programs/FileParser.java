import java.util.Scanner; 
import java.io.*; 
public class FileParser { 
 public void searchTok(String para){ 
 int count=0; 
String st=null; 
 try{ 
 FileWriter fw = new FileWriter("D:\\Java\\test1.txt"); 
fw.write(para); 
fw.close(); 
 }catch(Exception e){ 
 System.out.println("Exception found = "+e); 
 } 
 Scanner sc = new Scanner(System.in); 
 System.out.println("Enter a word to search:"); 
 String word = sc.nextLine(); 
try{ 
 RandomAccessFile access = new RandomAccessFile(new File("D:\\Java\\test1.txt"),"rw"); 
while((st=access.readLine())!=null){ 
 String st1[] = st.split(" "); 
for(String a:st1){ 
if(a.equals(word)){ 
 count++;
 } } } 
 System.out.println("Total count of word '"+word+"' in string is "+count); 
access.close(); 
 }catch(Exception e){ 
 System.out.println("Execption found = "+e); 
 } 
 } 
 public static void main(String[] args){ 
 String para = "Hello welcome to Java file handling."; 
 FileParser search = new FileParser(); 
search.searchTok(para); 
 } 
} 