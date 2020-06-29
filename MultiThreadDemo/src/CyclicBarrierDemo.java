import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {
    //https://codepumpkin.com/cyclicbarrier-java-concurrency-utilities/
    //bikers waiting for each other at some ref points then
    // filling gas and start again
    public static void main(String[] args) throws InterruptedException {
        //final  CyclicBarrier cb= new CyclicBarrier(4,new BA());
        final CyclicBarrier cb =
                new CyclicBarrier(4, new Runnable() {
                    public void run() {
                        System.out.println("All bikers arrived " +
                                ",lets fill petrol and move on");
                    }
                });

        ExecutorService es2 = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 9; i++) {
            Thread.sleep(1000);
            es2.submit(new Task2(cb));
        }
    }
}

class Task2 implements Runnable {
    CyclicBarrier cb2;

    public Task2(CyclicBarrier cb) {
        this.cb2 = cb;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(300);
            System.out.println(Thread.currentThread().getName() +
                    "is arrived and now waitimg at ref point");
            cb2.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}

//class BA implements Runnable{@Override
//public void run() {
//    System.out.println("All bikers arrived ,lets fill petrol and move on");
//}}
