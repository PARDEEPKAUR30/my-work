package assignment13;

class PrintValue implements Runnable{
	public synchronized void run(){
		
		System.out.println(Thread.currentThread().getName()+": ");
		for(int i=1;i<=1000;i++) {
			if(i%100==0) {
				System.out.println();
			}
			System.out.print(i+", ");	
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				System.out.println("Thread is interrupted.");
			}
		}
		System.out.println();
	}
}

public class SynchronizationInMultithreading{/* extends Thread{
	public void run(){
		for(int i=0;i<=100;i++) {
			System.out.print(Thread.currentThread().getName()+": ");
			System.out.println(i);	
			/*try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				System.out.println("Thread is interrupted.");
			}
		}
	}*/
	public static void main(String[] args) { //throws InterruptedException{
		      System.out.println("Thread Main starts here.");
		      PrintValue p=new PrintValue();
                Thread t1=new Thread(p,"Thread1");
                Thread t2=new Thread(p,"Thread2");
                t1.start();
                t2.start();
                try {
               // t1.join();
                t2.join();}
                catch(InterruptedException ie) {
                	System.out.println("Thread has interrupted.");
                }
                System.out.println("Thread Main stops here.");
	}

}
