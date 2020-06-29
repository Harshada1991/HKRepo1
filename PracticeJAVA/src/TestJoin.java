public class TestJoin {
    public static void main(String[] args) {
        myApp run = new myApp();
        Thread th = new Thread(run);
        th.start();
        System.out.println("th is alive = "+th.isAlive());
        System.out.println(Thread.currentThread().getName());
        System.out.println(th.getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println("th is alive = "+th.isAlive());
        try{System.out.println("in join");
        th.join(2000); //start second thread after waiting for 2 seconds or if it's dead
        //Thread.sleep(1000);
        } catch(InterruptedException e){

        }
        //join will first finish the execution of th(on which its called)
        //then main th will execute

        System.out.println(Thread.currentThread().getName());
        System.out.println("th is alive = "+th.isAlive());

    }

}
class myApp implements Runnable{
    @Override
    public void run(){
        System.out.println("inside run"+Thread.currentThread().getName());
        try{
            System.out.println("in run of th1");
        Thread.sleep(10000);
            System.out.println("exiting run of th1");}
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread ended"+Thread.currentThread().getName());

    }

}
