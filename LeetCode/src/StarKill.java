public class StarKill {
    /**
         *
         Return a version of the given string, where for every star (*)
         in the string the star and the chars immediately to its left and right are gone.
         So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
         <br>

         * <b>EXPECTATIONS:</b><br>
         starKill("cd*zq")  <b>---></b>"cq"<br>
         starKill("ab**cd")    <b>---></b> "ad" <br>
         starKill("wacy*xko") <b>---></b> "wacko" <br>
         */

        public static String KillMethod(String str) {
           // char [] c1=str
            StringBuilder s2= new StringBuilder("");
            for(int i=0;i<str.length();i++) {
                char c = str.charAt(i);
                if (c =='*')
                    {
                   s2.deleteCharAt(s2.length()-1);
                   i++;//to leave the next char after '*'
                    }
                   else{ s2.append(c);}
                }
            return s2.toString();
        }
       //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
        public static void main(String args[]){
            System.out.println( KillMethod("hkjka*dsjj*j"));
        }
}
