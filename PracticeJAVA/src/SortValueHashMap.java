import java.util.*;
import java.util.HashMap;
public class SortValueHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
       // sortByValue(hm);
//       Collection<Integer> set = hm.values();
//       ArrayList<Integer> al= new ArrayList<>(set);
        sortByComparator(hm);
      //  Collections.sort(hm, new sortByComparator() );
    }
   public static void  sortByValue(HashMap<String,Integer> mapp){
        Collection<Integer> set = mapp.values();
       TreeSet<Integer> hs= new TreeSet<>(set);
       System.out.println(hs);

   }
   public static void sortByComparator(HashMap<String,Integer> map)
   {
       Set<Map.Entry<String,Integer>> set= map.entrySet();
       ArrayList<Map.Entry<String,Integer>> Al= new ArrayList<>(set);

       Collections.sort(Al, new Comparator<Map.Entry<String,Integer>>(){
                           public int  compare(Map.Entry<String,Integer> a1,
                                               Map.Entry<String,Integer> a2) {
                               return a1.getValue()-a2.getValue();
                           } });

       System.out.println(Al);
       //sorted now
  }
}
