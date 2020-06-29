import java.util.Arrays;

//In a warehouse, there is a row of barcodes, where the i-th barcode is barcodes[i].
//       Rearrange the barcodes so that no two adjacent barcodes are equal.
//        You may return any answer, and it is guaranteed an answer exists
//Example 1:
//
//        Input: [1,1,1,2,2,2]
//        Output: [2,1,2,1,2,1]
//        Example 2:
//
//        Input: [1,1,1,1,2,2,3,3]
//        Output: [1,3,1,3,2,1,2,1]


public class DistantBarcodes {
    //last digit is coming wrong
    public static void main(String[] args) {
        int[] input={1,1,1,2,2,2};
        System.out.println("output is ");
        int [] output=DistantBarcodes.rearrangeBarcodes(input);
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]);
    }
       private static  int[] rearrangeBarcodes(int[] barcodes) {
            int n= barcodes.length;
            int [] vis=new int[n];
            int [] res=new int[n];

            for(int i=0;i<n;i++)
                Arrays.fill(vis,0);
           int k=0;
            for(int i=0;i<n;i++)
            { res[0]=barcodes[0];
                //   vis[0]=1;
                if(vis[i]==0)
                { vis[0]=1;
                    for(int j=0;j<n;j++)
                    {  if(vis[j]==0 && (res[k]!=barcodes[j]) )
                    {res[++k]=barcodes[j];
                        //vis[i]=1;
                        vis[j]=1;
                        break;
                    }
                    else continue;
                    }   }
                else continue;
            }
            return res;
       }
    }

