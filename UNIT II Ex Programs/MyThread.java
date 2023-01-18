class MyThread
{
public static void main(String[] a)
{Runnable r=new Runnable(){ 
public void run(){System.out.println("Child Thread");}};
Thread t=new Thread(r);
t.start();
System.out.println("Main Thread");
}
}