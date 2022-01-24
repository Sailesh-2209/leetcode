package com.contest.weekly.n277.d;

public class Solution {
    int ans;
    public int maximumGood(int[][] statements) {
        ans = 0;
        dfs("", statements);
        return ans;
    }
    public void dfs(String mask, int[][] statements) {
        int n = statements.length;
        if (mask.length() == n) {
            if (isValid(mask, statements)) {
                int count = 0;
                for (char c : mask.toCharArray())
                    if (c == '1')
                        count++;
                ans = Math.max(ans, count);
            }
        } else {
            dfs(mask + "0", statements);
            dfs(mask + "1", statements);
        }
    }
    public boolean isValid(String mask, int[][] statements) {
        int n = statements.length;
        for (int i = 0; i < n; i++) {
            if (mask.charAt(i) == '1') {
                for (int j = 0; j < n; j++) {
                    if (statements[i][j] == 1 && mask.charAt(j) == '0')
                        return false;
                    if (statements[i][j] == 0 && mask.charAt(j) == '1')
                        return false;
                }
            }
        }
        return true;
    }
}
