public class TestExceptionReturn {
    public static void main(String args[]) {
        System.out.println("return in main " + someReturnMethod());
    }
//return from finally wil have the highest preference

    public static int someReturnMethod() {
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("in catch"); //print in case of excp
            return 7; //printed            //wnt exe , coz finally return will override
        } finally {
            System.out.println("in finally");// will be executed in exp or no exp
            return 99;
        }

        //writing anything outsid ewill be err- "unreachable stmt"
        //  System.out.println("last line");//wnt be executed if excptn
        //  return 0;        }
    }

}


