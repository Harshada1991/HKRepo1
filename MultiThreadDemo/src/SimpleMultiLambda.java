//import java.lang.Thread;

public class SimpleMultiLambda{
 public static void main(String args[]) {
        Runnable r1 = () -> {System.out.println("this is run method");};
        new Thread( r1).start();
    }
}

//type 1
//        Runnable runnable = () -> {
//        // your code here ...
//        };
//        Thread t = new Thread(runnable);
//        t.start();
//
//Type 2
//        Thread t = new Thread(() -> {
//        // your code here ...
//        });
//
//Type 3
//        new Thread(() -> // your code here).start();