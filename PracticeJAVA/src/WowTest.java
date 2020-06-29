public class WowTest{

    public static void main(String[] args) {
        String s1 = new String("pankaj");
        String s2 = new String("PANKAJ");
        System.out.println(s1 = s2);//

        String s3 = "abc";
        StringBuffer s4 = new StringBuffer(s3);
        System.out.println(s3.equals(s4)); //false
        //equals checks "instanceOf" first

        String s5 = "abc";
        String s6 = new String("abc");
        s6.intern();
        System.out.println(s5 ==s6);//false
        s6=s6.intern();             //assigning it back to s6
        System.out.println(s5 ==s6);//true

        System.out.println("case4");
        String s7="khandekar";
        String s8=s7.intern();
        System.out.println(s7==s8);





    }
 }