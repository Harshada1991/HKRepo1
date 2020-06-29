public class TestException2 {
        public static void main(String args[]) {
            System.out.println("return in main " + someReturnMethod()); //4
        }

   public static int someReturnMethod()
        {try
            {
                int x = 5 / 0;
            }

            catch (Exception e) {
                return 4;
                       }
            System.out.println("last line");//wnt be printed coz err and out
            return 0;        }
    }


