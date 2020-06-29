
import java.lang.Runnable;

    class Buffer {
         int cnt ;
        public void incrCnt() {
             cnt++;
        }}
public class Syncronizee {
    public static void main(String args[]) throws Exception {

            Buffer b = new Buffer();
        Thread t1= new Thread(new Runnable()

                    {@Override
                        public void run()
                    {System.out.println("ini run");
                        for (int i=0;i <1000;i++)
                        {b.incrCnt();}}
                    });



        Thread t2= new Thread(new Runnable()
        {@Override
        public void run()
        {//System.out.println("thread running is"+Thread.currentThread().getName());}
            for (int i=0;i <1000;i++)b.incrCnt();}
            });

      t1.start();
        t2.start();
        t1.join(100);
        t2.join(100);
System.out.println("Count value is"+b.cnt);
   }
}

