package Java.Threads;


/*Thread Priority for MultipleThreads using Thread Class*/

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
class ThreadPriority extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
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
public class Program3 
{
    public static void main( String[] args )
    {
       ThreadPriority t1=new ThreadPriority();
       ThreadPriority t2=new ThreadPriority();
       t1.setPriority(1);
       t2.setPriority(4);
       t1.start();
       t2.start();
    }
}
