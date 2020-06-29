import java.lang.Runnable;
import java.lang.Thread;
public class MutiThreadDemo implements Runnable {
      @Override
        public void run() {
            System.out.println("runnable q");

        }
        public static void main(String args[])
        { MutiThreadDemo r = new MutiThreadDemo();
            Thread t1 = new Thread(r);
            t1.start();
        }
    }

