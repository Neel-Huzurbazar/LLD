package ThreadSafety.Reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrantlock {
    public static void main(String[] args) throws InterruptedException {
        Count c=new Count();
        Lock lock=new ReentrantLock();
        Adder add=new Adder(lock,c);

        Subtractor subtractor=new Subtractor(lock,c);

        Thread t1=new Thread(add);
        Thread t2=new Thread(subtractor);

        t2.start();
        t2.join();
        t1.start();
        t1.join();
        System.out.println(c.val);
    }
}
