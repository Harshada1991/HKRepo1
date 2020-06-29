import java.util.*;
//GENERICS
public class HashMapAlterRemoveTest {
        public static void main(String[] args)
        {
            // Consider the hashmap contains
            // student name and their marks
            HashMap<String, Integer> hm =
                    new HashMap<>();

            // Adding mappings to HashMap
            hm.put("GeeksforGeeks", 54);
            hm.put("A computer portal", 80);
            hm.put("For geeks", 82);

            // Printing the HashMap
            System.out.println("Created hashmap is" + hm);

            // Getting an iterator
            Iterator hmIterator = hm.entrySet().iterator();

            Set<Map.Entry<String, Integer>> set=hm.entrySet();
            //GENERICS
            for(Map.Entry<String, Integer> e: set){String key=e.getKey();}

            // Iterate through the hashmap
            // and add some bonus marks for every student
            System.out.println("HashMap after adding bonus marks:");

            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry)hmIterator.next();
                //GENERICS
                int marks = ((int)mapElement.getValue() + 10);
                //GENERICS
                Integer marks2 = (Integer)mapElement.getValue() + Integer.valueOf(10);

                System.out.println(mapElement.getKey() + " : " + marks);

                String s= (String)mapElement.getKey();
                if(mapElement.getKey().equals("For geeks"))
                    hmIterator.remove();
                else hm.put(s,marks); //altering the map
            }
            System.out.println("Altered hashmap is" + hm);
            //so we can alter anywhere
            //but DELETION -inside iterator we can delete only by using iterator's remove method()
            //else concurrentModificationError()->fail fast itr
        } }

