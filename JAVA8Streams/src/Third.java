import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class Third {
//from https://github.com/joeyajames/Java/blob/master/Java%208%20Streams/JavaStreams.java
    public static void main(String[] args) throws java.io.IOException{

        IntStream.range(1,10).skip(2).forEach(System.out::print);
        System.out.println();
        IntStream.range(1,10).limit(2).forEach(System.out::println);

        System.out.println(IntStream.range(1,10).limit(2).count());

        Stream<String> row= Files.lines(Paths.get("C:\\Users\\hkhandekar\\Stream.txt"));
        row.filter(x->x.length()>12).forEach(System.out::println);
        row.close();

        Stream<String> row2= Files.lines(Paths.get("C:\\Users\\hkhandekar\\harshu.csv"));
        row2.map(x->x.split(",")).forEach(System.out::println);
//done till 7


    }
}
