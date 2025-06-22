package ThreadSafety.Reentrant;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Lock lock;
    private Count count;

    public Adder(Lock lock, Count count) {
        this.lock = lock;
        this.count=count;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            System.out.println("T1 printing");
//            lock.lock();
            this.count.add(i);
//            lock.unlock();
        }
    }
}
