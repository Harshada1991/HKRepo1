public class TestException {
//if exp dosnt occurs in try, then full try and outer code will run,catch wnt run
//if exp  occurs in try, then in try , the code before excp occured runs
// and after that dnt run(inside try), and then goes to catch()
// and outer code will run
 //https://beginnersbook.com/2013/05/flow-in-try-catch-finally/

        public static void main(String args[])
        {  TestException t = new TestException();
            try {
                  int x = 5 / 0;
                System.out.println("hello");//wnt be exe

            }
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException ");
            }
            catch (Exception e) {
                System.out.print("Exception ");
            }

            System.out.println("after exc catch also this codewill be printed ");
            //even after exceptn or no exception
            // last line will execute
        }
    }
