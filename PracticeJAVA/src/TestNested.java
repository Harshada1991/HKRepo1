

    public class TestNested {
        public static void main(String args[])
        {
            class inner1 {
                String s = "hi inner";

                public void display() {
                    System.out.println("in inner class(non static)");
                }
            }

            inner1 inner = new inner1();
            inner.display();
            System.out.println(inner.s);
        }  // main

        class nested
        {
            String s = "hi inner";

            public void display() {
                System.out.println("in inner class(non static)");
            }

        }

}// outermost class
