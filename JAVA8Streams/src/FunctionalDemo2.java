import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
//JAVA PREDEFINED FUNCTONAL INTERFACES
//javaTechie youtube
public class FunctionalDemo2 {

    // Consumer<Integer> con= new Consumer() {
//        @Override
//        public void accept(Integer o) {
//            System.out.println("hi "+0);
//
//        }

        public static void main(String[] args) {
           Consumer<Integer> con=(t)->{ System.out.println("hi "+t);};
           con.accept(79);

            List<Integer> li= Arrays.asList(3,7,11,44);
            li.stream().forEach(con);  //print each
                                       //forEach uses consumer func Interface
            //forEach will use this consumer I


            Predicate<Integer> pre=(t)->t % 2==0;
            System.out.println(pre.test(6));
            //reurns true or false
            //used in filtering streams
            //so used by filter
            li.stream().filter((t)->t % 2==0).forEach(t-> System.out.println("even "+t));
            //same result
            li.stream().filter(pre).forEach(t-> System.out.println("even "+t));



            //what if we wanna return some default data?
            //even if its true or false
            //supplier
            //it returns <T>
            Supplier<String> supp = ()->{return "default returning";};
            Supplier<String> supp2 = ()-> "default returning";// both same
            System.out.println(supp.get());
            //supplier will be input in "orElse" method->
            List<String> li2= Arrays.asList("e","k");
            System.out.println(li2.stream().findAny().orElseGet(supp));
            //same result -if u define inline
            System.out.println(li2.stream().findAny().orElseGet(()->"default returning"));
            List<String> li3= Arrays.asList();
            System.out.println(li3.stream().findAny().orElseGet(()->"empty list"));
            //ifAny=if u find any element-do this

//
//            function
//            takes input ,does some action and returns output
//            apply()
            List<Integer> li4= Arrays.asList(44,55,3,78);
         //   System.out.println(li4.stream().map(t-> {return t.hashCode()};));
            
  }

}