//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
////correct code
//public class waitNotify2 {
//  static   Queue<Integer> q1 = new LinkedList<Integer>();
//
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("main");
//       new Producr().start();
//        new Consmr().start();
//
//            System.out.println("after waiting ");
//        }
//    }
//
//     class Producr extends Thread {
//        public void run() {
//            synchronized (q1) {
//                System.out.println("in prod");
//                Random ran = new Random(100);
//                q1.add(ran.nextInt());
//                System.out.println("after producer notify");
//                q1.notify();
//            }
//        }
//    }
//        class Consmr extends Thread {
//            public void run() {
//                System.out.println("in cons");
//
//                synchronized (q1) {
//
//                    try {
//                        this.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    while (q1.size() != 0) {
//                        Integer val = q1.remove();
//                    }
//                    System.out.println("after consu removes");
//
//                }
//            }
//        }
//    }
//
//
//
////Always remember that one th does modification of code and other th
////        waits to get modified data
////which does modificaion on data is the owner of data
////,it calls notify() after completeng its work
////
////th which waits for modified data calls wait()
////
////here sumThread2 did modification on data
////amd main th waited
//
//
////        try {
////            TimeUnit.SECONDS.sleep(3);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }