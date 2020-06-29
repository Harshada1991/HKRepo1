//I have modified your example slightly.
//        Now use the example with keepRunning as volatile
//and non volatile member :

class TestVolatile extends Thread{

    volatile boolean keepRunning = true;

    public void run() {
        long count=0;
        while (keepRunning) {
            count++;
            System.out.println("in run");
        }

        System.out.println("Thread terminated." + count);
    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile t = new TestVolatile();
        t.start();
        Thread.sleep(1000);
        System.out.println("after sleeping in main");
        t.keepRunning = false;
        t.join();
        System.out.println("keepRunning set to " + t.keepRunning);
    }
}