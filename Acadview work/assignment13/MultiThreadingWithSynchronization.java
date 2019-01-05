package assignment13;
 
class MyThread implements Runnable{
  String name;
  	public synchronized void run() {
		System.out.println();
		System.out.println(Thread.currentThread().getName()+":");
		int j;
		if(Thread.currentThread().getName()=="Thread1") {
			j=1;}
		else {
			j=6;
		}
		if(Thread.currentThread().getName()=="Thread1") {
		for(int i=1;i<=500;i++) {
			if(i==j*100) {
				//System.out.print("**"+j);
				System.out.println();
				j=++j;
			}
			System.out.print(i+" ");}
		}
		else {
			for(int i=501;i<=1000;i++) {	
			if(i==j*100) {
				//System.out.print("**"+j);
				System.out.println();
				j=++j;
			}
			System.out.print(i+" ");
			}}
	
	}
}

public class MultiThreadingWithSynchronization {
public static  void main(String arg[]) {
	System.out.println(Thread.currentThread().getName()+": Main Thread starts here");

		MyThread mt=new MyThread();
		Thread t1=new Thread(mt,"Thread1");
		Thread t2=new Thread(mt,"Thread2");
		synchronized(MultiThreadingWithSynchronization.class) {
		t1.start();	
		t2.start();}
	
		System.out.println(Thread.currentThread().getName()+": Main Thread stops here");
 }}
