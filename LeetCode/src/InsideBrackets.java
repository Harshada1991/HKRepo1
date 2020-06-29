public class InsideBrackets {
    /** 19
     *

     Given a string that contains a single pair of brackets, compute recursively a new string made of
     only of the brackets and their contents, so "xyz[abc]123" yields "[abc]".

     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     insideBrackets("xyz[abc]123") <b>---></b> [abc]<br>
     insideBrackets("x[hello]") <b>---></b> [hello] <br>
     insideBrackets("[xy]1") <b>---></b> [xy] <br>
     */
    public static void main(String[] args) {
        InsideBrackets.insideBracketsMethod("xyz[abc]123");
    }
    public static void insideBracketsMethod(String str) {
    if(str.charAt(str.length()-str.length())!='[' && str.length()!=0)
        insideBracketsMethod(str.substring(1));
    else if(str.charAt(str.length()-str.length())=='[' && str.length()!=0)
    {
        //insideBrackets(str.substring(1));
        while(str.charAt(str.length()-str.length())!=']' && str.length()!=0)
        {System.out.println(str.charAt(str.length()-str.length()));
        str=str.substring(1);}
    }
    }


}
