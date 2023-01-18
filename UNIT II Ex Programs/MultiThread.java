public class MultiThread extends Thread {
String st;//name of thread
Thread t;//
MultiThread(String th){st=th;
t=new Thread(this, st);
System.out.println("New Thread:"+t);
t.start();//start the thread
}
//entry point of second thread
public void run() {
System.out.println("Thread running");
for (int i = 1; i <= 5; i++) {
	try{
System.out.println(" Thread name = "+ Thread.currentThread().getName());
Thread.sleep(1000);
}
catch(InterruptedException e)
{System.out.println(e+"interrupted");}
System.out.println("Child thread Exiting");
}}
public static void main(String[] args) {
MultiThread t1 = new MultiThread("First thread");
t1.start();

MultiThread t2 = new MultiThread("Second tHread");
t2.start();

MultiThread t3 = new MultiThread("Third Thread");
t3.start();
}
}