
    import java.util.concurrent.Callable;

    interface Bird {
        Egg lay();
    }

  public  class Chicken implements Bird,Callable{
        public Chicken() {
        }
        Callable bird;
       public  Egg lay(){
           System.out.println("laid egg");
           return new Egg(bird);
       }
       public Integer call(){
           System.out.println("returning bird");
           return 1;
       }

        public static void main(String[] args) throws Exception {
            Chicken chicken = new Chicken();
            System.out.println(chicken instanceof Bird);
        }
    }

    class Egg {
        public Egg(Callable<Bird> createBird) {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }

        public Bird hatch() throws Exception {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
    }

