import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

//printEven and Odd in sequence
//even - by main th
//odd - by executors

public class ExecutorDemo {
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i += 2) {  //odd number generation
                try {
                    Thread.sleep(500);  //executors thred sleeping
                    System.out.print(i);
                    Thread.currentThread().setName("Odd");
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Executor e = Executors.newSingleThreadExecutor();  //creating a executor
        e.execute(r);  //submitting and executing the task
        for (int i = 0; i <= 10; i += 2) {  //even number generation
            try {
                Thread.sleep(500);  //main-thread sleeping
                System.out.println(i);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

}