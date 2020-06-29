import java.util.HashSet;
public class FirstRepeatedWord {
    public static void main(String[] args) {
    String s ="harshada good harshada is a is very good girl";
    String[] s2=s.split(" ");

    int n = s2.length;
        System.out.println("before finding after split");
       for(int i=0;i<n;i++){System.out.println(""+s2[i]);}

        String s4 = new String();
       HashSet<String> hs = new HashSet<>();

        for (String s3:s2)
            {if(!(hs.add(s3)))
                {s4= s3; break;}
                else continue;}

        System.out.println("first repeated string is"+s4);
        }

    }


