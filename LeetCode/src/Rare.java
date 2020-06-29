import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Rare {
    public static int nthMostRare(int[] elements, int n) {
int count=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<elements.length;i++) {
            if (map.containsKey(elements[i])) {
                count = map.get(elements[i]);
                map.put(elements[i], count + 1);
            } else {
                map.put(elements[i], 1);
            }
        }
        int min_count = n+1, res = -1;
        for(Map.Entry<Integer,Integer> val : map.entrySet())
        {
            if (min_count >= val.getValue())
            {
                res = val.getKey();
                min_count = val.getValue();
            }
        }

        return res;


        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        int x = nthMostRare(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2);
        System.out.println(x);
    }
}