import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProdCons_MyQ_waitNotify {
        Queue<Integer> q;
        int max;


        public ProdCons_MyQ_waitNotify(int size){
            max=size;
            q= new LinkedList<>();}

        private   synchronized void add(Integer i) throws InterruptedException{

                while(q.size()==max)
                {wait();}//will wait until some other th
                //gives the signal that its not full
                //anymore

                //wheenever we do -> condition.await
                //then the curr th goes to wait until the cond is true

                q.add(i);
                notifyAll();//its saying tht notEmpty cond is true
                //to all th who are waiting for q to b
                //notEmpty

        }
        private  synchronized Integer take() throws InterruptedException
        {
            while(q.size()==0) //not correct "if" is used
            //rechecks everytime;
            {wait();}
                Integer val= q.remove();
              notifyAll();
                return val;

        }

    }

