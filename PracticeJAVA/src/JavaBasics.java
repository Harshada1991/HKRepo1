public class JavaBasics {
    //instance variables
   public   int a; // modifier  allowed here
  final  int b;
   boolean flag;
   static String s;
//if u declare a instance variable final then either u have to initialise it
    //or u have to initialise in constructor

   public JavaBasics(){this.b=9;}
    public static void main(String[] args) {
       JavaBasics imm = new JavaBasics();
       imm.show();
      //  System.out.println(s); // error - might not have been initialized


      //OUTER CLASS ACCESSING INNER STATIC CLASS
        System.out.println("value of static class's static member"+StaticInnerClass.staticAge2);
               StaticInnerClass ic = new StaticInnerClass();
       //  imm.ic   -- wrong
        System.out.println("value of static class's non static member"+ic.age);

      //  StaticInnerClass.showouter  --- wrong

        ic.showOuter();
   }

    public void  show() {
       //local variables
        int c;
        final  int d;//can just declare, but cant access d unless u initialize it
     //   public   int a;      //any modifier not allowed

        System.out.println(b);//no err even if  not initialized
        System.out.println(flag);// error - might not have been initialized
//        System.out.println(c);// error - might not have been initialized
//        System.out.println(d);// error - might not have been initialized
            }

            public static class StaticInnerClass{
       int age=88;
       static int staticAge2;

       public void showOuter()
       {//INNER STATIC CLASS ACCESSING OUTER non STATIC CLASS
          // System.out.println(a); non static cant b accessed from static
           System.out.println("outer static s= "+s);
       }
            }

//    NOTES
//    If the variable is instance or static variable then you don't have to assign
//    any value it's by default value is 0 (Assigned by jvm).
//
//    If variable is local you have to assign value before using it.
//    If you are not using any variable then it's fine not assign any value and
//    it will not show any error.

//    Since the scope of the local variables belong to the method/block/constructor/
//    these are not accessed from outside, therefore, having access specifiers
//        like public, private, protected (which allows access outside of the
//    current context) makes no sense.
//
//    In the same way, static variables belong to the class and can be accessed
//        anywhere within the class, which contradicts with the definition of the
//    local variable. Therefore, declaring a static variable inside a method is
//    not allowed too.
//
//    The abstract keyword is not allowed with variables in Java. In short,
//    only final is permitted with local variables in Java.
//    If you try to use any other modifiers a compile time error is generated.
//

}
