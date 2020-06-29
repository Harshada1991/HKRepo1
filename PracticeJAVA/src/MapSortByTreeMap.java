import java.util.HashMap;
import java.util.TreeMap;

public class MapSortByTreeMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(21, "Twenty One");
        map.put(31, "Thirty One");
        map.put(41, "Thirty One");
        System.out.println("Unsorted HashMap: " + map);
        TreeMap sortedHashMap = new TreeMap(map);
        System.out.println("Sorted HashMap: " + sortedHashMap);
    }
}
        //  Output: Unsorted HashMap: {21=Twenty One, 41=Thirty One, 31=Thirty One}
        //  Sorted HashMap: {21=Twenty One, 31=Thirty One, 41=Thirty One}
        // TreeMap() : Constructs an empty tree map that will be sorted
        // by using the natural order of its keys.

//        public class TreeMap<K,V>
//                extends AbstractMap<K,V>
//                implements NavigableMap<K,V>, Cloneable, Serializable
//A Red-Black tree based NavigableMap implementation. The map is sorted
//        according to the natural ordering of its keys, or by a Comparator
//        provided at map creation time, depending on which constructor is used.
