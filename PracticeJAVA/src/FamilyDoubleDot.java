import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FamilyDoubleDot {

    public static void main(String[] args) {
        List<String> list2 = new ArrayList<String>();
        list2.add("diamond");
        list2.add("platinum");
        list2.add("gold");
//        list2.forEach(System.out::println);
//
//       list2.forEach(Family::new);//contructor will be called


//        list2.forEach(Family::meth);
//        list2.forEach((new Family())::InstanceMeth);
//        list2.forEach((new Relative())::InstanceMeth);
        list2.forEach((new Relative())::InstanceMeth);






   // List<Family> list = new ArrayList<Family>();

  //  list=Arrays.asList(new Family("Akshu"), new Family("bhau"));

//       list.forEach(System.out::println);
//        list.forEach(Family::new);

}
}

    class  Family{
        String name ;
       public Family(){this.name= "AkshuDefault";}
//        Family@1a4f24f
//        Family@19a45b3

      //  public Family(String name){this.name= name;}

        public Family(String name){
            System.out.println(name+"hi");}
        public static void meth(String s10)
        {   System.out.println("Hi fam"+s10);}
        public  void InstanceMeth(String s10)
        {   System.out.println("Bye"+s10);}
//
//        String s8="Akshu";

        // System.out::println(s8);

    }

    class Relative extends Family{
     //  public Relative (){this.name= "BhauDefault";}
        public  void InstanceMeth(String s10)
        {  super.InstanceMeth(s10);
        System.out.println("Bye"+s10+"Sayonaraaa");}
    }

