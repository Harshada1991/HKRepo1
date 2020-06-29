import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

 class ProdConsLock_MyBlockingQ2 {
     //ProdConsMainClass is main
        Queue<Integer> q;
        int max;
        ReentrantLock lk = new ReentrantLock(true);
        private Condition notEmpty_c = lk.newCondition();
        private Condition notFull_c =lk.newCondition();

        public ProdConsLock_MyBlockingQ2(int size){
            max=size;
            q= new LinkedList<>();}

        private void add(Integer i) throws InterruptedException{
            lk.lock();
            try{
                if(q.size()==max)
                {notFull_c.await();}//will wait until some other th
                                    //gives the signal that its not full
                                    //anymore

                //wheenever we do -> condition.await
                //then the curr th goes to wait until the cond is true

            q.add(i);
            notEmpty_c.signalAll();//its saying tht notEmpty cond is true
                                   //to all th who are waiting for q to b
                                    //notEmpty
            }
            finally{lk.unlock();}
        }
        private Integer take() throws InterruptedException
        {  lk.lock();
        try{ while(q.size()==0) //not correct "if" is used
                                //rechecks everytime;
        {notEmpty_c.await();}
            Integer val= q.remove();
        notFull_c.signalAll();
        return val;
        }finally {
            lk.unlock();
        }
        }

        public static void main(String[] args) {

        }
    }


