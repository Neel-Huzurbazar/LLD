package ThreadSafety.Reentrant.Semaphore.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private Queue store;

    public Consumer(Semaphore producerSemaphore, Semaphore consumerSemaphore, Queue store) {
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.store = store;
    }

    @Override
    public void run() {
        while(true)
        {
            System.out.println("Consumer consuming");
            try {
                consumerSemaphore.acquire();
                store.remove();
                producerSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
