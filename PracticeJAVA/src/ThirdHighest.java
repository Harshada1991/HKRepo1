public class ThirdHighest {
    public static void main(String[] args) {
        //without n2
        int first,second,third;

        int[] a ={0,7,40,8,1,2};
        int size=a.length;

        System.out.println("size"+size);
        System.out.println("before");
        for(int i=0;i<size;i++)
            System.out.print(a[i]);


        int i=0;
        first=second=third=0;
// int[] a ={9,7,40,8,1,2};
        while(i<size)
        {  int temp;
            if(a[i] > first && second < a[i] )
            {
                third=second;
                second=first;
                first=a[i];
                i++;
            }

            else if(a[i] < first && second < a[i])// && second > third)
            {
                third =second;
                second=a[i];
                i++;
            }

            else if(a[i] < first && second > a[i]  && a[i] > third)
            {
                third =a[i];

                i++;
            }

            else {i++;continue;};

        }
        System.out.println("first highest "+first);
        System.out.println("second highest "+second);
        System.out.println("third highest "+third);

    }}

