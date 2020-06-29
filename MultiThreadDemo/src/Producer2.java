import java.util.Queue;
import java.util.Random;

public class Producer2 implements Runnable {

    private Queue<Integer> sharedQ ;
    private final int MAX_SIZE=5;

    Producer2(Queue<Integer> sharedQ){this.sharedQ=sharedQ;}
    @Override
    public void run() {
        while(true)
        {
            synchronized (sharedQ)
            {
                if(sharedQ.size()==5)
                {
                    System.out.println("since size =5 , " +
                   "producer will release lock and wait for notify signal");
                    try{sharedQ.wait();}catch (InterruptedException e){
                       e.printStackTrace();
                    }
                }
                Random r= new Random();
               int data= r.nextInt(MAX_SIZE);
               sharedQ.add(data);
                System.out.println("produced data = "+data);
                sharedQ.notify();
            }//end synch.
        }  //end while



    }}