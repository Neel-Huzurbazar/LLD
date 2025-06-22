package ThreadSafety.Reentrant.Semaphore.ProducerConsumer;

import java.sql.Connection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue store=new ConcurrentLinkedQueue();
        Semaphore producer=new Semaphore(4);
        Semaphore consumer=new Semaphore(0);

        Producer p1=new Producer(producer,consumer,store);
        Producer p2=new Producer(producer,consumer,store);
        Producer p3=new Producer(producer,consumer,store);
        Producer p4=new Producer(producer,consumer,store);

        Consumer c1=new Consumer(producer,consumer,store);
        Consumer c2=new Consumer(producer,consumer,store);
        Consumer c3=new Consumer(producer,consumer,store);

        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        Thread t3=new Thread(p3);
        Thread t4=new Thread(p4);
        Thread t5=new Thread(c1);
        Thread t6=new Thread(c2);
        Thread t7=new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

    }
}
