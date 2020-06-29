import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Second {
    public static void main(String[] args) {

  Stream.of("brush","paste","glister").filter(e->e.startsWith("g")).collect(Collectors.toList()).forEach(System.out::println);

  int no=Stream.of(1,5,22,56).map(x->x*x).reduce(0,(ans,i)->ans+i);
        System.out.println("the sum of squares="+no);

        Arrays.asList("abc","aaaa","zza").stream().sorted().forEach(System.out::println);
        Arrays.asList("abc","aaaa","zza").stream().filter(x->x.length()==3).forEach(System.out::println);
        Arrays.asList("abc","aaaa","zza").stream().filter(x->x.contains("zz")).forEach(System.out::println);

        //print if a no is odd
        List<Integer> list=Arrays.asList(5,3,22,7,80);
        list.stream().filter(x->x%2!=0).collect(Collectors.toSet()).forEach(System.out::print);

        //distinct
        List<Integer> list2=Arrays.asList(5,3,22,3,7,80);
        list.stream().map(x->x*x).distinct().collect(Collectors.toList()).forEach(System.out::print);
        //distinct will be redundant when toSet

        System.out.println();
        //limit
        Random r= new Random();
        r.ints().limit(10).forEach(System.out::println);

        r.ints().limit(10).sorted().forEach(System.out::println);

//get count os strings which are empty
       String[] s4=new String[]{"brush","","paste","","glister","navy"};
      long count=  Arrays.stream(s4).filter(x->x.isEmpty()).count();
        System.out.println(count);


//        parallelProcessing
//                used with collection Objects
       List<String> lis =Arrays.asList("brush","","paste","","glister","navy");
       long count2= lis.parallelStream().filter(x->x.isEmpty()).count();
        System.out.println(count2);

        //to get comma separated values
    String l9=  lis.stream().collect(Collectors.joining(";"));
        System.out.println("l9 is"+l9);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics i= numbers.stream().mapToInt((x)->x).summaryStatistics();
        i.getAverage(); i.getCount();i.getSum();


    }}
