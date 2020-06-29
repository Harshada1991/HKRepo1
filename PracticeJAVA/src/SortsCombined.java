public class SortsCombined {
    public static void main(String[] args) {
       int [] input={12,4,3,10,15,6};
        System.out.println("after swap");
//        int a=9; int b=7;
//        swap(a,b);
//        System.out.println(a+""+b);
       // bubbleSort(input);
       // selectionSort(input);
      insertionSort(input);
    }
   //biggest goes to last in first complete iteration
    private  static void bubbleSort(int [] a)
    {  int len=a.length;
        for(int i=0;i<len;i++)
        {     System.out.println("pass I"+i);
            for(int j=i+1;j<len;j++) {
            System.out.println("pass J"+j);
            if (a[j] < a[i])
            // swap(a[j],a[i]);
            {
                int temp = a[j];a[j] = a[i];a[i] = temp;
                System.out.println("after pass i and j"+i+"and" +j);
            } else continue;
        }  }
        System.out.print("final bubble sort");
        for(int i=0;i<len;i++)
            System.out.print(a[i]+" ");
    }
   private static void swap(int a, int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("inside swap"+a+""+b);
    }
    private static void  selectionSort(int [] a)
    {
        int len=a.length;int min=0;int k=0;
        min=a[0];
        for(int i=0;i<len;i++)
        {     System.out.println("pass I"+i);
                min=a[i];
            for(int j=i+1;j<len;j++) {
               // min=a[i];
                if(min>a[j])
                {  System.out.println("pass J"+j);
                    min=a[j];
                 k=j;}
                else continue;

            }if(min!=a[i])
        {a[k]=a[i];
            a[i]=min;}
            else continue;
}
        System.out.print("final selection sort");
        for(int i=0;i<len;i++)
            System.out.print(a[i]+" ");}

    private static void insertionSort(int [] a) {
        int len = a.length;
        int j = 0;
        for (int i = 1; i < len; i++) {
            {System.out.println("pass I" + i);
j=0;
                while(j<i)
                {if(a[j]>a[i])
                    { a[j+1]=a[j];
                    j++;}
                    else j++;
                    a[j+1]=a[i];
                }
           }
     }
        System.out.print("final Insertion sort");
        for(int i=0;i<len;i++)
            System.out.print(a[i]+" ");
    }
}



