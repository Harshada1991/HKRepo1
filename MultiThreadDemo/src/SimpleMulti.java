import java.lang.Runnable;
import java.lang.Thread;
public class SimpleMulti {

    class RunnableDemo implements Runnable {
        @Override
        public void run() {
            System.out.println("runnable");
        }


    }

    public static void main(String args[]) {
        Thread t1 = new Thread();
        t1.start();
    }

}