import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesJava8 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        String path = "C:\\Users\\hkhandekar\\Documents\\SampleFile.txt";
       // meth1(path); //correct
       // meth2(path);
       // filterAWord(path);
        readLinesUsingFileReader();

    }
    static void meth1(String path) {
        Stream<String> li = null;
        try {
            li = Files.lines(Paths.get(path)); //lines return stream<String>
        } catch (IOException io) {
            System.out.println("IOException");
        }
        li.forEach(System.out::println);
    }
    static void meth2(String path) {
        BufferedReader bf = null;
        try {
            bf = Files.newBufferedReader(Paths.get(path));
        } catch (IOException io) {
            System.out.println("IOException");
        }
  bf.lines().forEach(System.out::println);
    }

    static void filterAWord(String path) {
        //starting same as meth1
        Stream<String> li = null;
        try {
            li = Files.lines(Paths.get(path)); //lines return stream<String>
            List<String> li3 = li.filter(x -> x.contains("harshada")).collect(Collectors.toList());
            li3.forEach(System.out::println);
        }
        catch (IOException io) {
            System.out.println("IOException");
        }}

        static void readLinesUsingFileReader() throws FileNotFoundException,IOException
        {
            File file= new File("C:\\Users\\hkhandekar\\Documents\\SampleFile.txt");
            FileReader fr= new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);

            String line;
            while((line=bf.readLine())!= null)
            {System.out.println(line);}
        }

}//class end