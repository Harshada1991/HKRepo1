public class Inherit {
    public static void main(String[] args) {

//overriding
//thr are 2 things- type of object , type of ref
//if non static method(run time computation) then overriding happens
// and method = type of object , is called
//if  static method(run time computation) then if subclass usage-overriding doent happens
// and method = type of ref , is called(parent)
      //if non static method(run time computation) then overriding happens
//static methods get called by type of intance = parent type

//https://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/

///////// name      weight  color
//Animal  BigAnimal 58
//cat     CAt       58""    brown


Animal a=new Animal();
Cat c=new Cat();
//a.colour; = parent cant access child's exclusive variables
        System.out.println(c.getName()+" and "+c.getWeight()+" and "+ c.getColor());

Animal a1= new Cat();
        System.out.println(a1.getName()+ "and" + a1.getWeight());//print child

Animal a3 =c;// obj and ref c now goes to animal ref
        System.out.println(a3.getName()+ "and" + a3.getWeight() ); //print child

        System.out.println(((Cat)a3).name); //typecasting to child

//Cat c1= a1; wrong

        System.out.println(a3 instanceof Cat ); //prints true
        System.out.println(a3 instanceof Animal ); //prints true


//child can access only public and protected members of parent
//can access thru public getter() super.getName or getName

Animal a5= new Cat();
        System.out.println(a5.getName() + a5.getWeight());
        a5.disp(); //child disp

       Animal.dispStatic();
       Cat.dispStatic();
    }
}
class Animal
        {
          String name="BigAnimal";
          int weight=58;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public void disp()
            {
                System.out.println(" disp in parent class");
            }

            public static void dispStatic()
            {
                System.out.println(" Static disp in parent class");
            }

            public Animal(){
              System.out.println("parent Constructur");
            }
      }


        class Cat extends Animal{
            String name="Cat"; //chnaged the value
            String color="brown"; //new element

            public Cat(){
                super();
                System.out.println("child Constructur");
            }
            @Override
            public String getName() {
                return name;
            }

            @Override
            public void setName(String name) {
                this.name = name;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }
            public void disp()
            {
                System.out.println(" disp in child  class");
            }

            public static void dispStatic()
            {
                System.out.println(" Static disp in child class");
            }

            public static void dispStatic2_notINParent ()
            {
                System.out.println(" Static disp()notINParent in child class");
            }
            }
