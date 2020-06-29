//import java.lang.Runnable;
//import java.lang.Thread;
//public class MultithreadDeadlock {
//
//    String s= "HASHADA";
//    String s2="khandekar";
//    public static void main(String args[])
//    {
//        Thread1 t1 = new Thread1();
//        Thread1 t2 = new Thread2();
//        t1.start();
//    }
//
//    class Thread1 implements Runnable
//    {
//        public Thread1()
//        {
//
//            public void run()
//            {
//                while(1)
//                synchronized(s)
//                {
//                    System.out.println("sync block s"+s);
//                    try {
//                        Thread.sleep(100);
//                        } catch (InterruptedException e)
//                        {System.out.println("sync block s");}
//
//                    synchronized (s2);
//
//
//                }
//
//
//            }
//        };
//    }
//
//}
