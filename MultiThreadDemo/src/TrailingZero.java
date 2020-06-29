public class TrailingZero {

    public static void main(String args[]) {

        Integer [] a ={7,4,0,3,0,4,1,0};
        boolean flag=true;
        for(int i=0;i<a.length;i++ )
        System.out.print(+a[i]);
    //(Integer.valueOf(a[i]));

        int len=a.length;
        int temp =0;
        for(int i=0;i<a.length-1;i++ )
        {
            int j = i + 1;
            if (a[i] == 0)
               {
                    if (a[j] == 0)
                      {flag=false;temp = i;}
                    else if(a[j] != 0 && flag==true)
                    {a[i] = a[j];
                    a[j] = 0;}
                    else continue;;
                }

            else if(a[i]!=0 && flag==false)
                 {a[temp]=a[j];
                 a[j]=0;}
            else if (a[i]!=0 && flag==true)
                continue;

//            else
//                continue;
        }//for end
        System.out.println(" result");
        for(int i=0;i<a.length;i++ )
            System.out.print(+a[i]);
        }
}
