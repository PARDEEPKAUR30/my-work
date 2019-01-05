package exceptionhandling;
import java.lang.*;
import java.util.*;
class SynchronizedStatement implements Runnable{
public void run() {
	synchronized(this){	
	System.out.print(Thread.currentThread().getName()+":");
	System.out.print( "Hello child");
	try {
		Thread.currentThread().sleep(1000);}
		catch(InterruptedException ie){}
	System.out.println(" Welcome to run ");
	}
	System.out.println(Thread.currentThread().getName()+" out of Synchronized Block");
	}
	}
public class UseSynchronizedBlockForStatement {
public static void main(String[]arg) {
	SynchronizedStatement ss=new SynchronizedStatement();
	Thread t=new Thread(ss,"Thread 1");
	Thread t1=new Thread(ss,"Thread 2");
	t.start();
	t1.start();
	System.out.println("Hello Main ");
}}

