package ThreadSafety.Reentrant;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Lock lock;
    private Count count;

    public Subtractor(Lock lock, Count count) {
        this.lock = lock;
        this.count=count;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            System.out.println("T2 printing");
            this.count.subtract(i);
        }
    }
}
