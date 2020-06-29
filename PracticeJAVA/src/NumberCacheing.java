public class NumberCacheing {

    public static void main(String[] arr) {
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;//no are cached from -128 to 127
                           //chars 0-127 inclusive
                           //

        if (num1 == num2) {
            System.out.println("num1 == num2");
        } else {
            System.out.println("num1 != num2");
        }
        if (num3 == num4) {
            System.out.println("num3 == num4");
        } else {
            System.out.println("num3 != num4");
        }
    }
}
//
//if you want to make use of this cache,
// also use valueOf() method.
