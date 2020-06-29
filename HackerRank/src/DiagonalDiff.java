//
//    import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//    public class DiagonalDiff {
//
//        /*
//         * Complete the 'diagonalDifference' function below.
//         *
//         * The function is expected to return an INTEGER.
//         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
//         */
//
//        public static int diagonalDifference(List<List<Integer>> arr) {
//
//
//            // Write your code here
//
//            int n = arr.size();
//            int i=0;int j=0;int sum=0;int sum2=0;
//                for(i=0;i<n;i++)
//                {
//                    for(j=0;j<n;j++)
//                    {if(i==j)
//                    {sum+=arr[i][j];}
//                    else if(i+j==n)
//                    {sum2=arr[i][j];}
//                    }
//                }
//          //  return sum-sum2;
//
//        }
//
//    }
//}
