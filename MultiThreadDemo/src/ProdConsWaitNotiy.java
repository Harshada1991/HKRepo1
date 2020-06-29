import java.util.LinkedList;
import java.util.Queue;

public class ProdConsWaitNotiy {
    public static void main(String[] args) {
         Queue<Integer> sharedQ = new LinkedList<>() ;
        Producer2 p= new Producer2(sharedQ);
        Consumer2 c= new Consumer2(sharedQ);

        Thread t1= new Thread(p);
        t1.start();
        Thread t2= new Thread(c);
        t2.start();

    }
}
