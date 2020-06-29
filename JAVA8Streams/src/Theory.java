import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Theory {
//    Arrays.stream() method only works for primitive arrays of int[],
//    long[], and double[] type, and returns IntStream, LongStream and DoubleStream
//    respectively.
//    For other primitive types, Arrays.stream() won’t work.(not foe char[])
//
//    On the other hand, Stream.of() returns a generic Stream of type T (Stream).
//    Hence, it can be used with any type.

//    middle
//    filter map String.isEmpty
//    add= reduce(0,(a,b)->a+b)
//
//    terminal
//    count forEach reduce max min collect(Collectors.toList)
//    summaryStatistics
public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };

//    IntStream ins= Arrays.stream(arr);
//    ins.forEach(str -> System.out.print(str + " "));
//
//    System.out.print(arr);
//    Stream<int []> s= Stream.of(arr);
//    s.forEach(str -> System.out.print(str));
//
//    Stream s1=Stream.of("brush","paste","glister");
//    s1.forEach(str -> System.out.print(str + " "));

    char[] a = {'a','e','o','u'};


    Stream s6=Stream.of(a);
    s6.forEach( System.out::print);

    String[] s3 =new String[]{"aust","zima","peru"};
    Stream<String> s4= Arrays.stream(s3); //can b used with String arr also
    s4.forEach(q-> System.out.print(q+""));


    Stream<String> stream = Stream.of("Geeks", "For",
            "GeeksForGeeks", "A",
            "Computer", "Portal");

    // Since the stream is not being consumed
    // this will not throw any exception


    System.out.println();
    // Print the stream
    stream.filter(s8 -> s8.startsWith("G"))
            .peek(s8 -> System.out.print("Filtered value: " + s8+" " ))//follwing op will be carried
                                                                        // out for each resultant
            .map(String::toUpperCase)
            .peek(s8 -> System.out.print("Uppercase value :" + s8+" " ))
           // .forEach(System.out::println);// terminal op  will print each s
           .count();                        //terminal operation;

    //output is
//    Filtered value: Geeks Uppercase value :GEEKS
//    Filtered value: GeeksForGeeks Uppercase value :GEEKSFORGEEKS//

//    and not like this
//    Filtered value: Geeks GeeksForGeeks Uppercase value :GEEKS GEEKSFORGEEKS



}


}
