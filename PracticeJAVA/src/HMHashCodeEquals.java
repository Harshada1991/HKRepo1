import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.HashMap;
import java.util.Map;

public class HMHashCodeEquals {
    public static void main(String[] args) {
        Map<Mammal2,String> map= new HashMap<>();
    map.put(new Mammal2("dolphin",32),"first");
        map.put(new Mammal2("dolphin",32),"second");
        System.out.println(map.size());
        System.out.println(map);

        //System.out.println(map());

}}
class Mammal2{
    String name;
    int age;
  public  Mammal2(String a,int b){name=a;age=b;}

    @Override
  public boolean equals(Object o ){return false;}

@Override
    public int hashCode()
{return 2;}
}
//The method does override or implement a method declared in a supertype.
//	@Override equals(Object o )