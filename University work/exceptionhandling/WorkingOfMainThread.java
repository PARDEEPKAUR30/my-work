package exceptionhandling;
public class WorkingOfMainThread extends Thread {
public static void main( String[]arg) {
	 WorkingOfMainThread t= new WorkingOfMainThread();
	//t.start();
	//t.setName("Thread 1");
	t.run();
	}
	public void run(){
	System.out.println("Now you are in "+Thread.currentThread().getName());
	   for(int i=0; i<=10;i++) {
		   System.out.println(i);  }
	   }
	}



