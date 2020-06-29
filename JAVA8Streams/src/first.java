import java.util.Arrays;
import java.util.List;

public  class first {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Harshu","nicole","jessica","zohara");

        list.stream().forEach(s->System.out.print(s+" "));


        System.out.println("list = "+list);

        list.stream().forEach(System.out::print);

        list.stream().filter(k->k.equals("nicole"));



    }
}
