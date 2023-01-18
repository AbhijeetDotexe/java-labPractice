public class MultipleCatchBlocks{
public static void main(String[] args) {
try{
System.out.println("start of try block");
int num = 6/0;
}

catch(ArithmeticException e)
{
System.out.println("divide by zero exception ");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBounds Exception occurs");
}
catch(Exception e)
{
System.out.println("Any other excpetion");
}

System.out.println("end of try-catch block");
}
}