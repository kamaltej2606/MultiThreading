package Java.Threads;

/*access a shared variable in these multiple threads (like incrementing count once a thread executes run() 
  method and increment), making sure at once only one of the thread can have 
  such access (using synchronized block)*/

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")

class Counter1{
	int count=0;
	public synchronized void increment() {
		count=count+1;
	}
	
}

class ThreadStatus1 implements Runnable{
	Counter1 c;
	ThreadStatus1(Counter1 c){
		this.c=c;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			c.increment();
			try {Thread.sleep(500);}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getId() + " "+ Thread.currentThread().getState());
		}
		
	}
	
}

class ThreadStatus2 implements Runnable{
	Counter1 c;
	ThreadStatus2(Counter1 c){
		this.c=c;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			c.increment();
			
			try {Thread.sleep(500);
			     
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getId() + " "+ Thread.currentThread().getState());
		}
	}
}

public class Program6 {
     public static void main(String[] args) throws Exception {
    	 Counter1 c1=new Counter1();
    	 ThreadStatus1 obj1=new ThreadStatus1(c1);
    	 Thread t1=new Thread(obj1);
    	 ThreadStatus2 obj2=new ThreadStatus2(c1);
    	 Thread t2=new Thread(obj2);
    	 System.out.println(t1.getId() + " "+ t1.getState());
    	 System.out.println(t2.getId() + " "+ t2.getState());
    	 t1.start();
    	 t2.start();
    	 t1.join();
    	 t2.join();
    	 System.out.println(t1.getId() + " "+ t1.getState());
    	 System.out.println(t2.getId() + " "+ t2.getState());
    	 System.out.println(c1.count);
     }
}
