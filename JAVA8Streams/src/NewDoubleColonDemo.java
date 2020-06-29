import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewDoubleColonDemo {
    public static void main(String[] args) {
        People p = new People("srianka", 89);
        People p2 = new People("australlia", 100);
        People p3 = new People("croatia", 22);

        List<People> peep = new ArrayList<>();
//        peep.add(p);
//        peep.add(p2);
//        peep.add(p3);

        List<String> li = peep.stream().map(People::getNAme).collect(Collectors.toList());
        li.stream().forEach(System.out::println);

        String li2 = peep.stream().map(People::getNAme).collect(Collectors.joining(","));
        System.out.println(li2);

   //     peep.stream().collect(Collectors.summingInt(People::getNAme));
      //  peep.stream().map(People::getNAme People::getAge)

    }
}
 class  People
{String name;
int age;
    People(String n,int a)
    {name=n;
    age=a;}
public String getNAme()
{return this.name;}

public int getAge()
{return this.age;}
}
