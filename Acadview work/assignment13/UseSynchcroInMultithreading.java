package assignment13;
class Function implements Runnable {
	String thread[]=new String[2];
	int z,i=1;
	public  void run() {
		z=0;
		System.out.println(Thread.currentThread().getName()+" is entered in run method. ");
		for(int j=0;j<2;) {
			if(Thread.currentThread().getName()!=thread[0]) {
			thread[j]=Thread.currentThread().getName();
			j=++j;
			}}
		synchronized(this) {
			//System.out.println(Thread.currentThread().getName()+" is entered in loop.");
		while(i<=1000){		
			try {
				Thread.currentThread().sleep(100);				
			}
			catch(InterruptedException ie) {
				System.out.println("Thread has interrupted.");
			}
			if(i%100==0) {
				System.out.println();
				System.out.println("Is "+thread[0] +" Alive:"+Thread.currentThread().isAlive());
				System.out.println("Is "+thread[1] +" Alive:"+Thread.currentThread().isAlive());
				}
			System.out.print(i+", ");
			i=++i;
				}}
		System.out.println();
		System.out.println("Is "+thread[0] +" Alive:"+Thread.currentThread().isAlive());
		System.out.println("Is "+thread[1] +" Alive:"+Thread.currentThread().isAlive());}
	}

public class UseSynchcroInMultithreading {

	public synchronized static void main(String[] args)throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" starts here.");
		Function f=new Function();
		Thread t1=new Thread(f,"Thread1");
		Thread t2=new Thread(f,"Thread2");	
		System.out.println("Thread1 is starting here.");
		t1.start();
		System.out.println("Thread2 is starting here.");
		t2.start();
		System.out.println("Is Thread1  Alive:"+t1.isAlive());
		System.out.println("Is Thread2  Alive:"+t2.isAlive());
		try {
		t2.join();
		}
		catch(InterruptedException ie) {
			System.out.println("Thread has interrupted.");
		}
		
		System.out.println(Thread.currentThread().getName()+" stops here.");
	}

}
