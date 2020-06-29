import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        Semaphore s = new Semaphore(1);
        MyThread t1 = new MyThread(s, "first permitted thread");
        MyThread t2 = new MyThread(s, "Second permitted thread");
        t1.run();
        t2.run();

        t1.join();
        t2.join();
    }
}

class Shared {
    static int count = 0;
}

class MyThread extends Thread {
    Semaphore sem;
    String threadName;

    public MyThread(Semaphore sem, String threadName) {
        this.sem = sem;
        this.threadName = threadName;
    }

    public void run() {
        try {
            if (threadName == "first permitted thread") {
                System.out.println("first th  trying to enter semaphore");
                sem.acquire();
                //sem.acquire(2); aquires 2 permits at a time..correct
                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(Shared.count);
                }
                sem.release();
                //sem.release(3);  will release 3 permits -is correct
                System.out.println("first th  exited  semaphore");
                //   Thread.sleep(1000);

            } else {
                System.out.println("Second th  trying to enter semaphore");
                sem.acquire();
                for (int i = 0; i < 5; i++) {
                    Shared.count--;
                    System.out.println(Shared.count);
                }
                sem.release();
                System.out.println("Second th  exited  semaphore");
                //   Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//AT a tie ony one thread is entering semaphore
