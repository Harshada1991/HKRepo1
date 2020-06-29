import java.util.Scanner;

public class RightShiftString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the strings");
        String s = scan.next();
        System.out.println(s);
        System.out.println("Shift right by?");
        int n = scan.nextInt();
        RightShiftString.rightShift(s,n);
    }
    public static void rightShift(String s, int a)
    {
        int len=s.length();
        for(int i=0;i<len-a;i++){}
    }
}
