import java.util.*;

public class IntArrToHashSet {
    public static void main(String[] args) {
        int a[] ={4,7,1,8,3};
        Integer b[]= new Integer[]{8,99,200};
        Set<Integer> set=new HashSet<>(); //prints 13478 no ordering
       // Set<Integer> set=new TreeSet<Integer>();  prints 13478 orders natural order
        //Set<Integer> set=new LinkedHashSet<>(); prints 47183 ordered
        int len=a.length;
        for(int i=0;i<len;i++)
        { set.add(a[i]);}

//        Iterator itr=  set.iterator();
//        while(itr.hasNext())
//        { System.out.print(itr.next());}

        System.out.println("set values = "+set);

        System.out.println( Arrays.asList(b));
        System.out.println("end");
    }
}
//           HashSet(Collection<? extends E> c)
//        Constructs a new set containing the elements in the specified collection.
//
//        convert int Array to list ,then pass this as constructor to hashset

//    Set implementation classes are HashSet,
//        LinkedHashSet, TreeSet, CopyOnWriteArraySet and ConcurrentSkipListSet
