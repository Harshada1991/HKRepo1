public class Testor {
    public static void main(String[] args) {

    A  a= new A();
        System.out.println("a.test()="+a.test());// from finally



}}
    class  A{

        int a=9;
        int b=0;
        public int test() {
            try {
                System.out.println("" + a / b);
            } catch (ArithmeticException e) {
                System.out.println("comes to catch");
                return 0; //overridden by finally return
            } finally {
                System.out.println("comes to finally");
                return 97;  //overridden by finally return

            }
        }
}

