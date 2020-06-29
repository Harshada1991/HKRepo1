import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConsMainClass {

    public static void main(String[] args) {
     //   BlockingQueue<Item> que= new ArrayBlockingQueue<10>();
        final Runnable producer= ()->{
                while(true)
                {
       //             que.put(createItem());
                }};
        new Thread(producer).start();
        new Thread(producer).start();//2 th

        final Runnable consumer= ()->{
            while(true)
            {
        //        que.take();
        //        process()i
            }};
        new Thread(consumer).start();
        new Thread(consumer).start();//2 th


    }
}
