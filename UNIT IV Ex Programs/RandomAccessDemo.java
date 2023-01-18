// Java Program illustrating use of io.RandomAccessFile class methods 
// read(), read(byte[] b), readBoolean(), readByte(), readInt() 
// readFully(byte[] b, int off, int len), readFully(), readFloat() 
// readChar(), readDouble(), 

import java.io.*; 
public class RandomAccessDemo 
{ public static void main(String[] args) 
	{ try
		{ double d = 1.5; 
			float f = 14.56f; 
			// Creating a new RandomAccessFile 
			RandomAccessFile g = new RandomAccessFile("test.txt", "rw"); 
			// Writing to file 
			g.writeUTF("Hello This is a Random Access File."); 
			// File Pointer at index position - 0 
			g.seek(0); 
			// read() method : 
			System.out.println("Use of read() method : " + g.read()); 
			g.seek(0); 
			byte[] b = {1, 2, 3,4,5,6,7,8,9}; 
			// Use of .read(byte[] b) method : 
			System.out.println("Use of .read(byte[] b) : " + g.read(b)); 
			// readBoolean() method : 
			System.out.println("Use of readBoolean() : " + g.readBoolean()); 
			// readByte() method : 
			System.out.println("Use of readByte() : " + g.readByte()); 
			g.writeChar('c'); 
			g.seek(0); 

			// readChar() : 
			System.out.println("Use of readChar() : " + g.readChar()); 

			g.seek(0); 
			g.writeDouble(d); 
			g.seek(0);
			// read double 
			System.out.println("Use of readDouble() : " + g.readDouble()); 
			g.seek(0); 
			g.writeFloat(f); 
			g.seek(0); 
			// readFloat() : 
			System.out.println("Use of readFloat() : " + g.readFloat()); 

			g.seek(0); 
			// Create array upto geek.length 
			byte[] arr = new byte[(int) g.length()]; 
			// readFully() : 
			g.readFully(arr); 
			
			String str1 = new String(arr); 
			System.out.println("Use of readFully() : " + str1); 

			g.seek(0); 
			
			// readFully(byte[] b, int off, int len) : 
			g.readFully(arr, 0, 8); 
			
			String str2 = new String(arr); 
			System.out.println("Use of readFully(byte[] b, int off, int len) : " + str2); 
		} 
		catch (IOException ex) 
		{ 
			System.out.println("Something went Wrong"); 
			ex.printStackTrace(); 
		} 
	} 
} 
