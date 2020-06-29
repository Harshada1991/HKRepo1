import java.lang.Runnable;
import java.lang.Thread;
public class SimpleTest implements Runnable {
    @Override
    public void run() {
        System.out.println("runnable q");
    }
    public void start()
    {
        System.out.println("harshhuuu"); //wnt go inside it
    }

    public static void main(String args[])
    { SimpleTest r = new SimpleTest();
        Thread t1 = new Thread(r);
        t1.start();
    }
}

