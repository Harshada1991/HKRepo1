public class DAtaTypes {
    public static void main(String[] args) {


        Integer intobject = new Integer(68);

        // Returns the value of this Integer as an int
        int i = intobject.intValue();
        System.out.println("The integer Value of i = " + i);

        Integer intObj = new Integer("10");
        //use byteValue method of Integer class to convert it into byte type.
        byte b = intObj.byteValue();
        System.out.println(b);
    }
}