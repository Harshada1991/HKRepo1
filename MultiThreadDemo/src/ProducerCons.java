

   class Buffer2{

       Boolean isXset=false;
       int x;
       public  synchronized void  setX() {
          while(x<5) {
              if (isXset) {
                  try {
                      wait();
                  } catch (InterruptedException e) {
                  }
              }
              notify();
              x++;
              System.out.println("x in producer " + x);
              isXset = true;
          }

       }
        public  synchronized void printX(){
            if(!(isXset))
            {try
            {wait();} catch (InterruptedException e){}
            }
            notify();
            System.out.println("x in producer "+x);
            isXset=false;
        }
    }
    class Producer implements Runnable{
        Buffer2 b;
        public Producer(Buffer2 b)
        {   this.b=b;
            Thread t = new Thread(this,"Prod");}

        @Override
        public void run()
        {while (true)
        {b.setX();
            try
            {Thread.sleep(1000);} catch (InterruptedException e){}
        }
        }}

    class Consumer implements Runnable{
        Buffer2 b;
        public Consumer(Buffer2 b)
        {   this.b=b;
            Thread t = new Thread(this,"Prod");}

        @Override
        public void run()
        {while (true)
        {b.printX();
            try
            {Thread.sleep(1000);} catch (InterruptedException e){}
        }
        }}

   public class ProducerCons {
            public static void main(String args[]) {
       Buffer2 b2 = new Buffer2();
    new Consumer(b2);
}}