public class LeftShift {
       public static void main(String[] args) {
            int a = 44;
            int b = 11;

            int c= a <<1;
            int d= b <<1;

//the value gets double in each shift
// "<<<" doesnt exist

            System.out.println("After one left shifts");
            System.out.println("c= "+c);
            System.out.println("d= "+d);

            c= a <<2;
            d= b <<2;
            System.out.println("After teo left shifts");
            System.out.println("c= "+c);
            System.out.println("d= "+d);

            c= a <<3;
            d= b <<3;
            System.out.println("After three left shifts");
            System.out.println("c= "+c);
            System.out.println("d= "+d);


        }
    }

