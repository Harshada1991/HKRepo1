import java.util.regex.*;
public class CountYO {
    /**
         *16
         Given a string, compute recursively (no loops) the number of times
         lowercase "yo" appears in the string.
         <br>
         <br>

         * <b>EXPECTATIONS:</b><br>
         yoYo("xhyoxx") <b>---></b> 1<br>
         yoYo("nyonnyon")<b>---></b> 2 <br>
         yoYo("yo")  <b>---></b> 1 <br>
         */

        public static int yoYo(String str) {
            Pattern p =Pattern.compile("yo");
            Matcher m = p.matcher(str);
            int count=0;
            while(m.find())
            {
                System.out.println("pattern starts from"+ m.start()+
                        "pattern ends at " +
                         + m.end());
                count++;
            }
            System.out.println("count"+count);
           // System.out.println("count"+m.groupCount()); wrong
           // long matches = matcher.results().count(); //for java 9
            return 0;

        }

    public static void main(String[] args) {
        System.out.println("Count of yo  is "+CountYO.yoYo("xhyoxxyo"));
    }
}
