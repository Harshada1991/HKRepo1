import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class testPrint {

    //    https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
    public static void main(String[] args) {

String s90="dakkaneshwar";
char [] c12=s90.toCharArray();
        System.out.println("s90= "+s90);
for(char c:c12){System.out.print(c+" ");}
        //test 2
   //ArrayList<Double> al=new ArrayList<>();
 //  al=[3,7,4,9,2.0];-- is wrong

List<Double> al=Arrays.asList(3.0,7.9,4.6,9.6,2.0);
        System.out.println("al"+al);

//end test 2

           // test3
            ArrayList<String> gfg = new ArrayList<String>(
                    Arrays.asList("Geeks",
                            "for",
                            "Geeks"));

            // print ArrayList
            System.out.println("ArrayList : " + gfg);
           // end test3




      //      List<Integer> gfgr = new ArrayList<Integer>(arro);

        //   case 6
//
//
//        int [3] input ={123,4532,77};
//        shd nt specify size
//
//        3.
        int a,b=0;
        int[] x={0},y[];
        int o[],f[];

//        System.out.println("y is"+y);
//        System.out.println("y is"+x);
//        System.out.println("y is"+o);
//        System.out.println("y is"+f);
//        end 3
        System.out.println("printing arrays");
        int[] input = {123, 4532, 77};
        System.out.println(input); // prints [I@17327b6  =  address

        char[] input8 = {'a','y','m'};
        System.out.println(input8); // prints aym  = value

        String s = "HArshu";
        System.out.println(s);

        StringBuffer s2 = new StringBuffer("");
        System.out.println("StringBuffer is" + s2);
        System.out.println("input int array is");
        for (int i : input) {
            System.out.print(i);
        }

        //to print comma separated array
        System.out.print('[');
        for (int i : input) {

            s2 = s2.append(i);
            s2 = s2.append(',');

        }
        System.out.print(s2);
        System.out.print(']');
        String s3 = s2.toString();
        System.out.print("s3" + s3);

        System.out.println("SUBSTRING DEMO");
        String s4 = "hars";
        System.out.println(s4.substring(0, 3));//har
        System.out.println(s4.substring(0, 0));//null
        System.out.println(s4.substring(1, 2));//a

        StringBuilder s6 = new StringBuilder("hars,");
        System.out.println(s6.deleteCharAt(s6.length() - 1));
        //to delete the last letter in a string/stringbuilder


        StringBuilder s7 = new StringBuilder("harshada");
        System.out.println("after deleteing 1st letter s7= " + s7.substring(1));
        //to delete the last letter in a string/stringbuilder

        //multiple if else
        //if else-if else
        //fibonaci
//        int a=3/2;
//
//        System.out.println("a isssssssss"+a);

//case 4
//        int arr2[] = new int[-1];
//        System.out.println("arraay 2 length"+arr2.length);
//        Exception in thread "main" java.lang.NegativeArraySizeException
//end 4

//        case 5
//        short q = 45;
//        int arr1[] = new int[q];
//
//        char ch = 'A';
//        int arr2[] = new int[ch];
//
//        long l = 10;
//        int arr3[] = new int[l];
//        compile time error – incompatible types: possible lossy conversion
//
//        System.out.println(arr1.length);
//        System.out.println(arr2.length);
//        System.out.println(arr3.length);
//
//        In java, we can specify the array size with
//        char, sort, int, byte but we can
//        not with long, double, string and float size.
//
//        end 5


    }}

//IMPORTANCE OF TOSTRING() METHOD
    //if u dnt override code toString()
//    when u print arraylist by list.get(i);
//    Movie@140e19d //sout(object.getclass().getName()+"@"+hashcode())
//    Movie@17327b6
//    Movie@14ae5a5
//    coz it takes toString of object class
//
//    after overriding u get proper readable list
//    ID-1 name-zubeida Release Year-2022
//    ID-5 name-Apharan Release Year-2012
//    ID-3 name-Once time Release Year-2002

