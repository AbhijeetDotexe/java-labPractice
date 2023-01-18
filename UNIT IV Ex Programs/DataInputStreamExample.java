import java.io.*;
public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        DataOutputStream dataOutputStream =
                new DataOutputStream(
                        new FileOutputStream("C:\\myFile.txt"));

        dataOutputStream.writeInt(123);
        dataOutputStream.writeFloat(123.45F);
        dataOutputStream.writeLong(789);

        dataOutputStream.close();

        DataInputStream dataInputStream =
                new DataInputStream(
                        new FileInputStream("C:\\myFile.txt"));

        int   int123     = dataInputStream.readInt();
        float float12345 = dataInputStream.readFloat();
        long  long789    = dataInputStream.readLong();

        dataInputStream.close();

        System.out.println("int123     = " + int123);
        System.out.println("float12345 = " + float12345);
        System.out.println("long789    = " + long789);
	
	InputStream input = new FileInputStream("C:\\myFile.txt");  
    DataInputStream inst = new DataInputStream(input);  
    int count = input.available();  
    byte[] ary = new byte[count];  
    inst.read(ary);  
    for (byte bt : ary) {  
      char k = (char) bt;  
      System.out.print(k+"-");  
    
}