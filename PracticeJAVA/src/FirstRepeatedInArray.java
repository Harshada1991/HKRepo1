public class FirstRepeatedInArray {
    //without n2 complexity, do in single loop
    // without any additional dataStructure
    public static void main(String[] args) {
        char[] a= {'a','z','h','o','q','e','c','z'};
        int size=a.length;int i=0;
        int[] a2 = new int[26];
    int j;
        while(i<size)
            {
                char c= a[i];
                j=c-'a';
                if(a2[j]==0)
                {a2[j]=1;i++;}
                else {System.out.println("first repeated char is"+c);
                        break;}
         }
}}











