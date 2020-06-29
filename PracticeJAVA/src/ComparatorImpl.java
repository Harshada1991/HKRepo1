import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorImpl {
       public static void main(String[] args) {
            Person p1 =new Person("xx",9);
            Person p2 =new Person("aa",8);
            Person p3 =new Person("c",8);

            ArrayList<Person> list= new ArrayList<Person>();
            list.add(p1);
            list.add(p2);
            list.add(p3);

            Collections.sort(list,new nameCompare());

            System.out.println("\n\nAfter Sorting:\n");
            for (Person cust : list) {
                System.out.println(cust);
            }
}}
class Person
{
    String name;
    Integer ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

   public Person(String a, Integer b)
    {this.name=a;
    this.ID=b;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}

class nameCompare implements Comparator<Person>
{//@Override
public int compare(Person p1,Person p2)
{   if(p1.name.compareTo(p2.name)>0)
    return 1;

    if(p1.name.compareTo(p2.name)<0)
        return -1;
    else return 0;
}
}

