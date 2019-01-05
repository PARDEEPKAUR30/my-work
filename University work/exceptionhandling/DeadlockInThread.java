package exceptionhandling;
import java.lang.*;
class Deadlock  implements Runnable{
	int n;
public synchronized void run() {
	System.out.println( "Start process in run ");
for(int i=0;i<5;i++) {
	System.out.println(i);
	n=i;
}
System.out.println("notify from run");
   this.notify();
	}}


public class DeadlockInThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deadlock d=new Deadlock();
		Thread t=new Thread(d);	
		t.start();
		try {
			System.out.println("call to sleep from main");
			Thread.currentThread().sleep(5000);
	 synchronized(t) {		
			System.out.println("call to wait from main");
		t.wait();}
		System.out.println("main accept notify from run");
		System.out.println("Last printed number in run is: "+d.n);
		}
		catch(InterruptedException ie) {
			}
		catch(IllegalMonitorStateException i) {}
		}}

