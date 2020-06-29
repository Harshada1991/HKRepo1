public class StringMAtch {
    //naive method
    //not KNP algo
        public static void main(String[] args) {
            String str ="abcd";
            String pattern ="cd";
            StringMAtch.find(str,pattern);
        }
        public static void find(String s,String s2){
            int size= s.length();int k=0;int j;int i;
            boolean found=false;
            int smallSize=s2.length();

            for( i=0,j=0;i<size;i++){
                if(j<smallSize)
                {
                    if(s.charAt(i)==s2.charAt(j))
                    {j++;continue;}
                    else
                    {j=0;continue;}
                }
                else if(j==smallSize)
            {found=true; break;}
            }
             if(j==smallSize)
            {found=true;}

            if(found) //times when abcd ,cd// wnt go inside and make found=true
            {
                System.out.println("found");
            }
            else {System.out.println("not found");}

}}
