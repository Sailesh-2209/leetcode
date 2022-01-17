package com.contest.weekly.n276.c;

public class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = Math.max((i + 1 < n) ? dp[i + 1] : 0, questions[i][0] + ((i + questions[i][1] + 1 < n) ? dp[i + questions[i][1] + 1] : 0));
        }
        return dp[0];
    }
}
