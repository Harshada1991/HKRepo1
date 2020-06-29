import java.util.*;

public class Test1{

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        System.out.println(hm.size());
        System.out.println("FIRST way");
        for (Integer name : hm.keySet()) {
            System.out.print(name + " " + hm.get(name));
            //writes key value pair
            //1 one
            //2 two
            //3 three
        }
        System.out.println("");
        System.out.println("SECOND way");
        System.out.print( "hahmap values are" + hm.values());
            //writes only values
            //hahmap values are[one, two, three]

        Set s = hm.keySet();

        Iterator i = s.iterator();
        System.out.println("");
        System.out.println("THIRD way");


            while(i.hasNext())
           {
            System.out.print(i.next());        }



        Set s2 = hm.entrySet();
        Iterator i2=s2.iterator();
        System.out.println("");
        System.out.println("Fourth  way");
        while(i2.hasNext()) {
             Map.Entry m = (Map.Entry)i2.next();
                System.out.print(""+m.getKey()+ m.getValue());
        }




    }
    }
