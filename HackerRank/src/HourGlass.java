public class HourGlass {

  //  https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

    public static void main(String[] args) {
        int [][] arr=
                {{1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0,},
                        {1,1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}};
        System.out.println("lagest sum hougass is "+  hourglassSum(arr));
    }
    static int hourglassSum(int[][] arr) {
        int sum=0;int sum2=0;
        int len =arr.length;
        for(int i=0;i<len-2;i++)
        {
            for(int j=0;j<len-2;j++)

            {   sum2=sum;
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+
                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                sum=Math.max(sum2,sum);
            }
            // sum=Math.max(sum2,sum);
        }
        return sum;


    }
}
