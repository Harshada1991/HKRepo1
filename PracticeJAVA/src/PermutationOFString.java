public class PermutationOFString {


    private static void getPerm(String perm, String input) {

        boolean A[]=new boolean[26];
        //boolean array having all values as false
        //
         if(input.length()==0)
             System.out.println(perm);

         else {
             for (int i=0;i<input.length();i++) {

                 if(A[input.charAt(i)-'a']==false)
                 {getPerm(perm+input.charAt(i), input.substring(0,i)+
                                 input.substring(i+1,input.length()));}
                A[input.charAt(i)-'a']=true;

             }
         }
    }

    public static void main(String[] args) {
        String input=new String("abca");//works only in lowercase
        //.ignorecase

        String perm="";
 System.out.println("new string is");

        PermutationOFString.getPerm(perm,input);

    }
}
