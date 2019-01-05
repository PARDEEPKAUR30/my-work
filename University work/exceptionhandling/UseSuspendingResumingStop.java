package exceptionhandling;
import java.lang.*;
class UsingMethods implements Runnable{
	public void run() {	
		System.out.println("now you are in "+ Thread.currentThread().getName());			
}}
public class UseSuspendingResumingStop { 
public static void main(String[]arg) {
	UsingMethods um=new UsingMethods();
	Thread t=new Thread(um,"Thread1");
	Thread t1=new Thread(um,"Thread2");	
	Thread t2=	new Thread(um,"Thread2");	
   System.out.println("Thread1 is staring here");
	t.start();
	System.out.println("Thread1 is suspending here");
	t.suspend();
	System.out.println("Thread2 is starting here");
	t1.start();	
   System.out.println("Now you are in main");
   System.out.println("Thread3 is staring here");
      t2.start();
      System.out.println("Thread3 is stoping here");
      t2.stop();
		try {
			System.out.println("Main is going to sleep for one second");
			Thread.currentThread().sleep(1000);
		}
		catch(InterruptedException ie){	}
		System.out.println("Main is out of sleep");
		System.out.println("Thread1 is resuming here");
		t.resume();
		}
}
