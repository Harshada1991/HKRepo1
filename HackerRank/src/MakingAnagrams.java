import java.util.Arrays;

public class MakingAnagrams {

    public static void main(String[] args) {
        int k=MakingAnagrams.makeAnagram("harsh","harzz");
        System.out.println("k is"+k);
    }
        // Complete the makeAnagram function below.
        static int makeAnagram(String a, String b) {
            int n= a.length();int k=0;int count=0;int i=0;int i1=0;
            int n1= b.length();

            char[] c =a.toCharArray();
            char[] d =b.toCharArray();

            Arrays.sort(c);Arrays.sort(d);

            while(i<n-1)
            {
                while(i1<n1-1)
                {
                    if(c[i]>d[i1])
                    {i1++;}
                    if(c[i]==d[i1])
                    {i++;i1++;k++;}

                    else if(c[i]<d[i1])
                    {i++;}
                }
            }
            count =(n-k)+(n1-k);
            return count;

        }


}
