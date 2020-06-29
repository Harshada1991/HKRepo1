public class JumpClouds {
    public static void main(String[] args) {

    }

    static int jumpingOnClouds(int[] c) {
        int len = c.length;
        int cnt = 0;
        int cnt2 = 0;

        for (int i = 0; i < len; i++) {
            if (c[i] == 0 && i != len - 1) {
                cnt2++;
                if (i < len - 1 && c[i + 1] == 1) {
                    cnt = (cnt2 / 2) + cnt;
                    cnt2 = 0;
                } else if (i == len - 1 && c[i] == 0) cnt++;
            } else if (c[i] == 1)
                cnt++;

        }
        return cnt;
    }
}
// giving put (stdin)
//6
//0 0 0 1 0 0
//Your Output (stdout)
//2
//Expected Output   
//3
