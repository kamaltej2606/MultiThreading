package Java.Threads;

/*program to create multiple threads using thread class*/

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
class  ThreadJoin extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i+" "+Thread.currentThread().getId() +" " + Thread.currentThread().getName());
		}
	}
}
public class Program7
{
    public static void main( String[] args ) throws Exception
    {
       ThreadJoin t1=new ThreadJoin();
       ThreadJoin t2=new ThreadJoin();
       ThreadJoin t3=new ThreadJoin();
       t1.start();
       t1.join();
       t3.start();
       t3.join();
       t2.start();
       t2.join();
      
    }
}
