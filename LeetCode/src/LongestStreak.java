public class LongestStreak {
       /**
         * 15
         Given a string, return the length of the longest streak of the same chars in the string.

         <br>
         <br>

         * <b>EXPECTATIONS:</b><br>
         longestStreak("hayyeu") <b>---></b> 2<br>
         longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
         longestStreak("")  <b>---></b> 0 <br>
         */

        public static int longestStreakMethod(String str) {

            int count1=0; int count2=0;
            for(int i=0;i<str.length();i++) {
               count2=0;
                for (int j = i + 1; j < str.length(); j++)
                {
                   // count2=0;
                    if (str.charAt(i) == str.charAt(j)) {
                      count2++;
                    } else break;
                 }
                if(count1<(count2+1))
                    count1=count2+1;//added 1 coz we didnt
                                    // count one occurence of j
            }

            return count1;
        }
public static void main(String args[]){
    System.out.println("longest streak is= "+longestStreakMethod("haaaaayeeeeeu"));

        }
    }
