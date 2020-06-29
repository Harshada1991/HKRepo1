import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class TestaMap {

  static   Map<String,ArrayList<Integer>> map= new HashMap<>();

    public static void main(String[] args) {
        TestaMap.insert();
        TestaMap.insert2("six",18);
        TestaMap.insert2("three",18);
        System.out.println("avg = "+TestaMap.findAverage("three"));
    }

    public  static void insert(){
        ArrayList<Integer> al = new ArrayList<Integer>();
        Integer[] a= {3,6,9,12};
     //   al=Arrays.asList(a); // cant covert from List<T> to ArrayList<Integer>
        List<Integer>  li=Arrays.asList(a); // but here its List=interface
                            //cant do get(), add etc

        ArrayList<Integer> al3 = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(al3);

        ArrayList<Integer> al4 = new ArrayList<Integer>();
        al4.add(2);al4.add(4);al4.add(6);

        ArrayList<Integer> al5 = new ArrayList<Integer>();
        al5.add(10);al5.add(15);al5.add(20);

   map.put("two",al4);map.put("three",al3); map.put("five",al5);

        System.out.println(map);



    }
    public static void insert2(String s,Integer l)
    {
        if(map.containsKey(s)==false)
        {
            ArrayList<Integer> al11=new ArrayList<>();
           al11.add(l);
           map.put(s,al11);
        }
        else
        {
           ArrayList l9= map.get(s);
           l9.add(l);
           map.put(s,l9); // chck if map does auto chck of already exist and
        }
        System.out.println(map);
    }

    public static Double findAverage(String s)
    {
        //chck if conatinsKey
        Double sum=0.0;
        ArrayList<Integer> l=map.get(s);
        for (Integer i:l) {sum+=i;}
        sum=sum/(l.size());
         return sum;



        }
    }

