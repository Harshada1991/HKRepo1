public  class  PasByValueJava{

static  class  Person{
    Person(){}
    Person(int x1) { System.out.println("nothing");
    }// }
        int x=7;

public void setX(int a) {
    System.out.println("value of x=" + x);
    x = a + 100;
}
public void setXnewObject(int a) {
        System.out.println("value of x=" + x);
    Person p2= new Person(9);
        x = x + 200;
    System.out.println("value of x=" + x);
}}
public static void main(String args[])
        {
        Person p=new Person();
            System.out.println("value of x"+p.x);
        p.setX(5);
        System.out.println("value of x"+p.x);
       System.out.println("dddddddddddddddddddd");

       p.setXnewObject(1);
            System.out.println("value of x"+p.x);
        }

}
