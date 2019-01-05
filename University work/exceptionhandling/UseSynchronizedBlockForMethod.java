package exceptionhandling;
import java.lang.*;

import java.util.*;
class SynchronizedBlock implements Runnable{
	public synchronized void run()  {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("For "+Thread.currentThread().getName());
		System.out.println("Enter two integer numbers:");
		System.out.print("a= ");
		a=s.nextInt();
		System.out.print("b= ");
		b=s.nextInt();
		//System.out.println("a= "+a);
		//System.out.println("b= "+b);	
		System.out.println("sum is: "+ (a+b));
	}
}

public class UseSynchronizedBlockForMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedBlock sb= new SynchronizedBlock();
		Thread t=new Thread(sb,"Thread t");
		Thread t1=new Thread(sb,"Thread t1");
		t.start();
		t1.start();	
		t.run();
	}

}
