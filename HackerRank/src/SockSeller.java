import java.util.Scanner;

import java.util.Arrays;
public class SockSeller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of elements?");
        int n = scan.nextInt();
        int[] a = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
        System.out.println("no of pairs "+SockSeller.countPairs(a,n));
    }
        static private int countPairs(int[] a,int n)
        {
            int count=0;int jlast=0;int [] ar2= new int[n];
            Arrays.fill(ar2,1);

            for(int k=0;k<n;k++) ar2[k]=0;

            for(int i=0;i<n;i++)
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]==a[j] && ar2[i]==0 && ar2[j]==0)
                    {
                        //jlast=j;
                        ar2[i]=1;
                        ar2[j]=1;          count++;

                        break;
                    }
                    else continue;
                }
            return count;
        }

    }

