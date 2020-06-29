import java.util.LinkedList;
import java.util.Queue;
//see ProdConsLock_MyBlockingQ2 -> actual code
//impl my custom blocking q
//via lock

public class ProdConsLock_MyBlockingQ {
    //ProdConsMainClass is main
Queue<Integer> q;
    int max;

    public ProdConsLock_MyBlockingQ(int size){
        max=size;
         q= new LinkedList<>();}

         private void add(Integer i){
             q.add(i);
        }
         private Integer take(){return q.remove();}

    public static void main(String[] args) {

    }
    }
