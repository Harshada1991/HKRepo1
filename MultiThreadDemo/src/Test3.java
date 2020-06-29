class Temp
{
    //without default constructor also its running fine
    private Temp(int data)
    {
        System.out.printf(" Constructor called ");
    }
    protected static Temp create(int data)
    {
        Temp obj = new Temp(data);
        return obj;
    }
    public void myMethod()
    {
        System.out.printf(" Method called ");
    }
}

public class Test3
{
    public static void main(String[] args)
    {
        Temp obj = Temp.create(20);
        obj.myMethod();
        }
        }
