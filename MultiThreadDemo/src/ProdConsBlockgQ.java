import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
//https://www.youtube.com/watch?v=Vrt5LqpH2D0
//not running
public class ProdConsBlockgQ {
   static BlockingQueue<Integer> q = new ArrayBlockingQueue(10);

    public static void main(String[] args) throws InterruptedException{

        Thread producer= new Thread(new Runnable() {
            @Override
            public void run() {
               try{
                   produce();
               }
               catch(InterruptedException e){e.printStackTrace();}
            }
        }

        );

        Thread consumer= new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(700);
                    consume();
                }
                catch(InterruptedException e){e.printStackTrace();}
            }
        }

        );

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
  }// main end

    public static void produce() throws InterruptedException
    {
        Random r = new Random();//generates randon 0-100
        while(true)
        {
         q.put(r.nextInt(100));

        }
    }
    public static void consume() throws InterruptedException
    {
        Random r = new Random();//generates randon 0-100
        while(true)
        {Thread.sleep(100);
            if(r.nextInt(10)==0)
            { Integer no =q.take();
                System.out.println("taken value"+no);}
            q.put(r.nextInt(100));

        }
    }

}


