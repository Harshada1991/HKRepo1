  public class waitNotify {
//    durga 21.13
//    https://www.youtube.com/watch?v=2z218xjvw1M&list=PLd3UqWTnYXOkWZUcbW68CbN9fyPFQ0LDk&index=11
  //    java.lang.IllegalMonitorStateException
 //wrong prog..not running

      //correct prog waitNotify2.java

      public static void main(String[] args) throws InterruptedException{

        System.out.println("main");
    Thread t=new sumThread();
    t.start();
    t.wait();
}}
       class   sumThread extends Thread {
          public void run() {
              int sum = 0;
              System.out.println("hi");
              for (int i = 0; i < 100; i++) {
                  sum = +i;
              }
              this.notify();
          }
      }