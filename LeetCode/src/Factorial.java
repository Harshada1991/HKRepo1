import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("enter no");
        int no = scan.nextInt();
        System.out.println("the factorial of"+no+" is= "+factorial(no));

    }
 private static int factorial(int no)
        {

            if(no==0)
            { return 1 ;}
            else  return no *(factorial(no-1));
        }

}
