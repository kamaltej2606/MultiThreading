package Java.Threads;

/*Thread Priority for MultipleThreads using Runnable Interface*/

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
class ThreadPriorityRunnable implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i+" "+Thread.currentThread().getId());
		}
	}
}
public class Program4
{
    public static void main( String[] args )
    {
       ThreadPriorityRunnable obj1=new ThreadPriorityRunnable();
       ThreadPriorityRunnable obj2=new ThreadPriorityRunnable();
       Thread t1=new Thread(obj1);
       Thread t2=new Thread(obj2);
       t1.setPriority(Thread.MIN_PRIORITY);
       t2.setPriority(Thread.MAX_PRIORITY);
       t1.start();
       t2.start();
    }
}
