

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet < String > celebrities = new TreeSet <> ();

        celebrities.add("Tom Cruise");
        celebrities.add("Will Smith");
        celebrities.add("Jackie Chan");
        celebrities.add("Akshay Kumar");
        celebrities.add("8 ");
        celebrities.add("D");

        Iterator < String > iterator = celebrities.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();

        Iterator < String > t= celebrities.descendingIterator();
        while (t.hasNext()) {
            System.out.print(t.next());
        }

    }

}