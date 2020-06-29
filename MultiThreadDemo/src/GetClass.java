import java.util.ArrayList;
import java.util.LinkedList;

    class Demo {
        public void show() {
            LinkedList<String> list = new LinkedList<String>();

            System.out.println("First: "+list.getClass());
        }

        public void show2() {
            ArrayList<String> list2 = new ArrayList<String>();

            System.out.println("Second: "+list2.getClass());
        }
   }

  class Person {
    int id;
    String name;

    Person() { id=9; name="HarleyQueen";}


    public void show3(){

        System.out.println("Third: "+this.getClass());
        System.out.println("Fourth: "+this.toString());

    }
}

    public class GetClass {
        public static void main(String[] args) {
            Demo demo = new Demo();
            demo.show();
            demo.show2();
            Person person = new Person();
            System.out.println("Fourth: "+person.toString());
            person.show3();
        }
    }
