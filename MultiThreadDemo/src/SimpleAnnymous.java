public class SimpleAnnymous {
    public static void main(String args[]) {

    Thread t1= new Thread(new Runnable() {
                 @Override
                public void run() {
                System.out.println("AnonymousRunnable");
                System.out.println("thread running is"+Thread.currentThread().getName());
                                 }
                                        });
        t1.start();
        System.out.println("thread running is"+Thread.currentThread().getName());

}}