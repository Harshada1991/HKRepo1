import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Mathss {
   public static void main(String[] args) {
       HashSet<Character> set= new HashSet<>();
       set.add('g');
       set.add('o');

       HashSet<Character> set2= new HashSet<>();
       set2.add('l');
       set2.add('a');
       set2.add('k');
       set2.add('a');

       ArrayList<HashSet> list = new ArrayList<>();
       list.add(set);
       list.add(set2);

     //  Iterator it = new list.iterator();
       list.forEach(p-> System.out.println(p.iterator().next()));

       for(HashSet c :list)
       {
               System.out.println(c);
       }
//        String n1="23";
//       String n2="89";
//        int carry=0;
//        int i=1;
//        int count =0;
//        while(count<2)
//
//        {   carry=(n1.charAt(i)+n1.charAt(i)+carry)/10;
//            System.out.println("carry= "+carry);
//            int k= (n1.charAt(i)+n1.charAt(i)+)%10;
//            System.out.println(k);
//            count++;
//            i--;
//        }

    }
}
