//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Test100 {
//   public static void main(String[] args) {
//
//       Object res;
//       Queue q = new LinkedList();
//       int SIZE=10;
//
//Thread prod = new Thread(new Mythread1() );
//Thread cons = new Thread(new Mythread2() );
//
//prod.start();
//cons.start();
//
//public static void produce(int a)
//       {synchronized ()
//    int len=q.size();
//    if(len<SIZE)
//        q.add(a);
//    else wait();
//       }
//public static void consume(){
//           int len=q.size();
//           if(len>0 && len<=SIZE )
//               res= q.remove();
//           notify();
//
//       }
//
//    }
//
//}
//
//class Mythread1 implements Runnable{
//        public void run()
//        { synchronized (this)
//            produce();
//        }}
//
//    class Mythread2 implements Runnable{
//        public void run()
//        {consume();}
//}
