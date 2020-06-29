import java.util.*;

public class TestPrint2 {
    public static void main(String[] args) {
        //cese 1
        LinkedHashMap<Integer, String> map
                = new LinkedHashMap<>(16, .75f, true);
        map.put(1, null);
        map.put(2, null);
        map.put(3, null);
        map.put(4, null);
        map.put(5, null);
      Set<Integer> set = map.keySet();
           System.out.println(set.toString());
           String s="[1, 2, 3, 4, 5]";
        System.out.println(s.equals(set.toString()));
       //end case 1

// case2
        System.out.println("kadaki");
        String name="khadaki";
        String name1="khadaki";//cacheing...String cnst pool
        String name2= new String("khadaki");
        System.out.println(name.equals(name2));
        System.out.println(name==name2);
        System.out.println(name.hashCode()==name2.hashCode());
        //hashcode is calc on value and not reference

        String name3=new String("khadaki").intern(); //doent create new instance
        System.out.println(name==name3);

//Endcase2

        //case 3
        System.out.println("case 3");
        int a=1;
        int b=2;

        System.out.println(":"+a+b);

        //end case3

        //case 4
        //undersatnding ovrride equals.hashcode and ==
        System.out.println("Start of CASE 4");
        Bag z1= new Bag(99,"black");
        Bag z2= new Bag(99,"black");
        Bag z3= new Bag(99,"nude");
        Bag z4;
        z4=z1;
        System.out.println(z1.hashCode());
        System.out.println(z2.hashCode());
        System.out.println(z3.hashCode());
        //all hashcodes will be diff--coz I am not overriding hashcode()

        System.out.println("z2.equals(z1)"+z2.equals(z1));
        //will be false if I dnt overide equals coz normally it just checks the reference
        //will be true after overriding equals
                System.out.println(z2==(z1));//always false as refrences are diff
//end case 4

//start case 5
//        if I dint overide equals() method,
//         it comapres the references and not the value
        System.out.println("z4.equals(z1"+z4.equals(z1)); //true
        System.out.print("z4.equals(z1");
        System.out.println("z2.equals(z1)"+z2.equals(z1)); //false
        System.out.println(z4==(z1));                     //false


//end case 5

    }

}
class Bag{
    int capacity;
    String color;
    public Bag(int capacity ,String color){this.capacity=capacity; this.color=color;}

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    @Override
//  public boolean equals(Object o)
//{
//    if (!(o instanceof Bag)) return false;
//
//    if(o==null || o.getClass()!=this.getClass()) return false;
//
//   return (((Bag) o).getCapacity()==this.getCapacity() &&
//            ((Bag) o).getColor() ==this.color);
//  // {return true;}
//}

}

