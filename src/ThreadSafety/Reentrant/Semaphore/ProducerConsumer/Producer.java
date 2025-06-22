package ThreadSafety.Reentrant.Semaphore.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private Queue store;

    public Producer(Semaphore producerSemaphore, Semaphore consumerSemaphore, Queue store) {
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.store = store;
    }

    @Override
    public void run() {
        while(true)
        {
            System.out.println("Producer producing");
            try {
                producerSemaphore.acquire();
                store.add(new Object());
                consumerSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
