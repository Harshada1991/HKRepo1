public class RightShiftNegativeNo {
       public static void main(String[] args) {
            int a = -44;
            int b = -11;

            int c= a >>1;
            int d= b >>1;

//the value gets half in each shift
// for negative integers >> and >>> are different (for left shift also)

            System.out.println("After one right shifts");
            System.out.println("c= "+c);
            System.out.println("d= "+d);

            c= a >>1;
            d= b >>1;

            System.out.println("After zzzzz right shifts");
            System.out.println("c= "+c);
            System.out.println("d= "+d);

            c= a>>2;
            d= b>>2;
            System.out.println("After teo right shifts");
            System.out.println("c= "+c);
            System.out.println("d= "+d);

            c= a>>3;
            d= b>>3;
            System.out.println("After three right shifts");
            System.out.println("c= "+c);
            System.out.println("d= "+d);


        }
    }

