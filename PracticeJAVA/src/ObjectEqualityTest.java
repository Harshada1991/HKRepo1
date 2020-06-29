public class ObjectEqualityTest {
  static  class Animal {
      String name;
        int id;
      public Animal()
      {}
       public Animal(String name, int id)
       {this.name=name;
       this.id=id;}
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("cat",2);
        Animal a11 = new Animal("cat",2);
        Animal a2= new Animal("dog",5);

        System.out.println("a1 = a11"+a1.equals(a11)); //false
         System.out.println("a1 = a2"+a1.equals(a2)); //false

        Animal a3=a2;
         System.out.println("a2 = a3"+a3.equals(a2)); //true

        //== checks , object references are same or not
        //objet variables  are alwyas refrences
        System.out.println("getClass of a1 = "+a1.getClass());
       a1=new Mammal("black");
        System.out.println("getClass of a1 = "+a1.getClass());
      //  System.out.println("getClass oa a1 "+Mammal.getClass());


    }
}
class Mammal extends ObjectEqualityTest.Animal
{
    String color;
    public Mammal(){super();}

     public  Mammal(String col)
     {this.color=col;}
}