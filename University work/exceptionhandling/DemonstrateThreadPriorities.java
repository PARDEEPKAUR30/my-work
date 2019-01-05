package exceptionhandling;
class Priorities implements Runnable{
	public void run() {
		//Thread.yield();
		for(int i=0;i<8;i++) {
		System.out.println("Priorty of Child thread is: "+Thread.currentThread().getPriority());
	}}
}

public class DemonstrateThreadPriorities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priorities p=new Priorities();
		Thread t=new Thread(p);
		Thread t1=new Thread(p);
		t.setPriority(10);
		//t1.setPriority(7);
		t.start();
		//t1.start();
		Thread.currentThread().setPriority(1);
		for(int i=0;i<8;i++) {
		System.out.println("Priorty of Main thread is: "+Thread.currentThread().getPriority());
	}}

}
