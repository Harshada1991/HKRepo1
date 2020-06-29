public class GuessOp2 {
    public static void main(String[] args) {
        int r = new GuessOp2().meth();
        System.out.println(r);                        //30
    }
    public int meth(){
        int i=0;
        try{
            i=100/0;
            return i;
        }catch (Exception e){i=200/0;
        return i;}
       finally {
            return 30;}
        }

    }
