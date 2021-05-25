package Java.Threads;

/*access a shared variable in these multiple threads (like incrementing count once a thread executes run() 
  method and increment), making sure at once only one of the thread can have 
  such access (using synchronized block)*/

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")

class Counter{
	int count=0;
	public synchronized void increment() {
		count=count+1;
	}
}

class Thread1 implements Runnable{
	Counter c;
	Thread1(Counter c){
		this.c=c;
	}
	public void run() {
		for(int i=0;i<10000;i++) {
			c.increment();
		}
	}
}

class Thread2 implements Runnable{
	Counter c;
	Thread2(Counter c){
		this.c=c;
	}
	public void run() {
		for(int i=0;i<10000;i++) {
			c.increment();
		}
	}
}

public class Program5 {
     public static void main(String[] args) throws Exception {
    	 Counter c1=new Counter();
    	 Thread1 obj1=new Thread1(c1);
    	 Thread t1=new Thread(obj1);
    	 Thread2 obj2=new Thread2(c1);
    	 Thread t2=new Thread(obj2);
    	 t1.start();
    	 t2.start();
    	 t1.join();
    	 t2.join();
    	 System.out.println(c1.count);
     }
}
