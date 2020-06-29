public class TestExceptionReturn2 {
        public static void main(String args[]) {
            System.out.println("return in main " + someReturnMethod());
        }
//return from finally wil have the highest preference

        public static int someReturnMethod() {
            try {
                int x = 5 / 2 ; return x;       //its return will also be overriden by return in finally
            } catch (ArithmeticException e) {
                System.out.println("in catch"); //print in case of excp
                return 7; //printed            //wnt exe , coz finally return will override
            } finally {
                System.out.println("in finally");// will be executed in exp or no exp
                return 99;
            }
             }

//Also, if u just return from throw and not return from finally
//then will err- return stmnt needed
    }
