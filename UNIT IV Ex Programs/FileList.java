import java.io.File;
class FileList{
public static void main(String[] a)
{String dirname="C:/Java";
	File f=new File(dirname);
if(f.isDirectory()){
System.out.println("Directory of:"+dirname);}
 String[] files=f.list();
 for(String file:files)
 {System.out.println(file);
 }

}
}