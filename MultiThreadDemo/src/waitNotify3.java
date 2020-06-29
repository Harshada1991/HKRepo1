import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
//https://medium.com/@mr.anmolsehgal/multi-threading-producer-consumer-pattern-using-wait-notify-3dde8fd49f65
//
//code works
//can also do
//https://www.java67.com/2012/12/producer-consumer-problem-with-wait-and-notify-example.html

public class waitNotify3 {

    final static Queue<Integer> q1 = new LinkedList<Integer>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main");
        Producer1 p11 = new Producer1();
        Consumer1 c11 = new Consumer1();
        Runnable r1 = new Runnable() {
            public void run() {
                p11.produce();


            }
        };

        Runnable r2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("in cons");
                c11.consume();
            }
        });

        System.out.println("after waiting ");

        new Thread(r1).start();
        new Thread(r2).start();
    }

    static class Producer1 {
        void produce() {
            synchronized (q1) {
                System.out.println("in prod");
                Random ran = new Random();
                q1.add(ran.nextInt(100));
               // System.out.println("random no is"+ran.nextInt());
                q1.stream().forEach(System.out::println);
                System.out.println("after producer notify");
                q1.notify();
            }
        }
    }

    static class Consumer1 {
        void consume() {
            synchronized (q1) {

                try {
                    while (q1.size() == 0)
                        this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer val = q1.remove();
                System.out.println("after consu removes"+val);
                q1.stream().forEach(System.out::println);
            }
        }
    }

}
            //main







//Always remember that one th does modification of code and other th
//        waits to get modified data
//which does modificaion on data is the owner of data
//,it calls notify() after completeng its work
//
//th which waits for modified data calls wait()
//
//here sumThread2 did modification on data
//amd main th waited


//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

