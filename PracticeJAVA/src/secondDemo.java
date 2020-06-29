import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class secondDemo {
    public static void main(String[] args) {
        ExecutorService ser = Executors.newFixedThreadPool(3);
           ser.execute(new Task(1,10));
            ser.execute(new Task(11,20));
            ser.execute(new Task(21,30));
    }
}
    class Task implements Runnable{
    int start;
    int end;

    public Task(int start,int end){this.start=start;this.end=end;}
    @Override
        public void run(){
        for(int i = start; i < end; i++)
        System.out.println(i);
    }

    }
