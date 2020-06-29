public class MatchingStringP {
    /**
     *
     14.Given 2 arrays that are the same length containing strings, compare the 1st string in one array
     to the 1st string in the other array, the 2nd to the 2nd and so on.
     Count the number of times that the 2 strings are non-empty and start with the same char.
     The strings may be any length, including 0.
     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     matchingChar({"aa", "bb", "cc"}, {"aaa", "xx", "bb"})  <b>---></b> 1<br>
     matchingChar({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) <b>---></b> 2 <br>
     matchingChar({"aa", "bb", "cc"}, {"", "", "ccc"}) <b>---></b> 1 <br>
     */

    public static int matchingChar(String[] a, String[] b)
    {int count=0; //this value is just for initialization
                  //inide for if count changes , it will keep the latest value
        for(int i=0;i<a.length;i++)
        {   String s1=a[i];String s2=b[i];
            // count=0;
            if (s1!=null && s2!=null && s1.charAt(0)== s2.charAt(0))
             {count++;}
             //return count;}
             else {continue;}
            // return count;}

        }

    return count;//return shd be outside for
    }

    public static void main(String args[]){
        String [] a ={"aa", "bb", "cc"};
        String [] b ={"aaa", "xx", "cb"};
        System.out.println("no of matching tuples is= "+matchingChar(a,b));
    }
}
