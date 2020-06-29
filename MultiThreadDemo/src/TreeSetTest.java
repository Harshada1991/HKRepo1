import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetTest{
    public static void main(String args[]) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("zzz");
        treeSet.add("Second");
        treeSet.add("Third");
        Iterator<String> itr = treeSet.descendingIterator();
        //desc lexicographic order
        while (itr.hasNext()) {
        System.out.println(itr.next());
        }

        Iterator<String> itr2 = treeSet.iterator();//lexicographic order
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        }}