import java.util.Arrays;

 class SquareNum {

    public static int squareNum(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Loop through all possible squares
        for (int i = 1; i * i <= n; i++) {
            for (int j = i * i; j <= n; j++) {
                dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(squareNum(9));   // Output: 1
        System.out.println(squareNum(10));  // Output: 2
        System.out.println(squareNum(63));  // Output: 4
    }
}
