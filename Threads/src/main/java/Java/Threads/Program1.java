package Java.Threads;

/*program to create multiple threads using thread class*/

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
class MultipleThread extends Thread{
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
public class Program1 
{
    public static void main( String[] args )
    {
       MultipleThread t1=new MultipleThread();
       MultipleThread t2=new MultipleThread();
       t1.start();
       t2.start();
    }
}
