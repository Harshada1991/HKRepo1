public class GuessOp {
    public static void main(String[] args) {
        int a[]={3,7,2};
        int b[]=a;
        int sum=0;
        for(int j=0;j<2;++j) //or j++ will fetch same ans //if ,4 then u will get output
            {   sum+=(a[j+1]) + (b[j+1]);
                System.out.println(sum);
            }
    }
}
