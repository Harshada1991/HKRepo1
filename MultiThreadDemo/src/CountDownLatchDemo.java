import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
//import java.util.concurrent

public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {
      // CountDownLatchDemoCountDownLatchDemo();
        ExecutorService es =Executors.newFixedThreadPool(5);
        CountDownLatch cl= new CountDownLatch(5);

        for(int i=0;i<5;i++)
        {

        es.submit(new Task(cl));}

        try{Thread.sleep(500);
            cl.await();} catch(InterruptedException e){e.printStackTrace();
            System.out.println("here b4 submit");}
//        try{Thread.sleep(2000);
//            cl.await();} catch(InterruptedException e){e.printStackTrace();
//            System.out.println("here");}

        System.out.println(es.isTerminated());
        System.out.println(es.isShutdown());
        System.out.println("came here after count=0");
        es.shutdownNow();
        System.out.println(es.isShutdown());

       // es.shutdown();

  }
}

class Task implements Runnable{
    CountDownLatch clo;
    public Task(CountDownLatch c)
    {this.clo=c;}
    public void run(){ System.out.println("inside Runnable of thread");

        try{Thread.sleep(2000);}catch(InterruptedException ex){
            System.out.print("InterruptedException");
            System.out.println("run");
        }
        clo.countDown();
        System.out.println(Thread.currentThread().getName()+"deremented count by 1");

    }
}

//  the correct case- when no of = count in the CLO anf i=count
//