import java.io.*;
import java.util.*;

class FileReadingWithList{
	
	public static void main(String[] args){
		BufferedReader br = null;
		String s=null;
		List a_list = new ArrayList();
		List<String> l_list = new LinkedList<String>();
		int count=0;
		int j = Integer.parseInt(args[1]);
		char ch=' ';
		String s1="";
		try{
			br = new BufferedReader(new FileReader(new File(args[0])));
			while((s=br.readLine())!=null){
				for(int i=0;i<s.length();i++){
					ch=s.charAt(i);
					s1=s1+Character.toString(ch);
				}
				a_list.add(s1);
				l_list.add(s1);
				count++;
				if(count == j){
					break;
				}
			}
			System.out.println("Through Array List without generics");
			Iterator a_iter = a_list.iterator();
			while(a_iter.hasNext()){
				String s2 = (String)a_iter.next();
				System.out.println(s2);		
			}
			System.out.println("-----------------------------");
			System.out.println("Through Linked List with generics");		
			for(String s3:l_list){
				System.out.println(s3);
			}			
		}catch(Exception e){
			System.out.println("Exception found = "+e);
		}					
	}
}
