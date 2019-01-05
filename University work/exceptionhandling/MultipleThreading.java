package exceptionhandling;
import java.lang.*;

class multiple implements Runnable{
	public void run(){
		for(int i=1;i<5;i++) {
		System.out.println( i+": "+Thread.currentThread().getName());
	}}}

public class MultipleThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiple m= new multiple();
		Thread t= new Thread(m,"Thread t");
		Thread t1= new Thread(m,"Thread t1");
		Thread t2= new Thread(m,"Thread t2");
		t.start();
		t1.start();
		t2.start();
		for(int i=1;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
