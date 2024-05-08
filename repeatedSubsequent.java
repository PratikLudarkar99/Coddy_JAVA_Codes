class RepeatedSubseq {
    public static String repeatedSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Find the longest common subsequence
        StringBuilder sb = new StringBuilder();
        int i = n, j = n;
        while (i > 0 && j > 0) {
            if (dp[i][j] == dp[i - 1][j]) {
                i--;
            } else if (dp[i][j] == dp[i][j - 1]) {
                j--;
            } else {
                sb.append(s.charAt(i - 1));
                i--;
                j--;
            }
        }

        // Reverse the string to get the result
        String result = sb.reverse().toString();
        return result.length() >= 2 ? result : "";
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubseq("XYBAXB")); // Output: "XB"
        System.out.println(repeatedSubseq("BANAN"));  // Output: "AN"
        System.out.println(repeatedSubseq("XYZX"));   // Output: ""
        System.out.println(repeatedSubseq("XYXYX"));  // Output: "XYX"
        System.out.println(repeatedSubseq("TOKTOK")); // Output: "TOK"
    }
}
