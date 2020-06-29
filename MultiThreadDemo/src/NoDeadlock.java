public class NoDeadlock {
    public static void main(String args[]) throws InterruptedException {
     String s1="harsh";
     String s2="ada";

    Thread t1= new Thread(new Runnable() {
             @Override

                    public void run ()
                {
                    synchronized (s1)
                    {   System.out.println("inside T1");
                        try
                        {Thread.sleep(100);
                        System.out.println("inside wait of T1");
                        }
                        catch(InterruptedException e)
                        {System.out.println("in excep"+e);}

                        synchronized (s2)
                        {System.out.println("inside Synchronize of S2");};
                    }
                }//run
                });

    Thread t2= new Thread(new Runnable() {
            @Override

            public void run ()
            {
                synchronized (s2)
                { try
                {Thread.sleep(100);}
                catch(InterruptedException e)
                {System.out.println("in excep"+e);}

                    synchronized (s1)
                    {System.out.println("inside Synchronize of S1");};
                }
            }
    });

    t2.start();
    t1.start();


                 }
}
