package exceptionhandling;
import java.lang.*;
class Method implements Runnable{
	public void run() {
		for(int i=1;i<4;i++) {
		System.out.println(i+": "+Thread.currentThread().getName()+" Thread is alive: "+Thread.currentThread().isAlive());
		}}
}

public class IsAliveAndJoinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Method m=new Method();
         Thread t=new Thread(m,"Child");
         t.start();
         try {
         t.join();}
         catch(InterruptedException ie) {}      
         for(int i=1;i<4;i++) {
         System.out.println(i+": "+Thread.currentThread().getName()+" Thread is alive: "+Thread.currentThread().isAlive());
         }
         System.out.println("\n"+t.getName()+" Thread is alive: "+t.isAlive());
         }

}
