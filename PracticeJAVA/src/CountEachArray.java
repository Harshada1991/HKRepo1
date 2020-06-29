import java.util.Arrays;

public class CountEachArray {
    public static void main(String[] args) {
        int[] arr= {1,3,2,4,6,1,2,0,3,0};

        Arrays.sort(arr);
        for(int a:arr){
            System.out.print(a);}

        int len= arr.length;
        int cnt=0;

        for (int i=0;i<len-1;i++)
        {
            if(arr[i+cnt]==i)
            {
                cnt=0;
                {while(arr[i]==arr[i+cnt]    )
                {cnt++;
                }
                }
                arr[i]=cnt;

            }
            else{arr[i]=0;}
        }
        System.out.println("after counting, array is");
        for(int a:arr){
            System.out.print(a);}
        }


}
