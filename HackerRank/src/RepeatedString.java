public class RepeatedString {
    public static void main(String[] args) {
        String  s="abc";
        System.out.println(RepeatedString.repeatedStringMethod(s,10));
    }


        // Complete the repeatedString function below.
        static long repeatedStringMethod(String s, long n) {
            int n2= (int)n;
            StringBuilder s2= new StringBuilder(n2);
            int j=0,i=0;long acount=0;
            int cnt=s.length();
            while(i<n2 && j< cnt)
            {if(j==cnt-1)
            {s2.append(s.charAt(j));
                j=0;}
            else
            {s2.append(s.charAt(j));j++;
            }i++;}
i=0;
            while( i<n2)
            {if(s2.charAt(i)=='a')
                acount++;
            i++;
            }
            return acount;

        }
}
