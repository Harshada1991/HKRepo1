public class Varags
{
    public static void main(String[] args) {
       method(2,3,4); //varags - zero or more attribs
       method(2);
       method();
    }
  static   void method(int ... a) //varags
    {
        System.out.println(1);
    }

   static void method2(int[] a) //if gave same name=method()
                                //error-already def in varags[]
    {
        System.out.println(2);
    }
}