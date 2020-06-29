import java.util.Scanner;

import static java.lang.System.exit;

//32
public class Fibonacci {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter no of elements?");
//        int no = scan.nextInt();
//        System.out.println("Enter start element");
//        int start = scan.nextInt();
//        int b = 0;

        findFibo(0, 1, 8);
        // findFibo(0,3);
    }

    public static void findFibo(int a, int b, int no) {
        if (no < 0)
           // exit(0);
            return;
        else if(a==0){
            System.out.println(a);
            System.out.println(a+1);
            no--;
            findFibo(1, 1, no);
       }

        else {

            System.out.println(b);
            int c = a + b;
            a = b;
            b = c;
            no = no - 1;
            findFibo(a, b, no);
        }

    }
}
