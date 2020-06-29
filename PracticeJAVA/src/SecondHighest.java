public class SecondHighest {
    public static void main(String[] args) {
        //without n2
        int first,second;

    int[] a ={0,7,40,8,1,2};
    int size=a.length;

    System.out.println("size"+size);
    System.out.println("before");
    for(int i=0;i<size;i++)
    System.out.print(a[i]);


    int i=0;
    first=second=0;

    while(i<size)
    {  int temp;
       if(a[i] > first && second < a[i])
       {
           second=first;
       first=a[i];
           i++;
//           System.out.println("first highest "+first);
//           System.out.println("second highest "+second);
       }

       else if(a[i] < first && second < a[i]) //wont work if u write "if"
       {
           second=a[i];
           i++;
//           System.out.println("first highest "+first);
//           System.out.println("second highest "+second);
       }

       else {i++;continue;};

    }
        System.out.println("first highest "+first);
        System.out.println("second highest "+second);

}}
