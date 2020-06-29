import java.util.concurrent.TimeUnit;

public class waitNotifyBEST {
    //correct code
        public static void main(String[] args) throws InterruptedException {

            System.out.println("main");
            Thread t = new sumThread3();
            t.start();
            synchronized (t) {
                System.out.println("before wait");
                t.wait(); //releases main th's lock on B and starts waitng...until the owner
                //=B notify().whn main goes to wait..
                // then child Th enter the lock
                System.out.println("after waiting ");
            }

        }
    }

    class sumThread3 extends Thread {
        int sum = 0;

        public void run() {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {

                System.out.println("hi in child th");
                for (int i = 0; i < 100; i++) {
                    sum += i;
                }
                System.out.println("sum is" + sum + "not going to notify main and thrn relese lock");
                this.notify();
            }
        }
    }

//Always remember that one th does modification of code and other th
//        waits to get modified data
//which does modificaion on data is the owner of data
//,it calls notify() after completeng its work
//
//th which waits for modified data calls wait()
//
//here sumThread2 did modification on data
//amd main th waited





