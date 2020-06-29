import java.util.function.Consumer;

public class FunctionalDemo1 implements  Consumer<Integer>{
   // Consumer<Integer> con= new Consumer() {
        @Override
        public void accept(Integer a) {
            System.out.println("hi"+a);

        }


    public static void main(String[] args) {
        FunctionalDemo1 demo= new FunctionalDemo1();
        demo.accept(7);
    }
}
