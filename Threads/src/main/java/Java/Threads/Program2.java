package Java.Threads;

/*program to create multiple threads using runnable interface*/

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
class MultipleThreadRunnable implements Runnable{
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
public class Program2
{
    public static void main( String[] args )
    {
       MultipleThreadRunnable obj1=new MultipleThreadRunnable();
       MultipleThreadRunnable obj2=new MultipleThreadRunnable();
       Thread t1=new Thread(obj1);
       Thread t2=new Thread(obj2);
       t1.start();
       t2.start();
    }
}
