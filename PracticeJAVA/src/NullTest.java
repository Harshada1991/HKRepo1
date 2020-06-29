public class NullTest {

        public static void main(String[] args) {

            testPrint testP = new testPrint();
            NullTest n= new NullTest();
            n.NonstaticMathod();
            n.staticMathod();

            System.out.println("chceckig if n  null acn call ---");
            n=null;
            n.NonstaticMathod();
            //n.staticMathod();//null pointer ecx



            // case 6
            System.out.println("null");
            System.out.println('a'); //prints a
            System.out.println(97); //prints 97
            System.out.println('a' + 97);//prints 194
            System.out.println('a' + 'b');//prints 195
            System.out.println('b' - 'a');//prints 1
            System.out.println("b" + 5);//prints 195
            System.out.println(89 + 11);
            System.out.println("after null");
            System.out.println(testP instanceof testPrint);
            System.out.println(testP.getClass());//prints-  class testPrint
            testP = null;
            //System.out.println(testP.getClass());
            // null pointer exception
            System.out.println();// print blank ...empty spaces

            Material mat = new Material();
            System.out.println(mat);
            //prints Material@140e19d// invokes defaut toString mathod

            mat = null;
            System.out.println(mat);//prints null

            //String can overload - String,char array,objects(to print)
            System.out.println("testing null print");
            // System.out.println(null);//error
            // overloaded null,compiler confused to chose which one
            String o = null;
            System.out.println(o);// prints null
            //System.out.println("Is o eual to null ?");
           // System.out.println( o.equals(null)); null pointer exp

            System.out.print("mat instanceof  Material");
            System.out.println(mat instanceof Material); //false
            System.out.print("null instanceof Object");
            System.out.println(null instanceof Object); //false

            // System.out.println(mat instanceof  null);
            System.out.println((String) null);
            System.out.println("" + null);
            System.out.println((Object) null);
            char[] a =new char[10];
            // System.out.println((char[]) null);
            //System.out.println((a) null);
            //NullPointerException

            System.out.println("" + null + null); //prints nullnull
            System.out.println(null + "" + null);
            //System.out.println(null+null+""+null);// error


            // + operator cant be applied to null cant

            //https://stackoverflow.com/questions/36325277/why-does-system-out-printlnnull-give-the-method-printlnchar-is-ambiguo



        }//end main
          private void  staticMathod()
        {
                System.out.println("null ref can call staic ref");
            }

            private static void NonstaticMathod()
            {
                System.out.println("null ref cannot call Nonstaic ref");
            }

        }

class Material{String item;
    public Material(){item="necklace";}}

//https://www.youtube.com/watch?v=M8SRKIN9-K0
//
//        in acse of overoading , the most specific method will be exe

//
//    // null can be assigned to String
//    String str = null;
//
//    // you can assign null to Integer also
//    Integer itr = null;
//
//    // null can also be assigned to Double
//    Double dbl = null;
//
//    // null can be type cast to String
//    String myStr = (String) null;
//
//    // it can also be type casted to Integer
//    Integer myItr = (Integer) null;
//
//    // yes it's possible, no error
//    Double myDbl = (Double) null;

