import java.util.Stack;

public class Test_ {
    public static void main(String[] args) {
        Test_ test_ = new Test_();
        int m = 3;
        int n = 3;

        int[][] dp = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            dp[1][i] += dp[1][i-1] + 1;
        }

    }


}
