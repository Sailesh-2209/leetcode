package com.contest.biweekly.n70.b;

public class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n = differences.length;
        int a = 0, ans = Integer.MIN_VALUE;
        for (int diff : differences) {
            a += diff;
            ans = Math.max(ans, a);
            a = Math.max(a, 0);
        }
        int b = 0, bns = Integer.MAX_VALUE;
        for (int diff : differences) {
            b += diff;
            bns = Math.min(bns, b);
            b = Math.min(b, 0);
        }
        int max = Math.max(ans, Math.abs(bns));
        return Math.max(0, (upper - lower + 1) - max);
    }
}