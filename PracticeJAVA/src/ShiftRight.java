public class ShiftRight {

    public static void main(String[] args) {

        int[] a = {3, 4, 6, 7};
        System.out.println("before");
        for (int z : a
        ) {
            System.out.print(z);
        }

        int n = a.length;
        int temp = a[n - 1];
//        for (i = n - 1; i >= 0; i--)
//            a[i] = a[i - 1];
//  a[0] = temp;

        System.out.println("after");
        for (int z : a
        ) {
            System.out.print(z);
        }
    }
}