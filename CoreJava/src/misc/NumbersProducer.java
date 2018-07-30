package misc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class NumbersProducer implements Runnable {

    private final BlockingQueue<Integer> numbersQueue;
    private final int poisonPill;
    private final int poisonPillPerProducer;

    NumbersProducer(BlockingQueue<Integer> numbersQueue, int poisonPill, int poisonPillPerProducer) {
        this.numbersQueue = numbersQueue;
        this.poisonPill = poisonPill;
        this.poisonPillPerProducer = poisonPillPerProducer;
    }

    public void run() {
        try {
        	System.out.println("In Run");
            generateNumbers();
        } catch (InterruptedException e) {
            Thread.currentThread()
                .interrupt();
        }
    }

    private void generateNumbers() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
        	
        	int j= ThreadLocalRandom.current()
                    .nextInt(100);
        	System.out.println("int i :" +i);
        	//System.out.println(j);
            numbersQueue.put(j);
        }
        for (int j = 0; j < poisonPillPerProducer; j++) {
        	System.out.println("Queue Size: "+numbersQueue.size());
            numbersQueue.put(poisonPill);
        }
    }
}
