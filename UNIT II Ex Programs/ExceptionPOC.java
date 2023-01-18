import java.util.Scanner;

class InputMismatchException{
	
	/*public void excep(){
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10:");
		try{
			num = sc.nextInt();
			System.out.println("Number you have entered = "+num);
		}catch(Exception e){
			System.out.println("Exception occured "+e);
		}finally{
			System.out.println("Finally block executed");
		}
		 
	}*/
	
	public int excep() throws Exception{
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10:");
		num=sc.nextInt();
		return num;
	}
}

class ExceptionPOC{
	public static void main(String[] args){
		InputMismatchException i = new InputMismatchException();
		try{
			System.out.println(i.excep());
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);		
		}
	}
}
