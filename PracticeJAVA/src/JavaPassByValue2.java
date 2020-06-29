//public class JavaPassByValue2 {
//}
//geekforgeek
class Test
{
    int x;
    Test(int i) { x = i; }
    Test()      { x = 0; }
}

class Main
{
    public static void main(String[] args)
    {
        // t is a reference
        //even for primitive tyoe ,the value remains same,copy of arg is passed
        Test t = new Test(5);

        // Reference is passed and a copy of reference
        // is created in change()
        change(t);

        // New value of x is printed
        System.out.println(t.x);
    }

    // This change() doesn't change the reference, it only
    // changes member of object referred by reference
    public static void change(Test t)
    {
        t.x = 10;
    }
}